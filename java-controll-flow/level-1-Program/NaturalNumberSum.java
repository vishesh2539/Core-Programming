/*Write a program to check for the natural number and write the sum of n natural numbers 
Hint => 
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2 
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise 
The number ___ is not a natural numbe
 */
import java.util.Scanner; // Import Scanner for user input

public class NaturalNumberSum {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Declare variable for the input number
        int number;

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check if the number is a natural number (greater than 0)
        if (number > 0) {
            // Calculate the sum of n natural numbers using the formula
            int sum = number * (number + 1) / 2;

            // Output the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If number is not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the Scanner
        input.close();
    }
}
