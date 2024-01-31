// Fig. 7.13: DeckofCardsTest.java
// Card shuffling and dealing.

public class DeckofCardsTest {
    public static void main(String[] args) {
        Deck myDeckOfCards = new Deck();
        myDeckOfCards.shuffle();
        
        for(int i = 0; i < 52; i++){
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}