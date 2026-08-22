import java.util.LinkedList;
import java.util.Collections;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    private int roomNumber;
    private final int capacity = 10;
    private LinkedList<Reservation> reservationQueue;

    public Room (int roomNumber) {
        this.roomNumber = roomNumber;
        this.reservationQueue = new LinkedList<>();
    }

    public int getCurrentHeadcount() {
        int total = 0;
        for (Reservation r : reservationQueue) {
            if (!"COMPLETED".equals(r.getStatus())) {
                total += r.getNumberOfStudents();
            }
        }
        return total;
    }

    public Reservation getActiveReservation() {
        for (Reservation reservation : reservationQueue) {
            if ("ACTIVE".equals(reservation.getStatus())) {
                return reservation;
            }
        }
        return null;
    }

    public Reservation activateNextReservation() {
        if (getActiveReservation() != null) {
            return getActiveReservation();
        }

        for (Reservation reservation : reservationQueue) {
                if ("QUEUED".equals(reservation.getStatus())
                    && !reservation.getScheduledStart().isAfter(LocalDateTime.now())) {
                reservation.setStatus("ACTIVE");
                return reservation;
            }
        }
        return null;
    }

    public boolean isUnderCapacity(int incomingGroupSize) {
        return (getCurrentHeadcount() + incomingGroupSize) <= capacity;
    }

    public boolean addReservation(Reservation reservation) {
        if (isUnderCapacity(reservation.getNumberOfStudents())) {
            int insertionIndex = reservationQueue.size();
            for (int i = 0; i < reservationQueue.size(); i++) {
                Reservation queuedReservation = reservationQueue.get(i);
                if ("QUEUED".equals(queuedReservation.getStatus())
                        && reservation.getScheduledStart().isBefore(queuedReservation.getScheduledStart())) {
                    insertionIndex = i;
                    break;
                }
            }
            reservationQueue.add(insertionIndex, reservation);
            return true;
        }
        return false; 
    }

    public boolean removeReservation(Reservation reservation) {
        return reservationQueue.remove(reservation);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Reservation> getReservationQueue() {
        return Collections.unmodifiableList(reservationQueue);
    }
}