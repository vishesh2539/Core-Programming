import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate the exception (without handling)
    static void generateException(String text) {
        // Trying to parse a non-numeric string to integer
        int number = Integer.parseInt(text); 
        System.out.println("Parsed number: " + number);
    }

    // Method to handle the exception using try-catch
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catching any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input as string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First, call method that generates the exception
        System.out.println("\n=== Generating NumberFormatException ===");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Now, call method that handles the exception
        System.out.println("\n=== Handling NumberFormatException ===");
        handleException(text);

        sc.close();
    }
}
