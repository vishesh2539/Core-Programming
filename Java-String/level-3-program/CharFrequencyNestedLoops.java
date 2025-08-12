import java.util.Scanner;

public class CharFrequencyNestedLoops {

    // Method to find frequency of characters using nested loops
    // Returns 2D String array of character and frequency
    static String[][] findCharFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        // Initialize frequencies to 1 for each character
        for (int i = 0; i < length; i++) {
            freq[i] = 1;
        }

        // Nested loop to count frequency and mark duplicates as '0'
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue; // Skip duplicates

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        // Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        // Create 2D array for unique chars and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index][0] = Character.toString(chars[i]);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freq = findCharFrequency(input);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");
        for (String[] pair : freq) {
            System.out.printf("%-10s\t%s\n", pair[0], pair[1]);
        }

        sc.close();
    }
}
