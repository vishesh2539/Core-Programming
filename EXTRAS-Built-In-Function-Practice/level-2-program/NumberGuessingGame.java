import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100. I will try to guess it!");
        
        int low = 1;
        int high = 100;
        boolean correct = false;

        while (!correct) {
            int guess = generateGuess(low, high);
            char feedback = getFeedback(sc, guess);

            if (feedback == 'H') {
                high = guess - 1;
            } else if (feedback == 'L') {
                low = guess + 1;
            } else if (feedback == 'C') {
                System.out.println("Yay! I guessed your number: " + guess);
                correct = true;
            } else {
                System.out.println("Invalid input! Please enter H, L, or C.");
            }
        }

        sc.close();
    }

    // Function to generate a random guess within the current range
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Function to get feedback from the user
    public static char getFeedback(Scanner sc, int guess) {
        System.out.print("Is your number " + guess + "? (H for high, L for low, C for correct): ");
        return sc.next().toUpperCase().charAt(0);
    }
}
