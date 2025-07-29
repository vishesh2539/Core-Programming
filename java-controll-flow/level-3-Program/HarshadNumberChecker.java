/*Create a program to check if a number taken from the user is a Harshad Number.
Hint => 
A Harshad number is an integer which is divisible by the sum of its digits. 
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
 */

import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int originalNumber = number;
        int sum = 0;

        // Find the sum of digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        // Check if original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        input.close();
    }
}
