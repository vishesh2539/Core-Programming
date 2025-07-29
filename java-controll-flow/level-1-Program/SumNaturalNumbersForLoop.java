/*Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
 */

import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a natural number (positive integer): ");
        int n = input.nextInt();

        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Compute sum using for loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            // Display both results
            System.out.println("Sum computed using formula: " + sumFormula);
            System.out.println("Sum computed using for loop: " + sumLoop);

            // Compare the two results
            if (sumFormula == sumLoop) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a mismatch between the two computations.");
            }
        }

        input.close();
    }
}
