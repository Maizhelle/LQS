//THIS IS TESTING GROUND, i js wanna see if gagana yung code
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ronin Perez", "2026-0001");
        Reservation reservation = new Reservation(student, "2026-06-15", 9, 2);
        
        // prints the thing yes
        System.out.println("=== Library Reservation System Test ===");
        System.out.println("Student Name: " + reservation.getStudent().getName());
        System.out.println("Student ID:   " + reservation.getStudent().getId());
        System.out.println("Reservation Code: " + reservation.getReservationCode());
        System.out.println("Date:         " + reservation.getDate());
        System.out.println("Start Time:   " + reservation.getTime() + ":00");
        System.out.println("Duration:     " + reservation.getDuration() + " hours");
        System.out.println("Status:       " + reservation.getStatus());
    }
}