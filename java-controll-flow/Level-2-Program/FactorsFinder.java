/* Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i*/
import java.util.Scanner;

public class FactorsFinder {
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

            // Loop from 1 to number-1
            for (int i = 1; i < number; i++) {
                // Check if i is a factor of number
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Move to next line after printing factors
        }

        input.close();
    }
}
