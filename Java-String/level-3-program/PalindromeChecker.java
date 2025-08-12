import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative check from start and end
    static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper method: Reverse string using charAt()
    static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);
        }
        return reversed;
    }

    // Logic 3: Compare original char array with reversed char array
    static boolean isPalindromeByReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to check palindrome: ");
        String input = sc.nextLine();

        // Logic 1
        boolean iterativeResult = isPalindromeIterative(input);

        // Logic 2
        boolean recursiveResult = isPalindromeRecursive(input, 0, input.length() - 1);

        // Logic 3
        boolean reversalResult = isPalindromeByReversal(input);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Iterative method: " + (iterativeResult ? "Palindrome" : "Not a palindrome"));
        System.out.println("Recursive method: " + (recursiveResult ? "Palindrome" : "Not a palindrome"));
        System.out.println("Reversal method: " + (reversalResult ? "Palindrome" : "Not a palindrome"));

        sc.close();
    }
}
