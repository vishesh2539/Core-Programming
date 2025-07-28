/*The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
Hint => 
Create a variable named fee and assign 125000 to it.
Create another variable discountPercent and assign 10 to it.
Compute discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
 */


 public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Step 1: Declare and assign the course fee
        double fee = 125000;

        // Step 2: Declare and assign the discount percentage
        double discountPercent = 10;

        // Step 3: Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Step 4: Calculate the final fee after discount
        double finalFee = fee - discount;

        // Step 5: Print the result
        System.out.println(
            "The Discounted Amount is INR " + discount + 
            " and the Fee to be Paid is INR " + finalFee
        );
    }
}
