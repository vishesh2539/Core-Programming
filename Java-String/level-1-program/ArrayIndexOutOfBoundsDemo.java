import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate the exception (without handling)
    static void generateException(String[] names) {
        // Accessing index larger than array length
        System.out.println("Name at index 10: " + names[10]);
    }

    // Method to handle the exception using try-catch
    static void handleException(String[] names) {
        try {
            System.out.println("Name at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catching any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size and elements from user
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // First, call method that generates the exception
        System.out.println("\n=== Generating ArrayIndexOutOfBoundsException ===");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Now, call method that handles the exception
        System.out.println("\n=== Handling ArrayIndexOutOfBoundsException ===");
        handleException(names);

        sc.close();
    }
}
