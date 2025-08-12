import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate the Exception (without handling)
    static void generateException(String text) {
        // Accessing an index beyond the length of the string
        System.out.println("Character at position 100: " + text.charAt(100));
    }

    // Method to handle the Exception using try-catch
    static void handleException(String text) {
        try {
            // Accessing an index beyond the length of the string
            System.out.println("Character at position 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First, call method that generates the exception
        System.out.println("\n=== Generating StringIndexOutOfBoundsException ===");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Now, call method that handles the exception
        System.out.println("\n=== Handling StringIndexOutOfBoundsException ===");
        handleException(text);

        sc.close();
    }
}
