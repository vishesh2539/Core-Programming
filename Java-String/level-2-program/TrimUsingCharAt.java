import java.util.Scanner;

public class TrimUsingCharAt {

    // Method to find start and end index after trimming spaces
    static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    static String substringManual(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string with spaces: ");
        String input = sc.nextLine();

        // Find start and end indices after manual trim
        int[] indices = findTrimIndices(input);

        // Get manually trimmed substring
        String manualTrimmed = "";
        if (indices[0] <= indices[1]) {
            manualTrimmed = substringManual(input, indices[0], indices[1]);
        }

        // Built-in trim method
        String builtInTrimmed = input.trim();

        // Compare both trimmed strings
        boolean isSame = compareStrings(manualTrimmed, builtInTrimmed);

        System.out.println("\nManual trimmed string: '" + manualTrimmed + "'");
        System.out.println("Built-in trimmed string: '" + builtInTrimmed + "'");
        System.out.println("Are both trimmed strings same? " + isSame);

        sc.close();
    }
}
