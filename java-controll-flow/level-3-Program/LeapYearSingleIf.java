/*Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
 */
import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the year
        System.out.print("Enter a year (1582 or later): ");
        int year = input.nextInt();

        // Check if the year is valid (Gregorian calendar starts from 1582)
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            // Single if condition using logical AND (&&) and OR (||)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " IS a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        input.close();
    }
}
