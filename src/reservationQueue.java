/**
 *
 * @author jayjay
 */
import java.util.LinkedList;
import java.util.Queue;

public class reservationQueue {
    private Queue<Reservation> queue;

    public reservationQueue() {
        queue = new LinkedList<>();
    }

    // Add a reservation to the queue
    public void reserve(Reservation reservation) {
        queue.offer(reservation);
        System.out.println(reservation.getStudent().getName() + "'s reservation added. Code: " 
            + reservation.getReservationCode());
    }

    // Serve (remove) the next reservation in line
    public Reservation serveNext() {
        Reservation next = queue.poll();
        if (next != null) {
            next.setStatus("active");
            System.out.println("Now serving: " + next.getStudent().getName() 
                + " (Code: " + next.getReservationCode() + ")");
        } else {
            System.out.println("Queue is empty.");
        }
        return next;
    }

    // Peek at the next reservation without removing it
    public Reservation peekNext() {
        return queue.peek();
    }

    // Cancel a reservation by its code
    public boolean cancel(String reservationCode) {
        return queue.removeIf(r -> r.getReservationCode().equals(reservationCode));
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void printQueue() {
        System.out.println("Current reservation queue:");
        for (Reservation r : queue) {
            System.out.println(" - " + r.getStudent().getName() 
                + " | " + r.getDate() 
                + " " + r.getTime() + ":00" 
                + " (" + r.getDuration() + "hr)" 
                + " | Code: " + r.getReservationCode() 
                + " | Status: " + r.getStatus());
        }
    }
}