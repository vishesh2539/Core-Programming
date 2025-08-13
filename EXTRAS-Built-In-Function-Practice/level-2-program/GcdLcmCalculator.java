import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        // Take input from user
        int num1 = takeInput("Enter the first number: ");
        int num2 = takeInput("Enter the second number: ");

        // Calculate GCD and LCM
        int gcdValue = calculateGCD(num1, num2);
        int lcmValue = calculateLCM(num1, num2, gcdValue);

        // Display results
        displayResult(num1, num2, gcdValue, lcmValue);
    }

    // Function to take integer input
    public static int takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using GCD
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to display the results
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":");
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
