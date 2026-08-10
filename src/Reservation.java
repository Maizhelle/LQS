/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcija
 */
import java.util.UUID; 
// UUID is used to generate unique identifiers for reservations :>

public class Reservation {
    private String reservationCode;
    private Student student; // this uses the student.java
    private String date;
    private int time; //uses 24 hour format, 17 for 5pm 
    private int duration; //1-3 hours
    private String status; //pending, active, done

    //constructorrrrrrr
    public Reservation(Student student, String date, int time, int duration){
        this.student = student;
        this.date = date;
        setTime(time);
        setDuration(duration);
        this.reservationCode = generateRandomCode();
        this.status = "pending"; //cause when reservation is made its in pending, duh?
    }

    //lowk dont 100% understand this yet, I js searched it up </3
    private String generateRandomCode() {
        return UUID.randomUUID().toString().substring(0,8).toUpperCase();
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
