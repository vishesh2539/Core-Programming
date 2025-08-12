import java.util.Scanner;

public class FactorOperations {

    // Method to find factors and return them as an array
    public static int[] findFactors(int number) {
        // First loop: count the factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array to hold factors
        int[] factors = new int[count];
        
        // Second loop: store the factors in the array
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sumSquares = 0;
        for (int factor : factors) {
            sumSquares += Math.pow(factor, 2);
        }
        return sumSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Find factors
            int[] factors = findFactors(number);

            // Display factors
            System.out.print("Factors: ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();

            // Calculate and display sum
            int sum = findSum(factors);
            System.out.println("Sum of factors: " + sum);

            // Calculate and display product
            long product = findProduct(factors);
            System.out.println("Product of factors: " + product);

            // Calculate and display sum of squares
            double sumSquares = findSumOfSquares(factors);
            System.out.println("Sum of squares of factors: " + sumSquares);
        }

        scanner.close();
    }
}
