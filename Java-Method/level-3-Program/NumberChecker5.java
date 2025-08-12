import java.util.Arrays;

public class NumberChecker5 {

    // Method to find factors of a number and return as an array
    public static int[] findFactors(int number) {
        if (number <= 0) return new int[0]; // no factors for non-positive numbers
        int count = 0;
        // Count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        // Store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find greatest factor using factors array
    public static int greatestFactor(int[] factors) {
        if (factors.length == 0) return -1;
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find sum of factors using factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors using factors array
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cubes of factors using factors array
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Helper method: sum of proper divisors (exclude the number itself)
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

    // Check if number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) == number;
    }

    // Check if number is an abundant number
    public static boolean isAbundantNumber(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) > number;
    }

    // Check if number is a deficient number
    public static boolean isDeficientNumber(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) < number;
    }

    // Helper method: factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Check if number is a strong number (sum of factorial of digits == number)
    public static boolean isStrongNumber(int number) {
        int sumFact = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sumFact += factorial(digit);
            temp /= 10;
        }
        return sumFact == number;
    }

    public static void main(String[] args) {
        int number = 28; // Example number; you can change or take input

        System.out.println("Number: " + number);

        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        int greatest = greatestFactor(factors);
        System.out.println("Greatest factor: " + greatest);

        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        long product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        double productCubes = productOfCubes(factors);
        System.out.println("Product of cubes of factors: " + productCubes);

        System.out.println("Is Perfect Number? " + (isPerfectNumber(number) ? "Yes" : "No"));
        System.out.println("Is Abundant Number? " + (isAbundantNumber(number) ? "Yes" : "No"));
        System.out.println("Is Deficient Number? " + (isDeficientNumber(number) ? "Yes" : "No"));
        System.out.println("Is Strong Number? " + (isStrongNumber(number) ? "Yes" : "No"));
    }
}
