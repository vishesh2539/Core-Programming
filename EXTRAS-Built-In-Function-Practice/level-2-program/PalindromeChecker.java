import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Take input
        String input = takeInput("Enter a string to check if it is a palindrome: ");

        // Check palindrome
        boolean result = isPalindrome(input);

        // Display result
        displayResult(input, result);
    }

    // Function to take input from the user
    public static String takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextLine().replaceAll("\\s+", "").toLowerCase(); // remove spaces, ignore case
    }

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to display the result
    public static void displayResult(String original, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("'" + original + "' is a palindrome.");
        } else {
            System.out.println("'" + original + "' is NOT a palindrome.");
        }
    }
}
