import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    // Returns array of roots: length 2 if two roots, length 1 if one root, length 0 if no real roots
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a (non-zero): ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero for a quadratic equation.");
            scanner.close();
            return;
        }

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Two distinct real roots found:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One real root found:");
            System.out.println("Root = " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        scanner.close();
    }
}
