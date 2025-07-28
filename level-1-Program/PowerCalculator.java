/*Write a program that takes two numbers as input: a base and an exponent,
and prints the result of base raised to the exponent (without using loops or
conditionals). */

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the value of base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the value of exponent: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.printf("%.2f raised to the power %.2f is %.2f%n",base,exponent,result);
        scanner.close();
    }
}
