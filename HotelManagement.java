import java.util.Scanner;

public class HotelManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Hotel information
        int totalRooms = 50;
        int occupiedRooms = 20;

        System.out.println("=================================");
        System.out.println("     WELCOME TO GRAND HOTEL");
        System.out.println("=================================");

        // Customer details
        System.out.print("Please enter your name: ");
        String customerName = scanner.nextLine();

        // Display room options
        System.out.println("\nAvailable Room Types:");
        System.out.println("1. Standard Room  (₹2000 per day)");
        System.out.println("2. Deluxe Room    (₹3000 per day)");
        System.out.println("3. Suite Room     (₹5000 per day)");

        System.out.print("Choose a room type (1-3): ");
        int roomChoice = scanner.nextInt();

        double roomPrice;
        String roomType;

        // Determine room type and price
        switch (roomChoice) {
            case 1:
                roomType = "Standard Room";
                roomPrice = 2000;
                break;
            case 2:
                roomType = "Deluxe Room";
                roomPrice = 3000;
                break;
            case 3:
                roomType = "Suite Room";
                roomPrice = 5000;
                break;
            default:
                System.out.println("Invalid room selection. Please try again.");
                scanner.close();
                return;
        }

        // Booking details
        System.out.print("How many rooms would you like to book? ");
        int numberOfRooms = scanner.nextInt();

        System.out.print("How many days will you stay? ");
        int numberOfDays = scanner.nextInt();

        // Check room availability
        int availableRooms = totalRooms - occupiedRooms;

        if (numberOfRooms > availableRooms) {
            System.out.println("\nSorry! Only " + availableRooms + " room(s) are available.");
            scanner.close();
            return;
        }

        // Calculate bill
        double totalAmount = roomPrice * numberOfRooms * numberOfDays;

        // Membership level based on spending
        String membership;

        if (totalAmount < 5000) {
            membership = "Basic";
        } else if (totalAmount < 10000) {
            membership = "Silver";
        } else if (totalAmount < 15000) {
            membership = "Gold";
        } else {
            membership = "Platinum";
        }

        // Update occupancy
        occupiedRooms += numberOfRooms;

        // Booking summary
        System.out.println("\n=================================");
        System.out.println("          BOOKING CONFIRMED");
        System.out.println("=================================");
        System.out.println("Guest Name      : " + customerName);
        System.out.println("Room Type       : " + roomType);
        System.out.println("Rooms Booked    : " + numberOfRooms);
        System.out.println("Duration        : " + numberOfDays + " day(s)");
        System.out.println("Total Bill      : ₹" + totalAmount);
        System.out.println("Membership Tier : " + membership);
        System.out.println("Rooms Available : " + (totalRooms - occupiedRooms));
        System.out.println("Thank you for choosing Grand Hotel!");

        scanner.close();
    }
}