/* Write a Java program to count how many times a given substring occurs in a string. */

import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input main string
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        // Input substring
        System.out.print("Enter the substring to search: ");
        String subString = sc.nextLine();

        int count = 0;
        int index = 0;

        // Search for the substring until no more occurrences are found
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // Move index ahead to avoid infinite loop
        }

        // Output result
        System.out.println("The substring occurs " + count + " time(s).");

        sc.close();
    }
}
