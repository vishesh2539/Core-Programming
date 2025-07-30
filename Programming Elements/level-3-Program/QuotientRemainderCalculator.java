/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
 */

import java.util.Scanner; // Import Scanner class to take user input

public class QuotientRemainderCalculator {
    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // Declare variables to store two numbers
        int number1, number2;

        // Ask user to enter the first number (dividend)
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        // Ask user to enter the second number (divisor)
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        // Check for division by zero
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Calculate quotient using division operator
            int quotient = number1 / number2;

            // Calculate remainder using modulus operator
            int remainder = number1 % number2;

            // Display results
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                    " of two numbers " + number1 + " and " + number2);
        }

        // Close the Scanner object
        input.close();
    }
}
