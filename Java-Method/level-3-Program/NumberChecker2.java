import java.util.Arrays;

public class NumberChecker2 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits of the number in an array (left to right)
    public static int[] digitsArray(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of the digits using Math.pow()
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if the number is a Harshad number
    // A number is Harshad if number % sumOfDigits == 0
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumDigits = sumOfDigits(digits);
        if (sumDigits == 0) return false; // avoid division by zero
        return number % sumDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    // Returns a 2D array: first column is digit (0-9), second column is frequency
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;  // digit
            freq[i][1] = 0;  // frequency initialized to 0
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int number = 1729; // You can change this or take user input

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = digitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        System.out.println("Is Harshad Number? " + (isHarshadNumber(number, digits) ? "Yes" : "No"));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1] + " time(s)");
            }
        }
    }
}
