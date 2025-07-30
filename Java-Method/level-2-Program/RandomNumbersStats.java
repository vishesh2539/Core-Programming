import java.util.Arrays;

public class RandomNumbersStats {

    // Method to generate an array of 4-digit random numbers (1000 to 9999)
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Math.random() gives double between 0.0 and 1.0
            // Multiply by 9000 and add 1000 to get range 1000 to 9999
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, min, and max of the numbers array
    // Returns double array: [average, min, max]
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;

        // Generate random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated random numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, max
        double[] stats = findAverageMinMax(randomNumbers);

        System.out.printf("Average: %.2f\n", stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}
