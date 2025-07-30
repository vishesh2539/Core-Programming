import java.util.Scanner;

public class BMICalculator {

    // Calculate BMI for all persons and populate the 3rd column in the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];        // kg
            double heightCm = data[i][1];      // cm
            double heightM = heightCm / 100.0; // convert cm to meters
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    // Determine BMI status for each person based on BMI values
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 30) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int members = 10;
        double[][] teamData = new double[members][3]; // 0=weight,1=height(cm),2=BMI

        // Input weight and height for 10 members
        for (int i = 0; i < members; i++) {
            System.out.print("Enter weight (kg) for member " + (i + 1) + ": ");
            teamData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for member " + (i + 1) + ": ");
            teamData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for all members
        calculateBMI(teamData);

        // Determine BMI status for all members
        String[] statuses = determineBMIStatus(teamData);

        // Display results
        System.out.println("\nMember\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < members; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
        }

        scanner.close();
    }
}
