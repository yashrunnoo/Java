import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {
    private static final int NUM_PLAYERS = 4;
    private static final int CARDS_PER_DRAW = 4;

    private static List<Card> deck = new ArrayList<>();

    static {
        for (int i = 0; i < 4; i++) {
            String suit = "";
            switch (i) {
                case 0:
                    suit = "Club";
                    break;
                case 1:
                    suit = "Heart";
                    break;
                case 2:
                    suit = "Diamond";
                    break;
                case 3:
                    suit = "Spade";
                    break;
            }
            for (int j = 0; j < 13; j++) {
                String value = "";
                switch (j) {
                    case 0:
                        value = "King";
                        break;
                    case 1:
                        value = "1";
                        break;
                    case 11:
                        value = "Jack";
                        break;
                    case 12:
                        value = "Queen";
                        break;
                    default:
                        value = String.valueOf(j + 1);
                        break;
                }
                deck.add(new Card(suit, value));
            }
        }
    }

    private static List<Card> drawnCards = new ArrayList<>();

    private static class Card {
        private String suit;
        private String value;

        public Card(String suit, String value) {
            this.suit = suit;
            this.value = value;
        }

        @Override
        public String toString() {
            return value + " of " + suit;
        }
    }

    private static class Player implements Runnable {
        private String name;
        private int numKings = 0;

        public Player(String name) {
            this.name = name;
        }

        public void drawCards() {
            Collections.shuffle(deck);
            System.out.println(name + " is drawing cards:");
            for (int i = 0; i < CARDS_PER_DRAW; i++) {
                Card card = deck.remove(0);
                System.out.println(name + " drew " + card);
                drawnCards.add(card);
                if (card.value.equals("King")) {
                    numKings++;
                }
            }
            System.out.println(name + " has " + numKings + " Kings.");
            if (numKings == 4) {
                System.out.println(name + " wins!");
                System.exit(0);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (true) {
                drawCards();
                drawnCards.clear();
            }
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[NUM_PLAYERS];
        for (int i = 0; i < NUM_PLAYERS; i++) {
            threads[i] = new Thread(new Player("Player " + (i + 1)));
            threads[i].start();
        }
    }
}
