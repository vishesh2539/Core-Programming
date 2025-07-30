/* Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, and c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign the result to a variable
Finally, print the result and try to understand operator precedence.
*/

import java.util.Scanner; // Import Scanner for user input

public class IntOperation {
    public static void main(String[] args) {

        // Create Scanner object to read input values
        Scanner input = new Scanner(System.in);

        // Declare integer variables a, b, and c
        int a, b, c;

        // Prompt and read input values
        System.out.print("Enter integer value for a: ");
        a = input.nextInt();

        System.out.print("Enter integer value for b: ");
        b = input.nextInt();

        System.out.print("Enter integer value for c: ");
        c = input.nextInt();

        // Compute the expressions:
        // Operator precedence: *, /, % evaluated before +, -
        int result1 = a + b * c;    // b * c evaluated first, then added to a
        int result2 = a * b + c;    // a * b evaluated first, then added to c
        int result3 = c + a / b;    // a / b evaluated first (integer division), then added to c
        int result4 = a % b + c;    // a % b evaluated first, then added to c

        // Print the results with explanations
        System.out.println("Results of integer operations with a=" + a + ", b=" + b + ", c=" + c + ":");
        System.out.println("a + b * c = " + result1 + "  (b * c evaluated first, then added to a)");
        System.out.println("a * b + c = " + result2 + "  (a * b evaluated first, then added to c)");
        System.out.println("c + a / b = " + result3 + "  (a / b evaluated first, then added to c)");
        System.out.println("a % b + c = " + result4 + "  (a % b evaluated first, then added to c)");

        // Close Scanner object
        input.close();
    }
}
