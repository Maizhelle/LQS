public class LibraryManager {
    private Room[] rooms;
    private Reservation stagedReservation; 

    // constructor for 4 rooms
    public LibraryManager(){
        rooms = new Room[4]; 
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i + 1);
        }
        stagedReservation = null;
    }


    public void createReservation(String studentName, String studentId, String date, int time, int duration, int numberOfStudents) {
        Student student = new Student(studentName, studentId);
        this.stagedReservation = new Reservation(student, date, time, duration, numberOfStudents);
        this.stagedReservation.setStatus("PENDING");
    }

    // trig when done is clicked 
    public boolean confirmReservationToRoom(int roomNumber) {
        if (stagedReservation == null) {
            return false;
        }

        if (roomNumber >= 1 && roomNumber <= rooms.length) {
            Room targetroom = rooms[roomNumber - 1]; 

            if (targetroom.isUnderCapacity(stagedReservation.getNumberOfStudents())) {
                stagedReservation.setStatus("ACTIVE");
                targetroom.addReservation(stagedReservation); 
                stagedReservation = null;
                return true;
            }
        }
        return false;
    }

    // getters
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