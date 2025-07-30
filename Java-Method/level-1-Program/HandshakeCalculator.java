import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Calculate and display the result
        int maxHandshakes = calculateHandshakes(n);
        System.out.println("The maximum number of handshakes among " + n + " students is: " + maxHandshakes);

        scanner.close();
    }
}
