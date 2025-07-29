import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3]; // 0: height, 1: weight, 2: BMI
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            double h, w;
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                h = sc.nextDouble();
            } while (h <= 0);

            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                w = sc.nextDouble();
            } while (w <= 0);

            data[i][0] = h;
            data[i][1] = w;
            data[i][2] = w / (h * h);

            double bmi = data[i][2];
            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 24.9)
                status[i] = "Normal";
            else if (bmi < 29.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t" + status[i]);
        }
    }
}
