
/*  Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user. write a java program ?*/
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        double principle = scanner.nextDouble();

        System.out.print("Enter the Rate amount: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time: ");
        double Time = scanner.nextDouble();

        double Simple_Interset = (principle*rate*Time)/100;

        System.out.print("The simple interest of above program is: "+ Simple_Interset);

        scanner.close();
    }
}
