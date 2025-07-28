/*Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
 */

import java.util.Scanner; // Import Scanner class to read user input

public class SmallestChecker {
    public static void main(String[] args) {

        // Create a Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare three integer variables
        int number1, number2, number3;

        // Ask the user to enter three numbers
        System.out.print("Enter the first number: ");
        number1 = input.nextInt(); // Read first number

        System.out.print("Enter the second number: ");
        number2 = input.nextInt(); // Read second number

        System.out.print("Enter the third number: ");
        number3 = input.nextInt(); // Read third number

        // Check if the first number is smaller than both second and third
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Print the result
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close the Scanner object
        input.close();
    }
}
