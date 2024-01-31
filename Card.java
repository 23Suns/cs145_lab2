// Fig. 7.11: Card.java
// Card class represents a playing card.

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