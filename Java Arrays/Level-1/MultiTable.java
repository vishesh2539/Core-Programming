import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] multiplicationResult = new int[4]; // 6 to 9 (inclusive)

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        scanner.close();
    }
}
