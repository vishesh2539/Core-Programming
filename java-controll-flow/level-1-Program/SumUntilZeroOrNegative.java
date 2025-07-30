/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
 */

import java.util.Scanner; // Import Scanner for input

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object for user input

        double total = 0.0; // Variable to store the sum
        double number;      // Variable to store current user input

        System.out.println("Enter numbers to sum (enter 0 or negative number to stop):");

        while (true) { // Infinite loop
            number = input.nextDouble(); // Read user input

            // Check if the number is 0 or negative
            if (number <= 0) {
                break; // Exit the loop
            }

            total += number; // Add number to total if positive
        }

        // Print the total sum after loop breaks
        System.out.println("The total sum is: " + total);

        input.close(); // Close the Scanner
    }
}
