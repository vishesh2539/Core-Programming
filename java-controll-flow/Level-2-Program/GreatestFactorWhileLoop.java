/*Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a variable counter and assign counter = number - 1; Use the while loop till the counter is equal to 1.
Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
 */

import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Initialize greatestFactor to 1 (1 is always a factor)
        int greatestFactor = 1;

        // Initialize counter to number - 1
        int counter = number - 1;

        // Loop while counter is >= 1
        while (counter >= 1) {
            // Check if counter is a factor of number
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Exit loop once greatest factor is found
            }
            counter--; // Decrement counter
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);

        input.close();
    }
}
