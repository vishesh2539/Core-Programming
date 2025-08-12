import java.util.Scanner;

public class LowercaseCompare {

    // Method to convert text to lowercase manually using charAt()
    static String convertToLowercaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase using ASCII difference
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings manually using charAt()
    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Manual lowercase conversion
        String manualLower = convertToLowercaseManual(text);

        // Built-in lowercase conversion
        String builtInLower = text.toLowerCase();

        // Compare results
        boolean isSame = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("Manual Lowercase:   " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
