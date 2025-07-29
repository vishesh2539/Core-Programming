import java.util.Scanner;

public class ArraySumInput {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 10 positive numbers (0 or negative to stop):");
        while (true) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            numbers[index++] = num;
        }

        System.out.println("\nEntered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal sum = " + total);
        scanner.close();
    }
}
