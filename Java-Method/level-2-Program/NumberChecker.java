import java.util.Scanner;

public class NumberChecker {

    // Method to check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers:
    // return 1 if number1 > number2
    // return 0 if number1 == number2
    // return -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Check each number and print accordingly
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                // Positive or zero
                if (isEven(num)) {
                    System.out.println(num + " is positive and even");
                } else {
                    System.out.println(num + " is positive and odd");
                }
            } else {
                // Negative number
                System.out.println(num + " is negative");
            }
        }

        // Compare first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[numbers.length - 1] + ")");
        } else if (comparisonResult == 0) {
            System.out.println("First element (" + numbers[0] + ") is equal to last element (" + numbers[numbers.length - 1] + ")");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[numbers.length - 1] + ")");
        }

        scanner.close();
    }
}
