package WordPairLab;

public class WordPair {
    private String thePair;
    public WordPair (String first, String second) {
        thePair = "(" + first + "," + second + ")";
    }
    public String getFirst() {
        return thePair.substring(1,thePair.indexOf(","));
    }
    public String getSecond() {
        int loc = thePair.indexOf(",");
        return thePair.substring (loc+1, thePair.length()-1);
    }
}
