import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;  // Base case
        }
        return n + recursiveSum(n - 1);
    }

    // Formula method to find sum of n natural numbers
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Input is not a natural number. Exiting...");
            scanner.close();
            return;
        }

        // Calculate sum recursively
        int sumRecursive = recursiveSum(n);

        // Calculate sum using formula
        int sumFormula = formulaSum(n);

        // Display both results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare results
        if (sumRecursive == sumFormula) {
            System.out.println("Both results are equal. The calculation is correct.");
        } else {
            System.out.println("Results do not match. There is an error.");
        }

        scanner.close();
    }
}
