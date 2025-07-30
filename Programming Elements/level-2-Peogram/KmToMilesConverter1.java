/*Create a program to convert distance in kilometers to miles.
Hint => 
Create a variable km and assign type as double as in double km;
Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
Use Scanner Object to take user input for km as in km = input.nextInt();
Use 1 mile = 1.6 km formulae to calculate miles and show the output
I/P => km
O/P => The total miles is ___ mile for the given ___ km
 */
import java.util.Scanner;

public class KmToMilesConverter1 {
    public static void main(String[] args) {

        // Declare a variable to store kilometers
        double km;

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Ask user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");

        // Read user input and assign it to km variable
        km = input.nextDouble();

        // Conversion formula: 1 mile = 1.6 km => miles = km / 1.6
        double miles = km / 1.6;

        // Print the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");

        // Close the Scanner object to avoid resource leak
        input.close();
    } 
}
