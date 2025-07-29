/*Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
 */

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input from user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        // Initialize counter
        int count = 0;

        // Special case if number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                number = number / 10; // Remove last digit
                count++;              // Increment count
            }
        }

        // Display the result
        System.out.println("Number of digits: " + count);

        input.close();
    }
}
