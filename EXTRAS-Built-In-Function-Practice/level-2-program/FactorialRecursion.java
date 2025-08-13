import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        // Take input from user
        int number = takeInput("Enter a number to calculate factorial: ");

        // Calculate factorial recursively
        long fact = factorial(number);

        // Display result
        displayResult(number, fact);
    }

    // Function to take integer input
    public static int takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // base case
        }
        return n * factorial(n - 1);
    }

    // Function to display the result
    public static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
