import java.util.Arrays;

public class NumberChecker {

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

    // Method to store digits of the number in an array (from left to right)
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

    // Method to check if a number is a Duck number
    // A Duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is Armstrong number
    public static boolean isArmstrong(int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        // reconstruct the original number from digits
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        return sum == number;
    }

    // Method to find largest and second largest elements in digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest elements in digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // example number; you can change or take input

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = digitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));

        System.out.println("Is Armstrong Number? " + (isArmstrong(digits) ? "Yes" : "No"));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second largest digit: " + (largest[1] == Integer.MIN_VALUE ? "Not found" : largest[1]));

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second smallest digit: " + (smallest[1] == Integer.MAX_VALUE ? "Not found" : smallest[1]));
    }
}
