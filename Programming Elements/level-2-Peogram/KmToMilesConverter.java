/*Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
 */
public class KmToMilesConverter {
     public static void main(String[] args) { // Main method: entry point of the program

        // Step 1: Declare the distance in kilometers
        double kilometers = 10.8;

        // Step 2: Define the conversion factor
        // As per the hint, 1 kilometer = 1.6 miles
        double conversionFactor = 1.6;

        // Step 3: Perform the conversion by multiplying kilometers by the conversion factor
        double miles = kilometers * conversionFactor;

        // Step 4: Print the result in the required format
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
