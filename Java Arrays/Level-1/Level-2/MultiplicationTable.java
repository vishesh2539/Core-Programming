import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Fill array with multiplication results
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        scanner.close();
    }
}
