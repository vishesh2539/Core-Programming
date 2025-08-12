import java.util.Scanner;

public class CalendarDisplay {

    // Get month name from month number
    static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        if (month >= 1 && month <= 12)
            return months[month - 1];
        else
            return "Invalid Month";
    }

    // Check if leap year
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Get number of days in month
    static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Get first day of the month (0=Sunday, 1=Monday,...6=Saturday)
    static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // First day of month
        int y = year;
        int m = month;

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;      // year of the century
        int j = y / 100;      // zero-based century

        int f = d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j;
        int day = f % 7;

        // According to formula: 0=Saturday, 1=Sunday,...6=Friday
        // Convert to 0=Sunday,...6=Saturday for easier printing:
        day = (day + 6) % 7;

        return day;
    }

    // Display calendar for given month and year
    static void displayCalendar(int month, int year) {
        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Print spaces for days before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print all days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            // Move to next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month entered.");
        } else {
            displayCalendar(month, year);
        }

        sc.close();
    }
}
