import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Toggle case
        String result = toggleCase(input);

        // Output
        System.out.println("Toggled string: " + result);

        sc.close();
    }

    // Method to toggle case
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch); // Non-alphabetic characters stay the same
            }
        }

        return toggled.toString();
    }
}
