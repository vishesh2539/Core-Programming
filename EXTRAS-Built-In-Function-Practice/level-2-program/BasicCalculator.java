import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");
        int choice = sc.nextInt();

        double num1 = takeInput("Enter the first number: ");
        double num2 = takeInput("Enter the second number: ");
        double result;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select 1-4.");
        }

        sc.close();
    }

    // Function to take double input
    public static double takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }

    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        return a / b;
    }
    
}
