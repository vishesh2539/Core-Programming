public class SpringSeason {

    // Method to check if the given date is in Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check for valid Spring season ranges
        return (month == 3 && day >= 20 && day <= 31) ||    // March 20 to 31
               (month == 4 && day >= 1 && day <= 30)  ||    // April
               (month == 5 && day >= 1 && day <= 31)  ||    // May
               (month == 6 && day >= 1 && day <= 20);       // June 1 to 20
    }

    public static void main(String[] args) {
        // Check if two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }

        // Parse command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call method and display result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
