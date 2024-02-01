// Fig 7.12: DeckofCards.java
// DeckofCards class represents a deck of playing cards

import java.security.SecureRandom;

public class Deck {
    private static final int NUMBER_OF_CARDS = 52; // constant # of cards
    
    private Card[] deck = new Card[NUMBER_OF_CARDS]; // Card references
    private int currentCard = 0; // index of Card to be dealt (0 - 51)

    // constructor fills the deck of cards
    public Deck() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", 
        "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for(int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
    //next call to method dealCard should start at deck[0] again
        currentCard = 0;

        for(int i = deck.length - 1; i >= 0; i--) {
        
            // Calculate bound as difference between length and i
            int j = new SecureRandom().nextInt(deck.length - i);
            
            //swap current Card with randomly selected Card
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++]; // return current Card in array
        }
        else {
            return null; // return null to indicate that all cards were dealt
        }
    }
}