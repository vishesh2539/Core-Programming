/* Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
*/
import java.util.Scanner; // Import Scanner to take user input

public class PurchaseCalculator {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables to store unit price and quantity
        double unitPrice;
        int quantity;

        // Ask the user to enter unit price
        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble(); // Read unit price

        // Ask the user to enter quantity
        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt(); // Read quantity

        // Calculate total price = unit price × quantity
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity is " + quantity + " and unit price is INR " + unitPrice);

        // Close the Scanner object
        input.close();
    }
}
