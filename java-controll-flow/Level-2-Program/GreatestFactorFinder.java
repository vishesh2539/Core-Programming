/*Create a program to print the greatest factor of a number beside itself using a loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
 */
import java.util.Scanner;

public class GreatestFactorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Initialize greatestFactor to 1 (1 is always a factor)
        int greatestFactor = 1;

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if i is a factor of number
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit loop after finding greatest factor
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);

        input.close();
    }
}
