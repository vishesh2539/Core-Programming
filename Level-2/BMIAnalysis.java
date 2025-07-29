import java.util.Scanner;

public class BMIAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 24.9)
                status[i] = "Normal";
            else if (bmi[i] < 29.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "\t" + weight[i] + "\t" + bmi[i] + "\t" + status[i]);
        }
    }
}
