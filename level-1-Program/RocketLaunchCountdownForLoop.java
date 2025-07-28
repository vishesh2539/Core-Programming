/*Rewrite program 8 to do the countdown using the for-loop
 */

import java.util.Scanner; // Import Scanner for input

public class RocketLaunchCountdownForLoop {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the countdown starting number
        System.out.print("Enter the countdown starting number: ");
        int counter = input.nextInt(); // Store input in counter variable

        // Use a for loop to count down from the input number to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print the current count
        }

        // After countdown finishes
        System.out.println("🚀 Rocket Launched!");

        // Close the Scanner object
        input.close();
    }
}
