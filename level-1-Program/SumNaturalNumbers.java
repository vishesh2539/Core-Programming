/*Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result
 */

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a natural number (positive integer): ");
        int n = input.nextInt();

        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Compute sum using while loop
            int sumLoop = 0;
            int counter = 1;
            while (counter <= n) {
                sumLoop += counter;
                counter++;
            }

            // Display results
            System.out.println("Sum computed using formula: " + sumFormula);
            System.out.println("Sum computed using while loop: " + sumLoop);

            // Compare results and print verification
            if (sumFormula == sumLoop) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a mismatch between the two computations.");
            }
        }

        input.close();
    }
}
