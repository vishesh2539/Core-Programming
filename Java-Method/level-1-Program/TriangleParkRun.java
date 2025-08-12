import java.util.Scanner;

public class TriangleParkRun {

    // Method to calculate number of rounds needed
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000.0; // in meters
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for 3 sides of the triangle
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate and display number of rounds
        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("The athlete must complete %.2f rounds to cover 5 km.%n", rounds);

        scanner.close();
    }
}
