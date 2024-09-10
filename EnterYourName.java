import java.util.Scanner;

public class EnterYourName {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        
        // Read the user's input (name)
        String name = scanner.nextLine();
        
        // Print a greeting message
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner
        scanner.close();
    }
}
