/* Write a Java program to remove all duplicate characters from a given string and return
the modified string.*/

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = "";

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If result doesn't already contain the character, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        // Output modified string
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
