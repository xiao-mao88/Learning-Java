import java.util.Random;
import java.util.Scanner;

public class M8B {
    public static void main(String[] args) {
        System.out.println("Welcome to the Magic 8 Ball Program! Ask a yes or no question and obtain an answer!");
        boolean play=true;
        do
        {
            Scanner value= new Scanner(System.in);
            Random rand= new Random();
            System.out.println("\nWould you like to play verbose or normal?");
            System.out.println("\n1. Verbose\n2. Normal");
            int verbose= value.nextInt();

            if(verbose==1)
            {
                System.out.println("What is your yes or no question?");
                String x = value.nextLine();
                String question = value.nextLine();
                System.out.println("To answer your question: "+ question+ " \nMy answer is: ");
            }
            int int_random = rand.nextInt(20);
            int magicreply= int_random;
            switch (magicreply)
            {
                case 0:
                    System.out.println("Most likely");

                case 1:
                    System.out.println("It is certain.");
                    break;

                case 2:
                    System.out.println("It is decidedly so.");
                    break;

                case 3:
                    System.out.println("Without a doubt.");
                    break;

                case 4:
                    System.out.println("Yes-definitely.");
                    break;

                case 5:
                    System.out.println("You may rely on it.");
                    break;

                case 6:
                    System.out.println("As I see it, yes.");
                    break;

                case 7:
                    System.out.println("Outlook good.");
                    break;

                case 8:
                    System.out.println("Yes.");
                    break;

                case 9:
                    System.out.println("Signs point to yes.");
                    break;

                case 10:
                    System.out.println("Reply hazy, try again.");
                    break;

                case 11:
                    System.out.println("Ask again later.");
                    break;

                case 12:
                    System.out.println("Better not tell you now.");
                    break;

                case 13:
                    System.out.println("Cannot predict now.");
                    break;

                case 14:
                    System.out.println("Concentrate and ask again.");
                    break;

                case 15:
                    System.out.println("Don't count on it.");
                    break;

                case 16:
                    System.out.println("My reply is no.");
                    break;

                case 17:
                    System.out.println("My sources say no.");
                    break;

                case 18:
                    System.out.println("Outlook not so good.");
                    break;

                case 19:
                    System.out.println("Very doubtful.");
                    break;
            }

            System.out.println("\nWould you like to ask another question?");
            System.out.println("1. Yes\n2. No");
            int replay= value.nextInt();

            if(replay==2)
            {
                play=false;
            }
        }while(play==true);

        System.out.println("Thank you for playing the Magic 8 Ball Program! We hope you visit again sometime!");
    }
}
