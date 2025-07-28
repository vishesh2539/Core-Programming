/*Write a program to check whether a number is positive, negative, or zero.
Hint => 
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero. 
 */
import java.util.Scanner; // Import Scanner to read user input

public class NumberCheck {
    public static void main(String[] args) {

        // Create Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Declare variable to store the number
        int number;

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextInt(); // Read the input

        // Check and print whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner
        input.close();
    }
}
