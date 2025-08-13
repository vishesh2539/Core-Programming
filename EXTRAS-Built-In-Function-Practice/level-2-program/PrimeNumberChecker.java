import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Take input from the user
        int number = takeInput("Enter a number to check if it is prime: ");

        // Check if prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to take integer input
    public static int takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // divisible by a number other than 1 and itself
        }
        return true;
    }
}
