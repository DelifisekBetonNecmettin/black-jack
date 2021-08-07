
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck {
    
    private ArrayList<Card> cards;
    
    public Deck() {
        cards = new ArrayList<Card>();
        
        // Add 13 cards for all 4 suits
        char[] suits = {'S', 'D', 'H', 'C'};
        for (int suit = 0; suit < 4; suit++) {
            // Cards through 2-10
            for (int card = 2; card <= 10; card++) {
                Card newCard = new Card(card, suits[suit]);
                cards.add(newCard);
            }
            // Add A-J
            Card newCard = new Card('A', suits[suit]);
            cards.add(newCard);
            newCard = new Card('K', suits[suit]);
            cards.add(newCard);
            newCard = new Card('Q', suits[suit]);
            cards.add(newCard);
            newCard = new Card('J', suits[suit]);
            cards.add(newCard);
            
        }
        
    }
    
    public Card getCard(){
        // Get a random index
        Random r = new Random();
        int randomCardIndex = r.nextInt(cards.size());
        return cards.get(randomCardIndex);
    }
    
    public void shuffle() {
        // Shuffle cards
        Collections.shuffle(cards);
    }

}
