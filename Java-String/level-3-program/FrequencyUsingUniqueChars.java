import java.util.Scanner;

public class FrequencyUsingUniqueChars {

    // Method to find length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Find unique characters using nested loops and charAt()
    static char[] uniqueCharacters(String text) {
        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if character appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create array with exact size for unique chars
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    // Find frequency of characters in text, return 2D String array of unique char and frequency
    static String[][] findCharFrequency(String text) {
        int[] freq = new int[256];
        int length = findLength(text);

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Prepare 2D array with unique chars and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
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
