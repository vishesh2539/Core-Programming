import java.util.Scanner;

public class StudentGrades1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics: "); phy[i] = sc.nextInt();
            System.out.print("Chemistry: "); chem[i] = sc.nextInt();
            System.out.print("Maths: "); math[i] = sc.nextInt();

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

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
