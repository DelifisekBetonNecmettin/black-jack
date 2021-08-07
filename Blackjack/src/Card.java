
public class Card {
    
    private String name;
    private int value;
    
    // Constructor for cards A-J
    public Card(char value, char suit) {
        this.name = value + "" + suit;
        
        if (value == 'J' || value == 'Q' || value == 'K') {
            this.value = 10;
        } 
        else if (value == 'A') {
            this.value = 1;
        }
    }
    
    // Constructor for cards 2-10
    public Card(int value, char suit) {
        this.name = value + "" + suit;
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String getName() {
        return this.name;
    }
}
