import java.util.Scanner;

public class EnterYourName {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.println("Enter your full name. . .\n ");
        
        // Read the user's input 
        System.out.println("First Name: ");
        String firstName = scanner.next();

        System.out.println("Last Name: ");
        String lastName = scanner.next();
        
        // Print a greeting message
        System.out.println("Hello, " + firstName + " " + lastName + "!");
        
        // Close the scanner
        scanner.close();
    }
}
