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
        this.date = date;
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

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    //basta 7 am to 5 pm lang :p
    public void setTime(int time){
        if (time >=7 && time <= 17){
            this.time = time;
        } else {
            throw new IllegalArgumentException("Time must be between 7 AM and 5PM.");
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
