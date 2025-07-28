/*Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
 */
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = input.nextInt();

        // Check if the input is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize factorial result
            long factorial = 1;
            int counter = 1;

            // Use while loop to compute factorial
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            // Print the factorial result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
