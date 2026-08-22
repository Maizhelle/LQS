

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();
        boolean running = true;

        System.out.println("=== Interactive Library Queue System Test ===");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Create New Reservation (Stage it)");
            System.out.println("2. View Staged Reservation");
            System.out.println("3. Confirm Staged Reservation to a Room (1-5)");
            System.out.println("4. View Room Queues & Status");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Date (MM/DD/YYYY, e.g., 06/06/2026): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter Time (7 to 17, e.g., 10 for 10 AM): ");
                    int time = scanner.nextInt();
                    System.out.print("Enter Duration (1-3 hours): ");
                    int duration = scanner.nextInt();
                    System.out.print("Enter Number of Students / Headcount (1-10): ");
                    int headcount = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    try {
                        manager.createReservation(name, id, date, time, duration, headcount);
                        System.out.println(">> Success! Reservation staged. Review it before sending to a room.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(">> Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    Reservation staged = manager.getStagedReservation();
                    if (staged == null) {
                        System.out.println(">> No reservation currently staged.");
                    } else {
                        System.out.println("\n--- Staged Reservation Details ---");
                        System.out.println("Code: " + staged.getReservationCode());
                        System.out.println("Student: " + staged.getStudent().getName() + " (ID: " + staged.getStudent().getId() + ")");
                        System.out.println("Date/Time: " + staged.getDate() + " at " + staged.getTime() + ":00 (" + staged.getDuration() + " hours)");
                        System.out.println("Headcount: " + staged.getNumberOfStudents() + " students");
                        System.out.println("Status: " + staged.getStatus());
                    }
                    break;

                case 3:
                    System.out.print("Enter Room Number to send staged reservation to (1-5): ");
                    int roomNum = scanner.nextInt();
                    boolean confirmed = manager.confirmReservationToRoom(roomNum);
                    if (confirmed) {
                        Room room = manager.getRoom(roomNum);
                        Reservation queuedReservation = room.getReservationQueue().getLast();
                        System.out.println(">> Success! Reservation pushed to Room " + roomNum
                                + " (Status: " + queuedReservation.getStatus() + ").");
                    } else {
                        System.out.println(">> Failed. Either no reservation is staged, room exceeds capacity of 10 people, or invalid room number.");
                    }
                    break;

                case 4:
                    for (int i = 1; i <= 5; i++) {
                        Room room = manager.getRoom(i);
                        String roomName = i == 4 ? "Research Room" : i == 5 ? "Multimedia Room" : "Room " + i;
                        System.out.println("\n" + roomName + " (Total People: " + room.getCurrentHeadcount() + "/" + room.getCapacity() + ")");
                        if (room.getReservationQueue().isEmpty()) {
                            System.out.println("   [Queue is empty]");
                        } else {
                            for (Reservation r : room.getReservationQueue()) {
                                System.out.println("   - [" + r.getReservationCode() + "] " + r.getStudent().getName() 
                                                   + " (Group size: " + r.getNumberOfStudents() + ") | Status: " + r.getStatus());
                            }
                        }
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting test menu. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}