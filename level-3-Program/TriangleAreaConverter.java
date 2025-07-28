/* Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
I/P => base, height
O/P => The Area of the triangle in sq in is ___ and sq cm is ___*/
import java.util.Scanner; // Import Scanner class for user input

public class TriangleAreaConverter {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables for base and height in centimeters
        double base, height;

        // Ask the user to enter the base
        System.out.print("Enter the base of the triangle in centimeters: ");
        base = input.nextDouble(); // Read base

        // Ask the user to enter the height
        System.out.print("Enter the height of the triangle in centimeters: ");
        height = input.nextDouble(); // Read height

        // Calculate area in square centimeters using the formula: (1/2) * base * height
        double areaSqCm = 0.5 * base * height;

        // Convert square centimeters to square inches
        // 1 inch = 2.54 cm => 1 square inch = 6.4516 square cm
        double areaSqIn = areaSqCm / 6.4516;

        // Display the results
        System.out.println("The Area of the triangle in square centimeters is: " + areaSqCm + " sq cm");
        System.out.println("The Area of the triangle in square inches is: " + String.format("%.2f", areaSqIn) + " sq in");

        // Close the Scanner object
        input.close();
    }
}

