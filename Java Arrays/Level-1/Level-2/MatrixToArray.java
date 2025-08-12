import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                array[index++] = matrix[i][j];
            }
        }

        System.out.print("1D array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
