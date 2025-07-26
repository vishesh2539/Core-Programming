import java.util.Scanner;

public class SumofTonumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = scanner.nextInt(4);

        System.out.println("Enter the Second Number: ");
        int num2 = scanner.nextInt(5);

        int sum = num1+num2;

        System.out.println("The sum is: "+sum);
        scanner.close();
    }
}
