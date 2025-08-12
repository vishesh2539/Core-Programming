import java.util.Scanner;

public class ShortestLongestWords {

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

    // Method to split text into words manually (no split())
    static String[] splitTextManual(String text) {
        int length = findLengthWithoutLength(text);

        // Count spaces to determine number of words
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordsCount = spaceCount + 1;
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

    // Method to create 2D array with word and its length as string
    static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLengthWithoutLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word lengths' indexes
    // Returns array: [indexOfShortest, indexOfLongest]
    static int[] findShortestAndLongest(String[][] wordLenArr) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordLenArr[0][1]);
        int longestLength = shortestLength;

        for (int i = 1; i < wordLenArr.length; i++) {
            int currentLength = Integer.parseInt(wordLenArr[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[] { shortestIndex, longestIndex };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        String[] words = splitTextManual(text);
        String[][] wordLenArr = wordsWithLengths(words);
        int[] shortestLongestIndexes = findShortestAndLongest(wordLenArr);

        System.out.println("\nWords with their lengths:");
        for (String[] pair : wordLenArr) {
            System.out.println(pair[0] + " : " + pair[1]);
        }

        System.out.println("\nShortest word: " + wordLenArr[shortestLongestIndexes[0]][0] +
                           " (Length: " + wordLenArr[shortestLongestIndexes[0]][1] + ")");
        System.out.println("Longest word: " + wordLenArr[shortestLongestIndexes[1]][0] +
                           " (Length: " + wordLenArr[shortestLongestIndexes[1]][1] + ")");

        sc.close();
    }
}
