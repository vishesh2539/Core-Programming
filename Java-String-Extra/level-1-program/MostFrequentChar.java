import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find most frequent character
        char mostFrequent = findMostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        sc.close();
    }

    // Method to find most frequent character
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // ASCII size
        char[] chars = str.toCharArray();

        // Count frequencies
        for (char c : chars) {
            freq[c]++;
        }

        // Find max frequency character
        int maxCount = 0;
        char result = ' ';

        for (char c : chars) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                result = c;
            }
        }
        return result;
    }
}
