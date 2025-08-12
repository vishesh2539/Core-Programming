import java.util.Scanner;

public class CharTypeFinder {

    // Method to check character type: Vowel, Consonant, or Not a Letter
    static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII difference
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels/consonants in string and return 2D array [char, type]
    static String[][] findCharTypes(String text) {
        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    // Method to display 2D array in tabular format
    static void displayCharTypes(String[][] arr) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (String[] pair : arr) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] charTypes = findCharTypes(input);

        displayCharTypes(charTypes);

        sc.close();
    }
}
