/* Write a program to calculate the perimeter of a rectangle. Take the length
and width as inputs and use the formula:
Perimeter = 2 * (length + width). */

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of rectangle: ");
        double width = scanner.nextDouble();

        double Perimeter = 2 * (length + width);

        System.out.printf("Perimeter of a rectangle is: ",Perimeter);

        scanner.close();
    }
}
