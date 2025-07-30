import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    static final String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in months for non-leap year
    static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get month name
    public static String getMonthName(int month) {
        if (month < 1 || month > 12) return "Invalid month";
        return months[month - 1];
    }

    // Method to get number of days in month, considering leap year for February
    public static int getNumberOfDays(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to get the day of the week for the 1st day of the given month and year
    // Returns 0 for Sunday, 1 for Monday ... 6 for Saturday
    public static int getFirstDayOfMonth(int month, int year) {
        // Gregorian calendar formula:
        int y = year;
        int m = month;

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;          // year of the century
        int j = y / 100;          // zero-based century

        // Using Zeller's congruence to find the day of week for 1st day of month
        int h = (1 + (13*(m + 1))/5 + k + (k/4) + (j/4) + 5*j) % 7;

        // h = 0 means Saturday, 1 means Sunday, ... 6 means Friday
        // We want 0 = Sunday, 1 = Monday,... so convert:
        int dayOfWeek = (h + 6) % 7;

        return dayOfWeek;
    }

    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        if (numberOfDays == -1) {
            System.out.println("Invalid month!");
            return;
        }

        System.out.printf("     %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for each day slot
        }

        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
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
        System.out.print("Enter year (e.g. 2025): ");
        int year = sc.nextInt();

        printCalendar(month, year);
        sc.close();
    }
}
