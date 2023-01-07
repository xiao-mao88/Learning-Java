package cardGame;

public class DeckofCards {
    private Card[] Deck;
    private int nextCard;

    //constructor
    public DeckofCards() {
        nextCard= 0;
        Deck= new Card [52];
        String[] suits= {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] faces= {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        int [] values= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int c=0;
        for(int s=0; s<suits.length; s++){
            for (int f= 0; f< faces.length; f++) {
                Deck[c]= new Card(suits[s], faces[f], values[f]);
                c++;
            }
        }
    }

    //shuffle
    public void shuffleDeck() {
        for(int k=Deck.length-1; k>0; k--) {
            int s= (int)(Math.random()*k);
            Card temporyCard= Deck[k];
            Deck[k]= Deck[s];
            Deck[s]= temporyCard;
        }
    }

    //deal
    public Card Deal() {
        nextCard++;
        this.shuffleDeck();
        int thecard= nextCard-1;
        if(nextCard>=52) {
            this.shuffleDeck();
            nextCard=0;
            return Deck[0];
        }
        return Deck[thecard];
    }

    //tostring
    public String toString() {
        String s="";
        for(int i=0; i<Deck.length; i++) {
            s+=Deck[i];
            s+="\n";
        }
        return s;
    }
}