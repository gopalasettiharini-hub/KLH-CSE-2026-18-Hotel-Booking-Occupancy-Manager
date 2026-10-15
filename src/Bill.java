import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                int totalRooms = 10;
        int occupiedRooms = 7;

occupiedRooms += numberOfRooms;

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