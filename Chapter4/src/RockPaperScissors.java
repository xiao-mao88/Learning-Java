import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        Random rand= new Random();
        System.out.println("Let's play some rock, papers, scissors! Best of 5!");
        int player=0, system=0;
        int round=1;
        boolean replay=true;

        do{
            System.out.println("\n1. Rock\n2. Paper\n3. Scissor");
            int choice=value.nextInt();
            int computer= rand.nextInt(3);

            //round
            System.out.println("\nRound: "+round);

            //print rock, paper scissor
            switch (choice)
            {
                case 1:
                    System.out.println("You chose rock.");
                    break;

                case 2:
                    System.out.println("You chose paper.");
                    break;

                case 3:
                    System.out.println("You chose scissor.");
                    break;
            }

            switch (computer)
            {
                case 0:
                    System.out.println("Computer chose rock.");
                    break;

                case 1:
                    System.out.println("Computer chose paper.");
                    break;

                case 2:
                    System.out.println("Computer chose scissor.");
                    break;
            }

            //computer wins round
            if(choice==1&&computer==1||choice==2&&computer==2||choice==3&&computer==0)
            {
                System.out.println("Computer wins the round!");
                system++;
                System.out.println("Computer has won: "+system+" rounds.\nPlayer has won: "+player+" rounds.");
            }

            //player wins round
            if(choice==2&&computer==0||choice==3&&computer==1||choice==1&&computer==2)
            {
                System.out.println("Player wins the round!");
                player++;
                System.out.println("Computer has won: "+system+" rounds.\nPlayer has won: "+player+" rounds.");
            }

            //tie
            if(choice==1&&computer==0||choice==2&&computer==1||choice==3&&computer==2)
            {
                System.out.println("It's a tie!");
                System.out.println("Computer has won: "+system+" rounds");
                System.out.println("Player has won: "+player+" rounds");
            }

            //winning game
            if(player>=3&&round<=5||player>system&&round>5)
            {
                System.out.println("You win! The computer has lost!");
                System.out.println("Play again?");
                System.out.println("1. Yes\n2. No");
                int playagain=value.nextInt();
                if(playagain==2);
                {
                    replay=false;
                }
                if(playagain==1)
                {
                    round=0;
                    system=0;
                    player=0;
                    replay=true;
                }
            }

            if(system>=3&&round<=5||system>player&&round>5)
            {
                System.out.println("You lost! The computer has won!");
                System.out.println("Play again?");
                System.out.println("1. Yes\n2. No");
                int playagain=value.nextInt();
                if(playagain==2);
                {
                    replay=false;
                }
                if(playagain==1)
                {
                    round=0;
                    system=0;
                    player=0;
                    replay=true;
                }
            }

            round++;
        }while(replay==true);

        System.out.println("\nThanks for playing!");
    }
}
