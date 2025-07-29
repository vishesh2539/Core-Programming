/*Create a program to find the BMI of a person
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
 
 */

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter weight (in kg): ");
        double weight = input.nextDouble();

        // Input height in centimeters
        System.out.print("Enter height (in cm): ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using formula
        double bmi = weight / (heightM * heightM);

        // Display the BMI value
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }

        input.close();
    }
}
