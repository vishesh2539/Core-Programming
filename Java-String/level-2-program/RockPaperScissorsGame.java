import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method to get computer choice: 0 = rock, 1 = paper, 2 = scissors
    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock"; // fallback
        }
    }

    // Method to determine winner: returns "User", "Computer", or "Tie"
    static String findWinner(String userChoice, String compChoice) {
        if (userChoice.equals(compChoice)) {
            return "Tie";
        }

        if (userChoice.equals("rock")) {
            return (compChoice.equals("scissors")) ? "User" : "Computer";
        } else if (userChoice.equals("paper")) {
            return (compChoice.equals("rock")) ? "User" : "Computer";
        } else if (userChoice.equals("scissors")) {
            return (compChoice.equals("paper")) ? "User" : "Computer";
        } else {
            return "Invalid"; // in case user input is invalid
        }
    }

    // Method to calculate stats and return 2D String array with averages and percentages
    static String[][] calculateStats(int userWins, int compWins, int ties, int totalGames) {
        String[][] stats = new String[3][2];

        // Average wins (count of wins / total games)
        stats[0][0] = "User Win Avg";
        stats[0][1] = String.format("%.2f", (double) userWins / totalGames);

        stats[1][0] = "Computer Win Avg";
        stats[1][1] = String.format("%.2f", (double) compWins / totalGames);

        stats[2][0] = "Tie Avg";
        stats[2][1] = String.format("%.2f", (double) ties / totalGames);

        return stats;
    }

    // Method to display game results and stats in tabular format
    static void displayResults(String[] userChoices, String[] compChoices, String[] winners, String[][] stats) {
        System.out.println("\nGame\tUser Choice\tComputer Choice\tWinner");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < winners.length; i++) {
            System.out.printf("%d\t%-11s\t%-15s\t%s\n", i + 1, userChoices[i], compChoices[i], winners[i]);
        }

        System.out.println("\nSummary:");
        System.out.println("------------------------");
        System.out.printf("%-20s | %s\n", "Result", "Average Wins");
        System.out.println("------------------------");
        for (String[] stat : stats) {
            System.out.printf("%-20s | %s\n", stat[0], stat[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] userChoices = new String[n];
        String[] compChoices = new String[n];
        String[] winners = new String[n];

        int userWins = 0, compWins = 0, ties = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock, paper, scissors) for game " + (i + 1) + ": ");
            String userChoice = sc.nextLine().toLowerCase();

            String compChoice = getComputerChoice();

            String winner = findWinner(userChoice, compChoice);

            // Store results
            userChoices[i] = userChoice;
            compChoices[i] = compChoice;
            winners[i] = winner;

            // Update counts
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else if (winner.equals("Tie")) ties++;
            else System.out.println("Invalid user input detected.");
        }

        String[][] stats = calculateStats(userWins, compWins, ties, n);

        displayResults(userChoices, compChoices, winners, stats);

        sc.close();
    }
}
