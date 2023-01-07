package cardGame;
import java.util.Scanner;

public class CardTester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        DeckofCards doc = new DeckofCards();

        System.out.println("How many cards do you want?");
        int numberOfCards= input.nextInt();

        int sum=0;
        for (int k = 0; k < numberOfCards; k++) {
            Card c= doc.Deal();
            System.out.println(c);
            sum+=c.getCardVal();
        }

        if (sum>21) {
            System.out.println("Your total sum is: " + sum + " which is greater than 21.");
        }

        if (sum<21) {
            System.out.println("Your total sum is: " + sum + " which is less than 21.");
        }

        if (sum==21) {
            System.out.println("Your total sum is: " + sum + " which is equal to 21.");
        }

        System.out.println("\nThe deck: ");
        System.out.println(doc.toString());
    }
}