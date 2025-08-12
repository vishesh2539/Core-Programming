import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for given height (cm) and weight (kg)
    // Returns 2D String array with BMI and status for each person
    static String[][] calculateBMIStatus(double[][] hw) {
        int n = hw.length;
        String[][] result = new String[n][2]; // [BMI, Status]

        for (int i = 0; i < n; i++) {
            double weight = hw[i][0]; // kg
            double heightCm = hw[i][1];
            double heightM = heightCm / 100.0;

            // BMI formula: weight / (height in m)^2
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimals

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal weight";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(bmi);
            result[i][1] = status;
        }
        return result;
    }

    // Method that takes height-weight 2D array and returns a 2D array with height, weight, BMI, status
    static String[][] getBMISummary(double[][] hw) {
        int n = hw.length;
        String[][] bmiStatus = calculateBMIStatus(hw);

        String[][] summary = new String[n][4]; // height, weight, bmi, status
        for (int i = 0; i < n; i++) {
            summary[i][0] = String.format("%.2f", hw[i][1]); // height cm
            summary[i][1] = String.format("%.2f", hw[i][0]); // weight kg
            summary[i][2] = bmiStatus[i][0]; // bmi
            summary[i][3] = bmiStatus[i][1]; // status
        }
        return summary;
    }

    // Method to display the summary in tabular format
    static void displaySummary(String[][] summary) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < summary.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t\t%s\n",
                i + 1,
                summary[i][0],
                summary[i][1],
                summary[i][2],
                summary[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teamSize = 10;
        double[][] heightWeight = new double[teamSize][2]; // [weight, height]

        System.out.println("Enter weight (kg) and height (cm) for " + teamSize + " persons:");

        for (int i = 0; i < teamSize; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            heightWeight[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " height (cm): ");
            heightWeight[i][1] = sc.nextDouble();
        }

        String[][] summary = getBMISummary(heightWeight);

        System.out.println("\nBMI Summary for the team:");
        displaySummary(summary);

        sc.close();
    }
}
