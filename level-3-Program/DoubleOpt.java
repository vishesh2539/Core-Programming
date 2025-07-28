/*Similarly, write the DoubleOpt program by taking double values and doing the same operations. */

import java.util.Scanner; // Import Scanner for input

public class DoubleOpt {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare double variables a, b, and c
        double a, b, c;

        // Prompt user and read double values
        System.out.print("Enter double value for a: ");
        a = input.nextDouble();

        System.out.print("Enter double value for b: ");
        b = input.nextDouble();

        System.out.print("Enter double value for c: ");
        c = input.nextDouble();

        // Perform operations with operator precedence in mind
        double result1 = a + b * c;    // b*c evaluated first, then added to a
        double result2 = a * b + c;    // a*b evaluated first, then added to c
        double result3 = c + a / b;    // a/b evaluated first, then added to c
        double result4 = a % b + c;    // a%b evaluated first (modulus works with doubles), then added to c

        // Print results with explanations
        System.out.println("Results of double operations with a=" + a + ", b=" + b + ", c=" + c + ":");
        System.out.println("a + b * c = " + result1 + "  (b * c evaluated first, then added to a)");
        System.out.println("a * b + c = " + result2 + "  (a * b evaluated first, then added to c)");
        System.out.println("c + a / b = " + result3 + "  (a / b evaluated first, then added to c)");
        System.out.println("a % b + c = " + result4 + "  (a % b evaluated first, then added to c)");

        // Close the Scanner
        input.close();
    }
}
