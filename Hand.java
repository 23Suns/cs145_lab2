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

        for (Card c : getCards()) {
            System.out.print("[" + c.toString() + "] ");
            score += c.getFaceValue();
        }
        System.out.println();

        System.out.print("Total value: " + score);
    }
}