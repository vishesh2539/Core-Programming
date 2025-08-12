import java.util.Scanner;

public class SubstringCompare {
    
    // Method to create a substring manually using charAt()
    static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    
    // Method to compare two strings manually using charAt()
    static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter the main string: ");
        String text = sc.next();
        
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        
        // Get substring using manual charAt method
        String manualSubstring = createSubstringUsingCharAt(text, start, end);
        
        // Get substring using built-in substring() method
        String builtinSubstring = text.substring(start, end);
        
        // Compare results using manual charAt comparison
        boolean comparisonResult = compareUsingCharAt(manualSubstring, builtinSubstring);
        
        // Display results
        System.out.println("Substring using charAt(): " + manualSubstring);
        System.out.println("Substring using built-in method: " + builtinSubstring);
        System.out.println("Are both substrings same? " + comparisonResult);
        
        sc.close();
    }
}
