import java.util.Scanner;

public class LineDistance {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope (m) and y-intercept (b) of the line passing through two points
    // Returns array: [m, b]
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m, b;

        if (x2 - x1 == 0) {
            // Vertical line (slope undefined)
            // We'll handle by returning Double.POSITIVE_INFINITY for slope
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN; // y-intercept undefined
        } else {
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
        }

        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between points: %.4f\n", distance);

        double[] lineEq = findLineEquation(x1, y1, x2, y2);
        double m = lineEq[0];
        double b = lineEq[1];

        if (Double.isInfinite(m)) {
            System.out.println("The line is vertical. Equation: x = " + x1);
        } else {
            System.out.printf("Equation of the line: y = %.4fx + %.4f\n", m, b);
        }

        sc.close();
    }
}
