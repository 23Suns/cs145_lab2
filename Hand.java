public class Hand {

    private Card[] cards;

    public Hand(Deck deck) {
        this.cards = new Card[5];
        for (int i = 0; i < 5; i++) {
            this.cards[i] = deck.dealCard();
        }
    }

    public Card getCard(int index) {
        return this.cards[index];
    }

    public Card[] getCards() {
        return cards;
    }

    public void printHand() {
        int score = 0;
        
        System.out.println();
        
        for (Card c : getCards()) {
            if(c != null) {
                System.out.print("[" + c.toString() + "] ");
                score += c.getFaceValue();
            } else {
                c = null;
                break;
            }
        }
        System.out.println("Total value: " + score);
    }
}