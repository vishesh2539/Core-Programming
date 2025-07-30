/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
 */

import java.util.Scanner; // Import Scanner to take user input

public class DivisibleByFive {
    public static void main(String[] args) {

        // Create a Scanner object for reading input from the user
        Scanner input = new Scanner(System.in);

        // Declare variable to store the input number
        int number;

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextInt(); // Read the number

        // Check if the number is divisible by 5 using the modulus operator
        // If remainder is 0, then it's divisible
        boolean isDivisible = number % 5 == 0;

        // Print the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close the Scanner object
        input.close();
    }
}
