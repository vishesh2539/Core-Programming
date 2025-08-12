import java.util.Scanner;

public class CardDeck {

    // Suits and ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Initialize the deck with "rank of suit"
    static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle the deck using Fisher-Yates shuffle algorithm
    static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap deck[i] and deck[randomCardNumber]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Distribute n cards to x players, return 2D array with players' cards
    static String[][] distributeCards(String[] deck, int n, int x) {
        if (n > deck.length) {
            System.out.println("Not enough cards in the deck to distribute " + n + " cards.");
            return null;
        }
        if (n % x != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
            return null;
        }

        int cardsPerPlayer = n / x;
        String[][] playersCards = new String[x][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }

        return playersCards;
    }

    // Print players and their cards
    static void printPlayersCards(String[][] playersCards) {
        if (playersCards == null) {
            System.out.println("No cards to display.");
            return;
        }
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : playersCards[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute (max " + deck.length + "): ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int x = sc.nextInt();

        String[][] playersCards = distributeCards(deck, n, x);

        printPlayersCards(playersCards);

        sc.close();
    }
}
