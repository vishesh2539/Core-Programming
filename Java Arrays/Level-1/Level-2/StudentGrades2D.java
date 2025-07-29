import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 75) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 40) grade[i] = "D";
            else grade[i] = "F";
        }

        System.out.println("\nPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + "\t\t" + grade[i]);
        }
    }
}
