/* Write a program to calculate the area of a circle. Take the radius as input
and use the formula:
Area = π * radius^2. */
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of Circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius,2);

        System.out.printf("The area of circle of radius is: ",radius,area);

        scanner.close();
    }    
}
