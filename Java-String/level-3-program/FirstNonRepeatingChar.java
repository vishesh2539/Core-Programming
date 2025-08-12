import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character
    static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256];  // ASCII char frequency

        int length = text.length();

        // Count frequency of each char
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Find first char with frequency 1
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        // Return a special char if none found
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

        sc.close();
    }
}
