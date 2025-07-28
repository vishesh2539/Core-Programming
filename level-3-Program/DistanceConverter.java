/* Write a program to find the distance in yards and miles for the distance provided by the user in feet
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => The distance in yards is ___ while the distance in miles is ___
*/
import java.util.Scanner; // Import Scanner class for taking user input

public class DistanceConverter {
    public static void main(String[] args) {

        // Create a Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // Declare a variable to store distance in feet
        double distanceInFeet;

        // Ask user to enter distance in feet
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble(); // Read the input

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Display the results
        System.out.println("The distance in yards is " + distanceInYards);
        System.out.println("The distance in miles is " + distanceInMiles);

        // Close the Scanner
        input.close();
    }
}
