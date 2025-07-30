/*Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication, and division assign the result to a variable, and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication, and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
 */


import java.util.Scanner; // Import Scanner class to take user input

public class BasicCalculator {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables to store two numbers
        double number1, number2;

        // Ask user to enter the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble(); // Read first number

        // Ask user to enter the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble(); // Read second number

        // Perform arithmetic operations
        double sum = number1 + number2;          // Addition
        double difference = number1 - number2;   // Subtraction
        double product = number1 * number2;      // Multiplication
        double quotient = 0.0;

        // Handle division separately to avoid divide-by-zero error
        if (number2 != 0) {
            quotient = number1 / number2;        // Division
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Display the results
        System.out.println("The addition, subtraction, multiplication, and division value of two numbers " +
                number1 + " and " + number2 + " is:");

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + difference);
        System.out.println("Multiplication = " + product);

        // Only print division result if number2 is not zero
        if (number2 != 0) {
            System.out.println("Division = " + quotient);
        }

        // Close the Scanner object
        input.close();
    }
}

