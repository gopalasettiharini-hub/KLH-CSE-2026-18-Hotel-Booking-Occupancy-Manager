import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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
                scanner.close(); // Clean up resource on failure
                return;
        }
                System.out.println("You selected: " + roomType);
        System.out.println("Price per night: PHP " + roomPrice);
        
        scanner.close(); 
    }
}
