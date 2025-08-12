import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter heights of 11 players:");

        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11;
        System.out.println("Mean height of players: " + mean);
        scanner.close();
    }
}
