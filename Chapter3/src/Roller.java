import java.util.Random;
import java.util.Scanner;

public class Roller {
    public static void main(String[] args) {
        System.out.println("Welcome! This program is designed to roll a dice of your choosing, giving you a random number!");
        boolean replay= true;
        do
        {
            Scanner value= new Scanner(System.in);
            Random rand= new Random();
            System.out.println("\nHow many sides does your dice have?");
            int dicesides= value.nextInt();
            int int_random = rand.nextInt(dicesides+1);
            int diceroll= int_random;
            if(int_random==0)
            {
                diceroll=int_random+1;
            }
            if(dicesides<=0)
            {
                System.out.println("Sorry. That is an invalid input. Would you like to try again?");
                System.out.println("1. Yes\n2. No");
                int choice= value.nextInt();
                if(choice==2)
                {
                    replay=false;
                }
            }

            if(dicesides>0)
            {
                System.out.println("You rolled a: "+diceroll);
                System.out.println("\nWould you like to try again?");
                System.out.println("1. Yes\n2. No");
                int choice= value.nextInt();
                if(choice==2)
                {
                    replay=false;
                }
            }
        }while (replay==true);

        System.out.println("\nThanks for playing, see you later!");
    }
}
