import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                int totalRooms = 10;
        int occupiedRooms = 7;
        
        System.out.print("Choose a room type (1-3): ");
        int roomChoice = scanner.nextInt();
        
        double roomPrice = 0;
        String roomType = "";
        
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
        
        System.out.println("You selected: " + roomType);
        System.out.println("Price per night: PHP " + roomPrice);
        
                System.out.print("How many rooms would you like to book? ");
        int numberOfRooms = scanner.nextInt();

        System.out.print("How many days will you stay? ");
        int numberOfDays = scanner.nextInt();

                int availableRooms = totalRooms - occupiedRooms;

        if (numberOfRooms > availableRooms) {
            System.out.println("\nSorry! Only " + availableRooms + " room(s) are available.");
            scanner.close();
            return;
        }

                double totalAmount = roomPrice * numberOfRooms * numberOfDays;

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
        
               scanner.close();
    }
}
