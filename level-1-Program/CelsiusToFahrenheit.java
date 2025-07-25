/*Q3.Write a program that takes the temperature in Celsius as input and converts
it to Fahrenheit using the formula:
Fahrenheit = (Celsius * 9/5) + 32.*/

import java.util.Scanner;

public class CelsiusToFahrenheit{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9/5) + 32;

        System.out.println("The Temperature in Fahrenheit is: " + fahrenheit);          
    }
}