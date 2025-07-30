/* Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter.*/

import java.util.Scanner; // Import Scanner for input

public class RocketLaunchCountdown {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the countdown start number
        System.out.print("Enter the countdown starting number: ");
        int counter = input.nextInt(); // Store input in counter variable

        // Start while loop and count down to 1
        while (counter >= 1) {
            System.out.println(counter); // Print the current counter value
            counter--; // Decrement counter by 1
        }

        // Print launch message
        System.out.println("🚀 Rocket Launched!");

        // Close the scanner
        input.close();
    }
}
