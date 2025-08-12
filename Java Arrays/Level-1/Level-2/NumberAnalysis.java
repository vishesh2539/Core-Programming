import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nAnalysis of each number:");
        for (int number : numbers) {
            if (number > 0) {
                System.out.print("The number " + number + " is positive and ");
                if (number % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (number < 0) {
                System.out.println("The number " + number + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[4];

        System.out.println("\nComparison between first and last elements:");
        if (first == last) {
            System.out.println("The first and last numbers are equal.");
        } else if (first > last) {
            System.out.println("The first number is greater than the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
