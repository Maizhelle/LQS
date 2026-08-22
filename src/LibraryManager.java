import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;

public class LibraryManager {
    private static final int STORAGE_VERSION = 1;
    private static final Path STORAGE_FILE = Path.of(System.getProperty("user.home"), "LQS",
            "reservations.dat");
    private Room[] rooms;
    private Reservation stagedReservation; 

    public LibraryManager(){
        rooms = new Room[5]; 
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i + 1);
        }
        stagedReservation = null;
        loadReservations();
    }


    public void createReservation(String studentName, String studentId, String department,
            String activity, String date, int time, int duration, int numberOfStudents) {
        createReservation(studentName, studentId, department, activity, date, time, duration,
            numberOfStudents, "STUDENT");
        }

        public void createReservation(String studentName, String studentId, String department,
            String activity, String date, int time, int duration, int numberOfStudents,
            String reserverType) {
            createReservation(studentName, studentId, department, activity, date, time, 0, duration,
                numberOfStudents, reserverType);
            }

            public void createReservation(String studentName, String studentId, String department,
                String activity, String date, int time, int minute, int duration, int numberOfStudents,
                String reserverType) {
        boolean generalId = !"STUDENT".equals(reserverType);
        Student student = new Student(studentName, studentId, department, generalId);
        if (hasStudentReservation(student.getId())) {
            throw new IllegalArgumentException("This student ID already has a reservation.");
        }
        this.stagedReservation = new Reservation(student, date, time, minute, duration,
            numberOfStudents, activity, reserverType);
        this.stagedReservation.setStatus("PENDING");
    }

    public boolean confirmReservationToRoom(int roomNumber, String librarianName) {
        if (stagedReservation == null) {
            return false;
        }

        if (roomNumber >= 1 && roomNumber <= rooms.length) {
            Room targetroom = rooms[roomNumber - 1]; 

            if (hasReservationAtTime(targetroom, stagedReservation)) {
                throw new IllegalArgumentException("There is already a reservation at this date and time in Room " + roomNumber + ".");
            }

            if (targetroom.isUnderCapacity(stagedReservation.getNumberOfStudents())) {
                stagedReservation.setLibrarianName(librarianName);
                boolean canActivate = targetroom.getActiveReservation() == null
                        && !stagedReservation.getScheduledStart().isAfter(LocalDateTime.now());
                stagedReservation.setStatus(canActivate ? "ACTIVE" : "QUEUED");
                targetroom.addReservation(stagedReservation); 
                stagedReservation = null;
                saveReservations();
                return true;
            }
        }
        return false;
    }

    private boolean hasStudentReservation(String studentId) {
        for (Room room : rooms) {
            for (Reservation reservation : room.getReservationQueue()) {
                if (reservation.getStudent().getId().equals(studentId)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasReservationAtTime(Room room, Reservation reservationToCheck) {
        for (Reservation reservation : room.getReservationQueue()) {
            if ("COMPLETED".equals(reservation.getStatus())) {
                continue;
            }
            boolean overlaps = reservationToCheck.getScheduledStart().isBefore(reservation.getScheduledEnd())
                    && reservation.getScheduledStart().isBefore(reservationToCheck.getScheduledEnd());
            if (overlaps) {
                return true;
            }
        }
        return false;
    }

    public Reservation advanceRoomQueue(int roomNumber) {
        Room room = getRoom(roomNumber);
        if (room == null) {
            return null;
        }

        Reservation activeReservation = room.getActiveReservation();
        if (activeReservation != null) {
            activeReservation.setStatus("COMPLETED");
        }
        Reservation nextReservation = room.activateNextReservation();
        if (activeReservation != null || nextReservation != null) {
            saveReservations();
        }
        return nextReservation;
    }
    public boolean removeReservation(int roomNumber, Reservation reservationToRemove) {
        Room room = getRoom(roomNumber);
        if (room == null || reservationToRemove == null
                || !room.getReservationQueue().contains(reservationToRemove)) {
            return false;
        }

        boolean wasActive = reservationToRemove == room.getActiveReservation();
        if (wasActive) {
            reservationToRemove.setStatus("COMPLETED");
        }
        room.removeReservation(reservationToRemove);
        if (wasActive) {
            room.activateNextReservation();
        }
        saveReservations();
        return true;
    }

    private void loadReservations() {
        if (!Files.exists(STORAGE_FILE)) {
            return;
        }

        try (DataInputStream input = new DataInputStream(Files.newInputStream(STORAGE_FILE))) {
            if (input.readInt() != STORAGE_VERSION || input.readInt() != rooms.length) {
                return;
            }
            Room[] loadedRooms = new Room[rooms.length];
            for (int i = 0; i < loadedRooms.length; i++) {
                loadedRooms[i] = new Room(i + 1);
            }
            for (int roomIndex = 0; roomIndex < rooms.length; roomIndex++) {
                int roomNumber = input.readInt();
                int reservationCount = input.readInt();
                if (roomNumber != roomIndex + 1 || reservationCount < 0 || reservationCount > 100) {
                    return;
                }
                for (int reservationIndex = 0; reservationIndex < reservationCount; reservationIndex++) {
                    Reservation reservation = readReservation(input);
                    if (!"COMPLETED".equals(reservation.getStatus())) {
                        loadedRooms[roomIndex].addReservation(reservation);
                    }
                }
            }
            rooms = loadedRooms;
        } catch (IOException | RuntimeException ex) {
            System.err.println("Could not load saved reservations: " + ex.getMessage());
        }
    }

    private void saveReservations() {
        Path temporaryFile = STORAGE_FILE.resolveSibling("reservations.dat.tmp");
        try {
            Files.createDirectories(STORAGE_FILE.getParent());
        } catch (IOException ex) {
            System.err.println("Could not prepare reservation storage: " + ex.getMessage());
            return;
        }
        try (DataOutputStream output = new DataOutputStream(Files.newOutputStream(temporaryFile))) {
            output.writeInt(STORAGE_VERSION);
            output.writeInt(rooms.length);
            for (Room room : rooms) {
                output.writeInt(room.getRoomNumber());
                int activeReservationCount = 0;
                for (Reservation reservation : room.getReservationQueue()) {
                    if (!"COMPLETED".equals(reservation.getStatus())) {
                        activeReservationCount++;
                    }
                }
                output.writeInt(activeReservationCount);
                for (Reservation reservation : room.getReservationQueue()) {
                    if (!"COMPLETED".equals(reservation.getStatus())) {
                        writeReservation(output, reservation);
                    }
                }
            }
        } catch (IOException ex) {
            System.err.println("Could not save reservations: " + ex.getMessage());
            return;
        }

        try {
            Files.move(temporaryFile, STORAGE_FILE, StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException ex) {
            try {
                Files.move(temporaryFile, STORAGE_FILE, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException fallbackEx) {
                System.err.println("Could not finalize saved reservations: " + fallbackEx.getMessage());
            }
        }
    }

    private void writeReservation(DataOutputStream output, Reservation reservation) throws IOException {
        output.writeUTF(reservation.getReservationCode());
        output.writeUTF(reservation.getStudent().getName());
        output.writeUTF(reservation.getStudent().getId());
        output.writeUTF(reservation.getStudent().getDepartment());
        output.writeUTF(reservation.getReserverType());
        output.writeUTF(reservation.getActivity());
        output.writeUTF(reservation.getLibrarianName() == null ? "" : reservation.getLibrarianName());
        output.writeUTF(reservation.getDate());
        output.writeInt(reservation.getTime());
        output.writeInt(reservation.getMinute());
        output.writeInt(reservation.getDuration());
        output.writeInt(reservation.getNumberOfStudents());
        output.writeUTF(reservation.getStatus());
        output.writeLong(reservation.getActiveSince());
    }

    private Reservation readReservation(DataInputStream input) throws IOException {
        String reservationCode = readText(input, 32);
        String studentName = readText(input, 50);
        String studentId = readText(input, 30);
        String department = readText(input, 80);
        String reserverType = readText(input, 10);
        if (!("STUDENT".equals(reserverType) || "FACULTY".equals(reserverType)
                || "ASP".equals(reserverType))) {
            throw new IOException("Invalid reserver type");
        }
        Student student = new Student(studentName, studentId, department, !"STUDENT".equals(reserverType));
        String activity = readText(input, 80);
        String librarianName = readText(input, 50);
        String date = readText(input, 10);
        int time = input.readInt();
        int minute = input.readInt();
        int duration = input.readInt();
        int numberOfStudents = input.readInt();
        String status = readText(input, 10);
        long activeSince = input.readLong();
        if (reservationCode.isEmpty() || activity.isEmpty() || date.isEmpty()) {
            throw new IOException("Required reservation data is missing");
        }
        if (librarianName.isEmpty()) {
            librarianName = null;
        }
        if (activeSince < 0 || time < 7 || time > 17 || minute < 0 || minute > 30
                || (minute != 0 && minute != 30) || duration < 1 || duration > 3
                || numberOfStudents < 1 || numberOfStudents > 10) {
            throw new IOException("Invalid reservation data");
        }
        Reservation reservation = Reservation.restore(reservationCode, student, reserverType, activity,
                librarianName, date, time, minute, duration, numberOfStudents, status, activeSince);
        if (!"QUEUED".equals(status) && !"ACTIVE".equals(status)) {
            throw new IOException("Invalid reservation status");
        }
        try {
            reservation.getScheduledStart();
            reservation.getScheduledEnd();
        } catch (RuntimeException ex) {
            throw new IOException("Invalid reservation date", ex);
        }
        return reservation;
    }

    private String readText(DataInputStream input, int maximumLength) throws IOException {
        String value = input.readUTF();
        if (value.length() > maximumLength || value.codePoints().anyMatch(Character::isISOControl)) {
            throw new IOException("Invalid reservation text");
        }
        return value;
    }

    public Reservation getStagedReservation() {
        return stagedReservation;
    }

    public Room getRoom(int roomNumber) {
        if (roomNumber >= 1 && roomNumber <= rooms.length) {
            return rooms[roomNumber - 1];
        }
        return null;
    }
}