/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20
 */

import java.util.Scanner; // Import Scanner for user input

public class SpringSeason {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Ask user to enter the month and day
        System.out.print("Enter month (1 to 12): ");
        int month = input.nextInt();

        System.out.print("Enter day (1 to 31): ");
        int day = input.nextInt();

        // Check if the date falls in Spring Season (March 20 to June 20)
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || // March 20–31
                           (month == 4 && day >= 1 && day <= 30)   || // All of April
                           (month == 5 && day >= 1 && day <= 31)   || // All of May
                           (month == 6 && day >= 1 && day <= 20);     // June 1–20

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close the Scanner
        input.close();
    }
}
