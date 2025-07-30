import java.util.Random;

public class FootballTeamHeights {

    // Generate random heights between 150 and 250 cm for 11 players
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 0-100 + 150 = 150-250
        }
        return heights;
    }

    // Method to find sum of all elements in the array
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    // Method to find mean height of players
    public static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find shortest height in the array
    public static int findShortest(int[] arr) {
        int shortest = arr[0];
        for (int val : arr) {
            if (val < shortest) {
                shortest = val;
            }
        }
        return shortest;
    }

    // Method to find tallest height in the array
    public static int findTallest(int[] arr) {
        int tallest = arr[0];
        for (int val : arr) {
            if (val > tallest) {
                tallest = val;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        System.out.print("Player Heights (cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum of heights: " + sum + " cm");
        System.out.printf("Mean height: %.2f cm%n", mean);
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
