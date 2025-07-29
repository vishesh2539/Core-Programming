/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
 */
import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables for ages
        int amarAge, akbarAge, anthonyAge;

        // Variables for heights in centimeters (can be double if needed)
        double amarHeight, akbarHeight, anthonyHeight;

        // Input ages
        System.out.print("Enter Amar's age: ");
        amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        anthonyAge = input.nextInt();

        // Input heights
        System.out.print("Enter Amar's height (cm): ");
        amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's height (cm): ");
        akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's height (cm): ");
        anthonyHeight = input.nextDouble();

        // Find youngest friend
        int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";

        if (minAge == amarAge) {
            youngestFriend = "Amar";
        } 
        if (minAge == akbarAge) {
            youngestFriend += youngestFriend.isEmpty() ? "Akbar" : " and Akbar";
        }
        if (minAge == anthonyAge) {
            youngestFriend += youngestFriend.isEmpty() ? "Anthony" : " and Anthony";
        }

        // Find tallest friend
        double maxHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";

        if (maxHeight == amarHeight) {
            tallestFriend = "Amar";
        }
        if (maxHeight == akbarHeight) {
            tallestFriend += tallestFriend.isEmpty() ? "Akbar" : " and Akbar";
        }
        if (maxHeight == anthonyHeight) {
            tallestFriend += tallestFriend.isEmpty() ? "Anthony" : " and Anthony";
        }

        // Display results
        System.out.println("\nYoungest friend(s): " + youngestFriend + " with age " + minAge);
        System.out.println("Tallest friend(s): " + tallestFriend + " with height " + maxHeight + " cm");

        input.close();
    }
}
