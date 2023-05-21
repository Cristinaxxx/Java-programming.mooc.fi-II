import java.util.Comparator;

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int compareTo(Card comparedCard) {
        if(this.value == comparedCard.getValue()) {
            return this.suit.ordinal() - comparedCard.suit.ordinal();
        } else return this.value - comparedCard.getValue();
    }


    class SortBySuit implements Comparator<Card> {

        public int compare(Card c1, Card c2) {
            return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        }
    }

    static class BySuitInValueOrder implements Comparator<Card> {

        public int compare(Card c1, Card c2) {
            if(c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
                return c1.getValue() - c2.getValue();
            } else return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        }

    }

}
