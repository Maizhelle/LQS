public class LibraryManager {
    private Room[] rooms;
    private Reservation[] stagedreservation; //temp variable

    // constructor for 4 rooms
    public LibraryManager(){
        room = new Room[4]
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i + 1);
        }
        stagedReservation = null;
    }

    // make reservation, set to pending 
    public void createReservation(Student Id, String date, int time, int duration) {
        Student student = new Student(Name, Id);
        this.stagedreservation = new Reservation(student, date, time, duration);
        this.stagedreservation.setStatus("PENDING");
    }

    // trig when done is clicked 
    public boolean confirmReservationToRoom(int roomNumber) {
        if (stagedReservation == null) {
            return false;
        }

        if (roomNumber >= 1 && roomNumber <= rooms.length) {
            Room  targetroom = rooms[roomNumber - 1];

            if (targetRoom.isUnderCapacity()) {
                stagedReservation.setStatus("ACTIVE");
                stagedRoom.addReservation(stagedReservavtion);
                stagedReservation = null;
                return true;
            }
        }
        return false;
    }

    //geetterereasdsad
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
