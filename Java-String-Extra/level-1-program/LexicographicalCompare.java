import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Compare and show result
        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("Strings are equal.");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in dictionary order.");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in dictionary order.");
        }

        sc.close();
    }

    // Method to compare strings lexicographically without built-in methods
    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return c1 - c2; // Positive if c1 > c2, negative if c1 < c2
            }
        }
        // If all compared characters are equal, shorter string comes first
        return len1 - len2;
    }
}
 