// Fig. 7.13: DeckofCardsTest.java
// Card shuffling and dealing.
import java.util.Scanner;

public class DeckofCardsTest {
    public static void main(String args[]) {
        Deck deck = new Deck();
        deck.shuffle();

        String input = "";

        Scanner scanner = new Scanner(System.in);

        while(true) { 
            
            Hand hand = new Hand(deck);
            
            hand.printHand();
            System.out.println();
            
            System.out.println("Get new hand? (y/n): ");
            
            input = scanner.nextLine();
            if(!input.equalsIgnoreCase("y")) {
                break;
            } else  if(deck.dealCard() == null){
                System.out.println("No More Cards. Thanks for playing!");
                break;
            }
        }
    }
}