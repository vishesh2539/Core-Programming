import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Take the character to remove
        System.out.print("Enter the character to remove: ");
        char toRemove = sc.next().charAt(0);

        // Remove character
        String result = removeCharacter(input, toRemove);

        // Output result
        System.out.println("Modified String: " + result);

        sc.close();
    }

    // Method to remove all occurrences of a character
    public static String removeCharacter(String str, char ch) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch) { // Skip the character to remove
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
