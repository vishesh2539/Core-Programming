/*Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 
 */

import java.util.Scanner;

public class FactorialCalculatorForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a natural number
        System.out.print("Enter a natural number to find its factorial: ");
        int number = input.nextInt();

        // Check if the input is a natural number (positive integer)
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the factorial result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
