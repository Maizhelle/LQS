import java.util.ArrayList;

public class LibraryManager {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void addStudent(Student student) {
        if (student != null && findStudent(student.getId()) == null)
            students.add(student);
    }

    public void addReservation(Reservation reservation) {
        if (reservation != null) {
            reservations.add(reservation);
            if (findStudent(reservation.getStudent().getId()) == null)
                students.add(reservation.getStudent());
        }
    }

    public Student findStudent(String id) {
        for (Student s : students)
            if (s.getId().equalsIgnoreCase(id)) return s;
        return null;
    }

    public Reservation findReservation(String code) {
        for (Reservation r : reservations)
            if (r.getReservationCode().equalsIgnoreCase(code)) return r;
        return null;
    }

    public void updateReservationStatus(String code, String status) {
        Reservation r = findReservation(code);
        if (r != null) r.setStatus(status);
    }

    public void cancelReservation(String code) {
        Reservation r = findReservation(code);
        if (r != null) r.setStatus("cancelled");
    }

    public void displayReservations() {
        for (Reservation r : reservations) {
            System.out.println(
                r.getReservationCode() + " | " +
                r.getStudent().getName() + " | " +
                r.getStudent().getId() + " | " +
                r.getDate() + " | " +
                r.getTime() + ":00 | " +
                r.getDuration() + " hour(s) | " +
                r.getStatus()
            );
        }
    }

    public int getStudentCount() {
        return students.size();
    }

    public int getReservationCount() {
        return reservations.size();
    }
}
    
