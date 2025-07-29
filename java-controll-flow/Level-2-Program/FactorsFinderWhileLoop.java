/*Rewrite the above program 7 to find the factors of a number using the while loop
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible
*/

import java.util.Scanner;

public class FactorsFinderWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.print("Factors of " + number + " are: ");

            int counter = 1; // Initialize counter

            // Run the while loop till counter is less than number
            while (counter < number) {
                // Check if counter is a factor of number
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                counter++; // Increment counter
            }

            System.out.println(); // Move to next line after printing factors
        }

        input.close();
    }
}
