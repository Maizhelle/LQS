import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.security.SecureRandom;
import java.io.Serializable;
import java.util.Set;

public class Reservation implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final String CODE_CHARACTERS = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";
    private static final SecureRandom CODE_RANDOM = new SecureRandom();
    private static final int CODE_LENGTH = 12;
    private static final Set<String> VALID_STATUSES = Set.of("PENDING", "QUEUED", "ACTIVE", "COMPLETED");

    private String reservationCode;
    private Student student;
    private String reserverType;
    private String activity;
    private String librarianName;
    private String date;
    private int time; 
    private int minute;
    private int duration; 
    private int numberOfStudents; 
    private String status;
    private long activeSince;

    public Reservation(Student student, String date, int time, int duration, int numberOfStudents, String activity) {
        this(student, date, time, duration, numberOfStudents, activity, "STUDENT");
    }

    public Reservation(Student student, String date, int time, int minute, int duration,
            int numberOfStudents, String activity, String reserverType) {
        this.student = student;
        setReserverType(reserverType);
        this.librarianName = null;
        setActivity(activity);
        setDate(date);
        setTime(time, minute);
        setDuration(duration);
        setNumberOfStudents(numberOfStudents);
        this.reservationCode = generateRandomCode();
        this.status = "PENDING";
        this.activeSince = 0L;
    }

    public Reservation(Student student, String date, int time, int duration, int numberOfStudents,
            String activity, String reserverType) {
        this(student, date, time, 0, duration, numberOfStudents, activity, reserverType);
    }

    static Reservation restore(String reservationCode, Student student, String reserverType,
            String activity, String librarianName, String date, int time, int minute,
            int duration, int numberOfStudents, String status, long activeSince) {
        Reservation reservation = new Reservation();
        reservation.reservationCode = reservationCode;
        reservation.student = student;
        reservation.reserverType = reserverType;
        reservation.activity = activity;
        reservation.librarianName = librarianName;
        reservation.date = date;
        reservation.time = time;
        reservation.minute = minute;
        reservation.duration = duration;
        reservation.numberOfStudents = numberOfStudents;
        reservation.status = status;
        reservation.activeSince = activeSince;
        return reservation;
    }

    private Reservation() {
    }

    private String generateRandomCode() {
        StringBuilder code = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(CODE_CHARACTERS.charAt(CODE_RANDOM.nextInt(CODE_CHARACTERS.length())));
        }
        return code.toString();
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        if (numberOfStudents >= 1 && numberOfStudents <= 10) {
            this.numberOfStudents = numberOfStudents;
        } else {
            throw new IllegalArgumentException("Headcount must be between 1 and 10.");
        }
    }


    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public Student getStudent() {
        return student;
    }

    public String getReserverType() {
        return reserverType;
    }

    public void setReserverType(String reserverType) {
        if (reserverType == null || !(reserverType.equals("STUDENT")
                || reserverType.equals("FACULTY") || reserverType.equals("ASP"))) {
            throw new IllegalArgumentException("Reserver must be STUDENT, FACULTY, or ASP.");
        }
        this.reserverType = reserverType;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        if (activity == null || activity.trim().isEmpty()) {
            throw new IllegalArgumentException("Room activity/purpose is required.");
        }
        String normalizedActivity = activity.trim();
        if (normalizedActivity.length() > 80) {
            throw new IllegalArgumentException("Room activity/purpose must be 80 characters or fewer.");
        }
        if (normalizedActivity.codePoints().anyMatch(Character::isISOControl)) {
            throw new IllegalArgumentException("Room activity/purpose cannot contain control characters.");
        }
        this.activity = normalizedActivity;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        if (librarianName == null || librarianName.trim().isEmpty()) {
            throw new IllegalArgumentException("Librarian name is required before confirming the reservation.");
        }
        String normalizedName = librarianName.trim();
        if (normalizedName.length() > 50) {
            throw new IllegalArgumentException("Librarian name must be 50 characters or fewer.");
        }
        if (normalizedName.codePoints().anyMatch(Character::isISOControl)) {
            throw new IllegalArgumentException("Librarian name cannot contain control characters.");
        }
        this.librarianName = normalizedName;
    }

    public String getDate() {
        return date;
    }

    public boolean isScheduledForToday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);
        return LocalDate.parse(date, formatter).equals(LocalDate.now());
    }

    public LocalDateTime getScheduledStart() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);
        return LocalDate.parse(date, formatter).atTime(time, minute);
    }

    public void setDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate parsedDate = LocalDate.parse(date, formatter);
            if (parsedDate.isBefore(LocalDate.now())) {
                throw new IllegalArgumentException("Date cannot be in the past.");
            }
            this.date = date;
            if (time >= 7 && time <= 17) {
                validateStartTime();
            }
        } catch (DateTimeParseException | NullPointerException e) {
            throw new IllegalArgumentException("Date must use the format MM/DD/YYYY and be a valid calendar date.");
        }
    }

    public int getTime() {
        return time;
    }

    public int getMinute() {
        return minute;
    }

    public void setTime(int time){
        setTime(time, 0);
    }

    public void setTime(int time, int minute){
        if (time >= 7 && time <= 17 && (minute == 0 || minute == 30)
                && !(time == 17 && minute > 0)){
            this.time = time;
            this.minute = minute;
            validateStartTime();
        } else {
            throw new IllegalArgumentException("Time must be between 7:00 AM and 5:00 PM.");
        }
    }

    private void validateStartTime() {
        LocalDate scheduledDate = LocalDate.parse(date,
                DateTimeFormatter.ofPattern("MM/dd/uuuu")
                        .withResolverStyle(ResolverStyle.STRICT));
        LocalDateTime scheduledStart = scheduledDate.atTime(time, minute);
        if (!scheduledStart.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Start time must be later than the current time.");
        }
    }

    public int getDuration() {
        return duration;
    }

    public LocalDateTime getScheduledEnd() {
        return getScheduledStart().plusHours(duration);
    }

    public void setDuration(int duration) {
        if (duration >=1 && duration <= 3){
            this.duration = duration;
        } else {
            throw new IllegalArgumentException("Duration must be between 1 and 3 hours.");  
        }
    }

    public String getStatus() {
        return status;
    }

    public long getActiveSince() {
        return activeSince;
    }

    public void setActiveSince(long activeSince) {
        if (activeSince < 0) {
            throw new IllegalArgumentException("Active start time cannot be negative.");
        }
        this.activeSince = activeSince;
    }

    public void setStatus(String status) {
        if (status == null || !VALID_STATUSES.contains(status)) {
            throw new IllegalArgumentException("Status must be PENDING, QUEUED, ACTIVE, or COMPLETED.");
        }
        this.status = status;
        if ("ACTIVE".equals(status) && activeSince == 0L) {
            activeSince = System.currentTimeMillis();
        }
        if (!"ACTIVE".equals(status)) {
            activeSince = 0L;
        }
    }

}
