import java.util.Arrays;

public class NumberChecker4 {

    // Helper method: extract digits (left to right)
    public static int[] digitsArray(int number) {
        number = Math.abs(number);
        if (number == 0) return new int[]{0};
        int count = 0, temp = number;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Check if number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Check if number is neon number
    // Neon number: sum of digits of square equals number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Check if number is spy number
    // Spy number: sum of digits == product of digits
    public static boolean isSpy(int number) {
        int[] digits = digitsArray(number);
        int sum = 0;
        int product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    // Check if number is automorphic number
    // Automorphic number: square ends with the number itself
    public static boolean isAutomorphic(int number) {
        long square = (long) number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Check if number is buzz number
    // Buzz number: divisible by 7 or ends with 7
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int[] testNumbers = {7, 153, 19, 5, 21, 1729, 370, 25};

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Is Prime? " + (isPrime(num) ? "Yes" : "No"));
            System.out.println("Is Neon? " + (isNeon(num) ? "Yes" : "No"));
            System.out.println("Is Spy? " + (isSpy(num) ? "Yes" : "No"));
            System.out.println("Is Automorphic? " + (isAutomorphic(num) ? "Yes" : "No"));
            System.out.println("Is Buzz? " + (isBuzz(num) ? "Yes" : "No"));
            System.out.println("----------------------------");
        }
    }
}
