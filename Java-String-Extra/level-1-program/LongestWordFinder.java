/* Write a Java program that takes a sentence as input and returns the longest word in the
sentence.*/
import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        String longestWord = "";
        
        // Loop to find the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output the result
        System.out.println("The longest word is: " + longestWord);

        sc.close();
    }
}
