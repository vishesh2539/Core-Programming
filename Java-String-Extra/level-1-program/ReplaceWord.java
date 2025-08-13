import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Input words
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        // Replace word
        String result = replaceWord(sentence, oldWord, newWord);

        // Output
        System.out.println("Modified sentence: " + result);

        sc.close();
    }

    // Method to replace a word with another word
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" "); // Split sentence into words
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.equals(oldWord)) {
                sb.append(newWord).append(" ");
            } else {
                sb.append(word).append(" ");
            }
        }

        return sb.toString().trim(); // Remove last extra space
    }
}
