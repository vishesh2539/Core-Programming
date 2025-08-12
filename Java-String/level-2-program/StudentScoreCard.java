import java.util.Random;

public class StudentScoreCard {

    // Generate random 2-digit scores (0-99) for Physics, Chemistry, Maths for n students
    static int[][] generateRandomScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(100); // Physics
            scores[i][1] = rand.nextInt(100); // Chemistry
            scores[i][2] = rand.nextInt(100); // Maths
        }
        return scores;
    }

    // Calculate total, average, percentage (rounded to 2 decimals) for each student
    // Returns 2D array: [total, average, percentage]
    static double[][] calculateTotals(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Assign grade based on percentage
    // Return array of grades corresponding to each student
    static String[] calculateGrades(double[][] totals) {
        String[] grades = new String[totals.length];
        for (int i = 0; i < totals.length; i++) {
            double percentage = totals[i][2];
            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B+";
            } else if (percentage >= 60) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    // Display the scorecard in tabular format
    static void displayScoreCard(int[][] scores, double[][] totals, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\t\t%s\n",
                i + 1,
                scores[i][0],
                scores[i][1],
                scores[i][2],
                (int) totals[i][0],
                totals[i][1],
                totals[i][2],
                grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;

        int[][] scores = generateRandomScores(numberOfStudents);
        double[][] totals = calculateTotals(scores);
        String[] grades = calculateGrades(totals);

        displayScoreCard(scores, totals, grades);
    }
}
