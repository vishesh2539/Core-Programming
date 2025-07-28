/*Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical 
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for year input
        System.out.print("Enter a year (1582 or later): ");
        int year = input.nextInt();

        // Check for valid Gregorian year
        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {
            // ---- FIRST METHOD: Using Multiple If-Else Statements ----
            System.out.println("Using multiple if-else:");
            if (year % 4 != 0) {
                System.out.println(year + " is NOT a Leap Year.");
            } else if (year % 100 != 0) {
                System.out.println(year + " IS a Leap Year.");
            } else if (year % 400 == 0) {
                System.out.println(year + " IS a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }

            // ---- SECOND METHOD: Using One IF Statement with Logical Operators ----
            System.out.println("Using single if with logical operators:");
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " IS a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        input.close();
    }
}
