import java.util.Scanner;

public class LetterTracker {
    public static String letterFrequencyInWord (String word, String ltr) {
        int len = word.length();
        int count = 0;
        for (int p = 0; p<len; p++){
            if(word.substring(p,p+1).equals(ltr))
            {
                count++;
            }
        }

        if(count==0)
        {
            return "NONE";
        }
        else if ((double)count/len>=0.5)
        {
            return "HIGH";
        }
        return "LOW";
    }

    public static void main (String [] argos) {
        Scanner in = new Scanner ( System.in );
        String wrd, letter;
        for (int j = 0; j < 3; j++) {
            System.out.println("Enter a word");
            wrd = in.next();
            System.out.println("Enter a letter");
            letter = in.next();
            System.out.println("The frequency of '" + letter
                    + "' in '" + wrd + "' is " + letterFrequencyInWord(wrd,letter));
            System.out.println();
        }
    }
}
