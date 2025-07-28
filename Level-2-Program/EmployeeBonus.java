/*Create a program to find the bonuses of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
 */
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input salary
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();

        // Input years of service
        System.out.print("Enter the years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0.0;

        // Check if employee is eligible for bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Print the bonus amount
        System.out.println("The bonus amount is: INR " + bonus);

        input.close();
    }
}
