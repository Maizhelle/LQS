import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.UUID;

public class Reservation {
    private String reservationCode;
    private Student student;
    private String date;
    private int time; 
    private int duration; 
    private int numberOfStudents; 
    private String status;

    public Reservation(Student student, String date, int time, int duration, int numberOfStudents) {
        this.student = student;
        setDate(date);
        setTime(time);
        setDuration(duration);
        setNumberOfStudents(numberOfStudents);
        this.reservationCode = generateRandomCode();
        this.status = "pending";
    }

    private String generateRandomCode() {
        return UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }

    // Getters and Setters
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


    //GETTERSSS N SETTERS
    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
        return LocalDate.parse(date, formatter).atTime(time, 0);
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

    //basta 7 am to 5 pm lang :p
    public void setTime(int time){
        if (time >=7 && time <= 17){
            this.time = time;
            validateStartTime();
        } else {
            throw new IllegalArgumentException("Time must be between 7 AM and 5PM.");
        }
    }

    private void validateStartTime() {
        LocalDate scheduledDate = LocalDate.parse(date,
                DateTimeFormatter.ofPattern("MM/dd/uuuu")
                        .withResolverStyle(ResolverStyle.STRICT));
        LocalDateTime scheduledStart = scheduledDate.atTime(time, 0);
        if (!scheduledStart.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Start time must be later than the current time.");
        }
    }

    public int getDuration() {
        return duration;
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

    public void setStatus(String status) {
        this.status = status;
    }

}
