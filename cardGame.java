// Card.java

public class Card {
    
    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public String toSTring() {
        return face + " of " + suit;
    }
}

// Deck.java

// Hand.java

 public class Hand {
    private Card[] hand = new Card[5];
    
    public Hand(Deck deck) {

    }

 }