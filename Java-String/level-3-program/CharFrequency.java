import java.util.Scanner;

public class CharFrequency {

    // Method to find frequency of characters and return 2D array [char, frequency]
    static String[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // ASCII frequency array
        int length = text.length();

        // Count frequency of each character using charAt()
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count number of unique chars to size result array
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create result array: each row contains [character, frequency]
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
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

        String[][] frequency = findCharFrequency(input);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");
        for (String[] pair : frequency) {
            System.out.printf("%-10s\t%s\n", pair[0], pair[1]);
        }

        sc.close();
    }
}
