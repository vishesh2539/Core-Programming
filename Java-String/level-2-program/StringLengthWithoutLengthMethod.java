import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find string length without using length()
    static int findLengthWithoutLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // charAt threw exception when index exceeded string length
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Call method without length()
        int manualLength = findLengthWithoutLength(input);

        // Call built-in length() method
        int builtinLength = input.length();

        // Display results
        System.out.println("Length calculated without length(): " + manualLength);
        System.out.println("Length calculated using length(): " + builtinLength);

        sc.close();
    }
}
