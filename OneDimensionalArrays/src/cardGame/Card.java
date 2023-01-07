package cardGame;

public class Card {
    private String suit;
    private String face;
    private int cardVal;

    //constructors
    public Card (String s, String f, int v) {
        suit=s;
        face= f;
        cardVal=v;
    }

    //setters
    public void setSuit(String su) {
        suit=su;
    }

    public void setFace(String fa) {
        face=fa;
    }

    public void setCardVal(int cv) {
        cardVal=cv;
    }

    //getters
    public String getSuit() {
        return suit;
    }
    public String getFace() {
        return face;
    }
    public int getCardVal() {
        return cardVal;
    }

    //tostring
    public String toString() {
        return face + " of " + suit + ", " + cardVal;
    }
}