/*Create a program to find the power of a number.
Hint => 
Get integer input for two variables - number and power and check for positive integer
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
 */
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input base number
        System.out.print("Enter the base number (positive integer): ");
        int number = input.nextInt();

        // Input power
        System.out.print("Enter the power (positive integer): ");
        int power = input.nextInt();

        // Check if inputs are positive
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers (power can be zero or more).");
        } else {
            int result = 1;  // Initialize result to 1

            // Calculate power using for loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Print the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        input.close();
    }
}
