import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate the exception (without handling)
    static void generateException(String text) {
        // Start index greater than end index → IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle the exception using try-catch
    static void handleException(String text) {
        try {
            // This will cause IllegalArgumentException
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catching any other runtime exceptions just in case
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First, call method that generates the exception
        System.out.println("\n=== Generating IllegalArgumentException ===");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Now, call method that handles the exception
        System.out.println("\n=== Handling IllegalArgumentException ===");
        handleException(text);

        sc.close();
    }
}
 