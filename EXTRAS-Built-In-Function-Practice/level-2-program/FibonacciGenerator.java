import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        // Take input from the user
        int n = takeInput("Enter the number of terms for the Fibonacci sequence: ");

        // Print Fibonacci sequence
        printFibonacci(n);
    }

    // Function to take integer input
    public static int takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    // Function to calculate and print Fibonacci sequence
    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
