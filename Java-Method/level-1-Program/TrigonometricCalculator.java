import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);  // Convert to radians

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get angle input from user
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        // Call method and get results
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.printf("Sine(%.2f°) = %.4f%n", angle, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angle, results[1]);
        System.out.printf("Tangent(%.2f°) = %.4f%n", angle, results[2]);

        scanner.close();
    }
}
