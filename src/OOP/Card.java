package OOP;

public class Card {
    // Suits --> Clubs - 0, Diamonds - 1, Hearts - 2, Spades - 3
    // Ranks --> Ace, 1,2,3,4,5,6,7,8,9,10, Joker, Queen, King

    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] RANKS = {"Ace", "1", "2" , "3", "4" ,"5","6","7","8","9","10", "Joker", "Queen", "King"};

    private int suit;
    private int rank;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String toString(){
        return RANKS[this.rank]+ " of " +SUITS[this.suit];
    }
    public boolean equals (Card that){
        return this.rank==that.rank && this.suit==that.suit;
    }
}
