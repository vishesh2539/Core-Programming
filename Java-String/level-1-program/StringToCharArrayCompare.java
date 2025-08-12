import java.util.Scanner;

public class StringToCharArrayCompare {
    
    // Method to return characters without using toCharArray()
    static char[] getCharsManually(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    
    // Method to compare two char arrays
    static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        // Get characters using manual method
        char[] manualChars = getCharsManually(text);
        
        // Get characters using built-in method
        char[] builtInChars = text.toCharArray();
        
        // Compare both results
        boolean isSame = compareCharArrays(manualChars, builtInChars);
        
        // Display results
        System.out.print("Manual char array: ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }
        
        System.out.print("\nBuilt-in char array: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        
        System.out.println("\nAre both arrays same? " + isSame);
        
        sc.close();
    }
}
