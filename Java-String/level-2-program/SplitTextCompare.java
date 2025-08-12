import java.util.Scanner;

public class SplitTextCompare {

    // Method to find length without using length()
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
        
        // Store space indexes to know word boundaries
        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        
        // Array to store words
        String[] words = new String[wordsCount];
        
        // Extract first word: from 0 to first space
        int start = 0;
        for (int w = 0; w < wordsCount; w++) {
            int end = (w < spaceCount) ? spaceIndexes[w] : length;
            
            // Extract word manually using charAt
            StringBuilder word = new StringBuilder();
            for (int i = start; i < end; i++) {
                word.append(text.charAt(i));
            }
            words[w] = word.toString();
            start = end + 1; // start after space
        }
        
        return words;
    }

    // Method to compare two String arrays
    static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split manually
        String[] manualSplit = splitTextManual(text);

        // Split using built-in split()
        String[] builtinSplit = text.split(" ");

        // Compare results
        boolean isSame = compareStringArrays(manualSplit, builtinSplit);

        // Display results
        System.out.println("\nManual split words:");
        for (String w : manualSplit) {
            System.out.println(w);
        }

        System.out.println("\nBuilt-in split words:");
        for (String w : builtinSplit) {
            System.out.println(w);
        }

        System.out.println("\nAre both splits same? " + isSame);

        sc.close();
    }
}
