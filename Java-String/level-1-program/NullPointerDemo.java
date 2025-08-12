public class NullPointerDemo {
    
    // Method to generate NullPointerException (without handling)
    static void generateException() {
        String text = null; // variable initialized to null
        System.out.println("Length of text: " + text.length()); // This will throw NullPointerException
    }
    
    // Method to handle NullPointerException using try-catch
    static void handleException() {
        String text = null; // variable initialized to null
        
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Variable 'text' is null.");
        }
    }
    
    public static void main(String[] args) {
        // First, call the method that generates the exception
        System.out.println("=== Generating NullPointerException ===");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }
        
        // Now, call the method that handles it
        System.out.println("\n=== Handling NullPointerException ===");
        handleException();
    }
}
