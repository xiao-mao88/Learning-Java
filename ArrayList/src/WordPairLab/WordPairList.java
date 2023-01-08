package WordPairLab;
import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs= new ArrayList<WordPair>();
    public WordPairList (String [] wrds)
    {
        for(int i=0; i<wrds.length; i++) {
            for(int j=i+1; j<wrds.length; j++){
                allPairs.add(new WordPair (wrds[i], wrds[j]));
            }
        }
    }

    public int numMatches(){
        int counter=0;
        for (int i=0; i<allPairs.size(); i++) {
            String first= allPairs.get(i).getFirst();
            String second= allPairs.get(i).getSecond();

            if(first.equals(second)==true) {
                counter++;
            }
        }
        return counter;
    }

    public String toString(){
        String newString = "";
        for (int i=0; i<allPairs.size(); i++){
            newString += allPairs.get(i) + "\n";
        }
        return newString;
    }
}
