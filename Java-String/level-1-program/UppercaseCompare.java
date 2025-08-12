import java.util.Scanner;

public class UppercaseCompare {

    // Method to convert text to uppercase manually using charAt()
    static String convertToUppercaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase using ASCII difference
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

        // Manual uppercase conversion
        String manualUpper = convertToUppercaseManual(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Compare results
        boolean isSame = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("Manual Uppercase:   " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
