import java.util.Scanner;

public class NaturalNumberSum {

    // Method to calculate sum using loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        // Validate input and display result
        if (n > 0) {
            int result = calculateSum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}
