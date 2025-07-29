/*rite a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
 */
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = input.nextInt();

        // Compute total and average
        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        System.out.println("Average Mark (Percentage): " + percentage + "%");

        // Determine grade and remarks
        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Outstanding";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 70) {
            grade = "B+";
            remarks = "Very Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Fail. Need Improvement";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
