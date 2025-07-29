/*Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use the isPrime boolean variable to store the result
 */

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number to check if it's prime: ");
        int number = input.nextInt();

        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Number is divisible by another number
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        input.close();
    }
}
