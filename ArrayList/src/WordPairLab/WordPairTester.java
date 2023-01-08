package WordPairLab;
import java.util.ArrayList;

public class WordPairTester {
    public static void main(String[] args) {
        String[] Seuss= { "red", "fish", "blue", "fish", "one", "fish", "two", "fish"};
        WordPairList testing= new WordPairList(Seuss);
        System.out.println(testing.numMatches());
        System.out.print(testing);
    }
}
