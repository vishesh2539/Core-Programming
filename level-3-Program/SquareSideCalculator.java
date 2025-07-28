/* Write a program to find the side of the square whose parameter you read from the user 
Hint => Perimeter of the Square is 4 times the side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/

import java.util.Scanner; // Import Scanner class to read user input

public class SquareSideCalculator {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare a variable to store perimeter
        double perimeter;

        // Ask user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble(); // Read perimeter

        // Calculate side using formula: side = perimeter / 4
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Close the Scanner object
        input.close();
    }
}
