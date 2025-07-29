/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

 */

 import java.util.Scanner; // Import Scanner class to take user input

public class HeightConverter {
    public static void main(String[] args) {

        // Create a Scanner object to read user input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare a variable to store height in centimeters
        double heightCm;

        // Ask the user to input height in centimeters
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble(); // Read the height from user

        // Convert height from cm to inches (1 inch = 2.54 cm)
        double totalInches = heightCm / 2.54;

        // Calculate feet from total inches (1 foot = 12 inches)
        int feet = (int) (totalInches / 12); // Get the whole number of feet

        // Get the remaining inches after converting to feet
        double inches = totalInches % 12;

        // Display the height in cm, feet, and inches
        System.out.println("Your height in cm is " + heightCm + " cm.");
        System.out.println("Your height in feet and inches is " + feet + " feet and " + String.format("%.2f", inches) + " inches.");

        // Close the Scanner object
        input.close();
    }
}
 