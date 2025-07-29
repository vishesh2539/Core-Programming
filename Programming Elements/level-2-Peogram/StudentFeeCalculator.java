
/*Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___ */
import java.util.Scanner; // Import Scanner class for user input

public class StudentFeeCalculator {
    public static void main(String[] args) {

        // Create a Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables to store fee and discount percent
        double fee, discountPercent;

        // Ask the user to enter the student fee
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble(); // Read and store the fee

        // Ask the user to enter the discount percentage
        System.out.print("Enter the university discount percentage (%): ");
        discountPercent = input.nextDouble(); // Read and store the discount %

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final fee after applying the discount
        double finalFee = fee - discount;

        // Display the results
        System.out.println("The discount amount is INR " + discount);
        System.out.println("Final discounted fee is INR " + finalFee);

        // Close the Scanner object
        input.close();
    }
}
