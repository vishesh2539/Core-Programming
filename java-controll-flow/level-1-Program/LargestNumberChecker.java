/*Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
 */

import java.util.Scanner; // Import Scanner to read user input

public class LargestNumberChecker {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Declare three integer variables
        int number1, number2, number3;

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        number3 = input.nextInt();

        // Check if the first number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);

        // Check if the second number is the largest
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);

        // Check if the third number is the largest
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Display the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the Scanner
        input.close();
    }
}
