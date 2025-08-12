import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students (10-99)
    static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Generate age between 10 and 99
            ages[i] = 10 + rand.nextInt(90);
        }
        return ages;
    }

    // Method to check voting eligibility; returns 2D array: [age, "true"/"false"]
    static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            results[i][0] = String.valueOf(age);

            if (age < 0) {
                // Negative age cannot vote
                results[i][1] = "false";
            } else {
                // Age 18 or above can vote
                results[i][1] = (age >= 18) ? "true" : "false";
            }
        }
        return results;
    }

    // Method to display 2D array in tabular format
    static void displayResults(String[][] results) {
        System.out.println("Student\tAge\tCan Vote?");
        System.out.println("---------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages for n students
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] votingResults = checkVotingEligibility(ages);

        // Display the results
        displayResults(votingResults);

        sc.close();
    }
}
