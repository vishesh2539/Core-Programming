import java.util.Scanner;

public class WordsWithLengths {

    // Method to find string length without using length()
    static int findLengthWithoutLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    static String[] splitTextManual(String text) {
        int length = findLengthWithoutLength(text);

        // Count spaces to find number of words
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordsCount = spaceCount + 1;

        // Store space indexes
        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        String[] words = new String[wordsCount];
        int start = 0;
        for (int w = 0; w < wordsCount; w++) {
            int end = (w < spaceCount) ? spaceIndexes[w] : length;
            StringBuilder word = new StringBuilder();
            for (int i = start; i < end; i++) {
                word.append(text.charAt(i));
            }
            words[w] = word.toString();
            start = end + 1;
        }
        return words;
    }

    // Method to create 2D array with word and its length as String
    static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            // Convert length int to String
            result[i][1] = String.valueOf(findLengthWithoutLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Get words array
        String[] words = splitTextManual(text);

        // Get 2D array with word and length string
        String[][] wordsLenArr = wordsWithLengths(words);

        // Display results in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----\t------");
        for (String[] pair : wordsLenArr) {
            String word = pair[0];
            int length = Integer.parseInt(pair[1]); // convert String back to int for display
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}
