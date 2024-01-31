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

    public int score () {

        int pairCount = 0;
        int threeCount = 0;
        int fourCount = 0;

        //Count frequency of each value
        for (Card c : this.cards) {
            if(c.getValue)
        }
    }
}