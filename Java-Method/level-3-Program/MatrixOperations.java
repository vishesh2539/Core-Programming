import java.util.Random;

public class MatrixOperations {

    // Method to generate a random matrix
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // 0-9
        return matrix;
    }

    // Method to display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.printf("%5d", val);
            System.out.println();
        }
    }

    // Matrix Addition
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Matrix Subtraction
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Matrix Multiplication
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    // Transpose of matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < cols; i++)
            for (int j = 0; j < rows; j++)
                transpose[i][j] = matrix[j][i];
        return transpose;
    }

    // Determinant of 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) return null;

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double)det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double)det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double)det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double)det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double)det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double)det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double)det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double)det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double)det;

        return inv;
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        int[][] A = generateRandomMatrix(3, 3);
        int[][] B = generateRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nA * B:");
        displayMatrix(multiplyMatrices(A, B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("\nDeterminant of A:");
        System.out.println("3x3 Determinant = " + determinant3x3(A));

        System.out.println("\nInverse of A:");
        double[][] inverse = inverse3x3(A);
        if (inverse != null)
            displayMatrix(inverse);
        else
            System.out.println("Matrix A is not invertible (det = 0).");
    }
}
