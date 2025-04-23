import java.util.ArrayList;
import java.util.Scanner;

class Guest {
    String name;
    String phone;
    String email;

    public Guest(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

class Room {
    int roomNumber;
    String type;
    double price;
    boolean isOccupied;
    boolean underMaintenance;

    public Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isOccupied = false;
        this.underMaintenance = false;
    }
}

class Booking {
    Guest guest;
    Room room;
    int numberOfNights;
    double totalPayment;
    String bookingReference;
    String checkInDate;
    String checkOutDate;

    public Booking(Guest guest, Room room, int numberOfNights, double totalPayment, String bookingReference, String checkInDate, String checkOutDate) {
        this.guest = guest;
        this.room = room;
        this.numberOfNights = numberOfNights;
        this.totalPayment = totalPayment;
        this.bookingReference = bookingReference;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
}

public class NaijaComfortInn {
    static ArrayList<Room> rooms = new ArrayList<>();
    private static Booking[] bookings;
    private static String newEmail;

    public static void main(String[] args) {
        initializeRooms();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("WELCOME TO NAIJA COMFORT INN!");
            System.out.println("1. Book room");
            System.out.println("2. View booking");
            System.out.println("3. Edit profile");
            System.out.println("4. Check room availability");
            System.out.println("5. Payment status");
            System.out.println("6. Cancel booking");
            System.out.println("7. View all available rooms");
            System.out.println("8. View Notification");
            System.out.println("9. Exit");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    bookRoom(input);
                    break;
                case 2:
                    viewBooing(input);
                    break;
                case 3:
                    Editprofile(input);
                    break;
                case 4:
                    checkrooomavailability(input);
                    break;
                case 5:
                    paymentstatus(input);
                    break;
                case 6:
                    canclebooking(input);
                    break;
                case 7:
                    viewallavailableroom(input);
                    break;
                case 8:
                    viewnotification(input);
                    break;
                case 9:
                    System.out.println("Thank you for choosing Naija Comfort Inn! Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void viewnotification(Scanner input) {

    }

    private static void viewallavailableroom(Scanner input) {
    }

    private static void canclebooking(Scanner input) {
    }

    private static void paymentstatus(Scanner input) {
    }

    private static void checkrooomavailability(Scanner input) {
        System.out.print("Enter room type to check availability (Single/Double/Suite): ");
        String type = input.nextLine();
        for (Room room : rooms) {
            if (room.type.equalsIgnoreCase(type) && !room.isOccupied && !room.underMaintenance ) {
                System.out.print("Room" + room.roomNumber + "is available: ");
                return;
            }
        }
        System.out.print("no available of the selected type");
    }


    private static void Editprofile(Scanner input) {
        System.out.println("Enter your booking reference");
        String bookingReference = input.nextLine();
        for (Booking booking : bookings) {
            if(booking.bookingReference.equals(bookingReference)) {
                System.out.print("Enter new phone number");
                String newPhone = input.nextLine();
                booking.guest.phone = newPhone;
                booking.guest.email = newEmail;
                System.out.println("profile updated successfully!");
                return;
            }
        }
        System.out.print("booking not found!");



    }

    private static void viewBooing(Scanner input) {
        System.out.print("Enter booking reference:");
        String bookingReference = input.nextLine();
        
        for(Booking booking : bookings) {
            if(booking.bookingReference.equals(bookingReference)) {
                System.out.print("booking Details: ");
                System.out.println("guest name" + booking.guest.name);
                System.out.print("room number" + booking.room.roomNumber);
                System.out.print("room type" + booking.room.type);
                System.out.print("number of night" + booking.numberOfNights);
                System.out.print("Total payment" + booking.totalPayment);
                System.out.println("check in Date" + booking.checkInDate);
                System.out.println("check out Date" + booking.checkOutDate);
                return;
            }
        }
        System.out.println("booking not found");
        
    }

    private static void initializeRooms() {
        rooms.add(new Room(101, "Single", 50.0));
        rooms.add(new Room(102, "Double", 80.0));
        rooms.add(new Room(103, "Suite", 150.0));
        // Add more rooms as needed
    }

    public static void bookRoom(Scanner input) {
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your phone number:");
        String phone = input.nextLine();
        System.out.println("Enter your email address:");
        String email = input.nextLine();
        Guest guest = new Guest(name, phone, email);

        System.out.println("Select room type (Single/Double/Suite):");
        String type = input.nextLine();
        System.out.println("Enter number of nights:");
        int numberOfNights = input.nextInt();
        input.nextLine();

        Room selectedRoom = null;
        for (Room room : rooms) {
            if (room.type.equalsIgnoreCase(type) && !room.isOccupied && !room.underMaintenance) {
                selectedRoom = room;
                break;
            }
        }

        if (selectedRoom != null) {
            double totalPayment = selectedRoom.price * numberOfNights;
            Booking booking = new Booking(guest, selectedRoom, numberOfNights, totalPayment, "REF123", "2025-01-14", "2025-01-15");
            selectedRoom.isOccupied = true;
            System.out.println("Room booked successfully!");
            System.out.println("Booking Reference: " + booking.bookingReference);
            System.out.println("Total Payment: " + booking.totalPayment);
        } else {
            System.out.println("No available room of the selected type.");
        }
    }

}

