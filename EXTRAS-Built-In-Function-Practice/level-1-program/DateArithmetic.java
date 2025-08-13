import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input date from user
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the result
        LocalDate finalDate = addedDate.minusWeeks(3);

        // Output results
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After Adding 7 days, 1 month, 2 years: " + addedDate.format(formatter));
        System.out.println("After Subtracting 3 weeks: " + finalDate.format(formatter));

        sc.close();
    }
}
