import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    // Generate random 2-digit PCM marks for each student
    public static int[][] generatePCMScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + rand.nextInt(90); // Physics
            scores[i][1] = 10 + rand.nextInt(90); // Chemistry
            scores[i][2] = 10 + rand.nextInt(90); // Maths
        }
        return scores;
    }

    // Calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "%");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] scores = generatePCMScores(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
        
    }
}
