/*Write a program to find the sum of numbers until the user enters 0
Hint => 
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value
 */
import java.util.Scanner; // Import Scanner for user input

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create Scanner object

        double total = 0.0; // Variable to store the total sum
        double number;      // Variable to store each number entered by the user

        System.out.println("Enter numbers to sum (enter 0 to stop):");

        // Read the first input before starting the loop
        number = input.nextDouble();

        // Loop until user enters 0
        while (number != 0) {
            total += number; // Add current number to total
            System.out.print("Enter another number (0 to stop): ");
            number = input.nextDouble(); // Get next input
        }

        // Display the total after loop ends
        System.out.println("The total sum is: " + total);

        // Close the scanner
        input.close();
    }
}
