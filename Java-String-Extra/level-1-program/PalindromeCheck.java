
/*Write a Java program to check if a given string is a palindrome (a string that reads the
same forward and backward).*/
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove spaces for accurate comparison
        input = input.toLowerCase().replaceAll("\\s+", "");

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
