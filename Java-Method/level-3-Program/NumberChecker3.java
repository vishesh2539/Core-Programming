import java.util.Arrays;

public class NumberChecker3 {

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

    // Method to store the digits of the number in a digits array (left to right)
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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number using the digits array
    // A duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 1221; // You can change this or take user input

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = digitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversed));

        System.out.println("Are original and reversed arrays equal? " + (arraysEqual(digits, reversed) ? "Yes" : "No"));

        System.out.println("Is Palindrome? " + (isPalindrome(digits) ? "Yes" : "No"));

        System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));
    }
}
