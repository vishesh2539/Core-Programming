import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lowercase for accurate comparison
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String input1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String input2 = sc.nextLine();

        boolean result = areAnagrams(input1, input2);

        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are NOT anagrams.");
        }

        sc.close();
    }
}
