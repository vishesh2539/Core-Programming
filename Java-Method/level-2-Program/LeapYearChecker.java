import java.util.Scanner;

public class LeapYearChecker {

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        // Condition a: divisible by 4 but not by 100
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);

        // Condition b: divisible by 400
        boolean conditionB = (year % 400 == 0);

        return conditionA || conditionB;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        scanner.close();
    }
}
