import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        Random rand= new Random();
        int pv1=0;
        int pv2=0;
        int draw=0;
        int dp1=0;
        int dp2=0;
        int dealerdraw=0;
        System.out.println("Let's play a game of BlackJack!");
        boolean play=true;
        int round=1;
        do
        {
            System.out.println("The dealer has drawn a card and the other is hidden. The drawn card is: ");
            int dealerCard1= rand.nextInt(12);
            int dealerCard2= rand.nextInt(12);

            //dealercards (one shown one secret)
            switch(dealerCard1)
            {
                case 0:
                    System.out.println("an ace-- point value= 11");
                    dp1=11;
                    break;

                case 1:
                    System.out.println("a two-- point value=2");
                    dp1=2;
                    break;

                case 2:
                    System.out.println("a three-- point value=3");
                    dp1=3;
                    break;

                case 3:
                    System.out.println("a four-- point value=4");
                    dp1=4;
                    break;

                case 4:
                    System.out.println("a five-- point value=5");
                    dp1=5;
                    break;

                case 5:
                    System.out.println("a six-- point value=6");
                    dp1=6;
                    break;

                case 6:
                    System.out.println("a seven-- point value=7");
                    dp1=7;
                    break;

                case 7:
                    System.out.println("a eight-- point value=8");
                    dp1=8;
                    break;

                case 8:
                    System.out.println("a nine-- point value=9");
                    dp1=9;
                    break;

                case 9:
                    System.out.println("a ten-- point value=10");
                    dp1=10;
                    break;

                case 10:
                    System.out.println("a jack-- point value=11");
                    dp1=11;
                    break;

                case 11:
                    System.out.println("a queen-- point value=11");
                    dp1=11;
                    break;

                case 12:
                    System.out.println("a king-- point value=11");
                    dp1=11;
                    break;
            }
            switch(dealerCard2)
            {
                case 0:
                    dp2=11;
                    break;

                case 1:
                    dp2=2;
                    break;

                case 2:
                    dp2=3;
                    break;

                case 3:
                    dp2=4;
                    break;

                case 4:
                    dp2=5;
                    break;

                case 5:
                    dp2=6;
                    break;

                case 6:
                    dp2=7;
                    break;

                case 7:
                    dp2=8;
                    break;

                case 8:
                    dp2=9;
                    break;

                case 9:
                    dp2=10;
                    break;

                case 10:
                    dp2=11;
                    break;

                case 11:
                    dp2=11;
                    break;

                case 12:
                    dp2=11;
                    break;
            }
            int dealerTotal= dp1+dp2;

            //playercards
            System.out.println("Here are your two cards: ");
            int playerCard1= rand.nextInt(12);
            int playerCard2= rand.nextInt(12);
            switch(playerCard1)
            {
                case 0:
                    System.out.println("You got an ace-- point value= 11");
                    pv1=11;
                    break;

                case 1:
                    System.out.println("You got a two-- point value=2");
                    pv1=2;
                    break;

                case 2:
                    System.out.println("You got a three-- point value=3");
                    pv1=3;
                    break;

                case 3:
                    System.out.println("You got a four-- point value=4");
                    pv1=4;
                    break;

                case 4:
                    System.out.println("You got a five-- point value=5");
                    pv1=5;
                    break;

                case 5:
                    System.out.println("You got a six-- point value=6");
                    pv1=6;
                    break;

                case 6:
                    System.out.println("You got a seven-- point value=7");
                    pv1=7;
                    break;

                case 7:
                    System.out.println("You got a eight-- point value=8");
                    pv1=8;
                    break;

                case 8:
                    System.out.println("You got a nine-- point value=9");
                    pv1=9;
                    break;

                case 9:
                    System.out.println("You got a ten-- point value=10");
                    pv1=10;
                    break;

                case 10:
                    System.out.println("You got a jack-- point value=11");
                    pv1=11;
                    break;

                case 11:
                    System.out.println("You got a queen-- point value=11");
                    pv1=11;
                    break;

                case 12:
                    System.out.println("You got a king-- point value=11");
                    pv1=11;
                    break;
            }

            switch(playerCard2)
            {
                case 0:
                    System.out.println("You got an ace-- point value= 11");
                    pv2=11;
                    break;

                case 1:
                    System.out.println("You got a two-- point value=2");
                    pv2=2;
                    break;

                case 2:
                    System.out.println("You got a three-- point value=3");
                    pv2=3;
                    break;

                case 3:
                    System.out.println("You got a four-- point value=4");
                    pv2=4;
                    break;

                case 4:
                    System.out.println("You got a five-- point value=5");
                    pv2=5;
                    break;

                case 5:
                    System.out.println("You got a six-- point value=6");
                    pv2=6;
                    break;

                case 6:
                    System.out.println("You got a seven-- point value=7");
                    pv2=7;
                    break;

                case 7:
                    System.out.println("You got a eight-- point value=8");
                    pv2=8;
                    break;

                case 8:
                    System.out.println("You got a nine-- point value=9");
                    pv2=9;
                    break;

                case 9:
                    System.out.println("You got a ten-- point value=10");
                    pv2=10;
                    break;

                case 10:
                    System.out.println("You got a jack-- point value=11");
                    pv2=11;
                    break;

                case 11:
                    System.out.println("You got a queen-- point value=11");
                    pv2=11;
                    break;

                case 12:
                    System.out.println("You got a king-- point value=11");
                    pv2=11;
                    break;
            }

            int totalPoints=pv1+pv2;

            System.out.println("Your total points are: "+totalPoints);
            boolean hitpass=true;

            //player loss; greater than 21
            if (totalPoints>21)
            {
                System.out.println("Sorry you have lost this game of blackjack! Dealer has won!");
                hitpass=false;
                play=false;
            }

            //hit or pass

            while(hitpass==true)
            {
                System.out.println("\nHit or pass? \n1. Hit\n2. Pass.");
                int hitorPass= value.nextInt();

                if(hitorPass==1)
                {
                    int drawagain= rand.nextInt(12);
                    switch(drawagain)
                    {
                        case 0:
                            System.out.println("You got an ace-- point value= 11");
                            draw=11;
                            break;

                        case 1:
                            System.out.println("You got a two-- point value=2");
                            draw=2;
                            break;

                        case 2:
                            System.out.println("You got a three-- point value=3");
                            draw=3;
                            break;

                        case 3:
                            System.out.println("You got a four-- point value=4");
                            draw=4;
                            break;

                        case 4:
                            System.out.println("You got a five-- point value=5");
                            draw=5;
                            break;

                        case 5:
                            System.out.println("You got a six-- point value=6");
                            draw=6;
                            break;

                        case 6:
                            System.out.println("You got a seven-- point value=7");
                            draw=7;
                            break;

                        case 7:
                            System.out.println("You got a eight-- point value=8");
                            draw=8;
                            break;

                        case 8:
                            System.out.println("You got a nine-- point value=9");
                            draw=9;
                            break;

                        case 9:
                            System.out.println("You got a ten-- point value=10");
                            draw=10;
                            break;

                        case 10:
                            System.out.println("You got a jack-- point value=11");
                            draw=11;
                            break;

                        case 11:
                            System.out.println("You got a queen-- point value=11");
                            draw=11;
                            break;

                        case 12:
                            System.out.println("You got a king-- point value=11");
                            draw=11;
                            break;
                    }
                    totalPoints= totalPoints+draw;
                    System.out.println("Your total points are: "+totalPoints);
                }

                if(hitorPass==2||totalPoints>21)
                {
                    hitpass=false;
                }
            }
            if(totalPoints>21)
            {
                System.out.println("Sorry you have lost this game of blackjack! Dealer has won!");
                play=false;
            }

            if (play==true&&dealerTotal<16)
            {
                System.out.println("\nDealer hits: ");
            }

            while (dealerTotal<16&&play==true)
            {
                int dealerHits= rand.nextInt();
                for (int i=1; i<=dealerHits; i++)
                {
                    int dealerDrawAgain= rand.nextInt(12);

                    switch(dealerDrawAgain)
                    {
                        case 0:
                            System.out.println("Dealer got an ace-- point value= 11");
                            dealerdraw=11;
                            break;

                        case 1:
                            System.out.println("Dealer got a two-- point value=2");
                            dealerdraw=2;
                            break;

                        case 2:
                            System.out.println("Dealer got a three-- point value=3");
                            dealerdraw=3;
                            break;

                        case 3:
                            System.out.println("Dealer got a four-- point value=4");
                            dealerdraw=4;
                            break;

                        case 4:
                            System.out.println("Dealer got a five-- point value=5");
                            draw=5;
                            break;

                        case 5:
                            System.out.println("Dealer got a six-- point   value=6");
                            draw=6;
                            break;

                        case 6:
                            System.out.println("Dealer got a seven-- point value=7");
                            dealerdraw=7;
                            break;

                        case 7:
                            System.out.println("Dealer got a eight-- point value=8");
                            dealerdraw=8;
                            break;

                        case 8:
                            System.out.println("Dealer got a nine-- point value=9");
                            dealerdraw=9;
                            break;

                        case 9:
                            System.out.println("Dealer got a ten-- point value=10");
                            dealerdraw=10;
                            break;

                        case 10:
                            System.out.println("Dealer got a jack-- point value=11");
                            dealerdraw=11;
                            break;

                        case 11:
                            System.out.println("Dealer got a queen-- point value=11");
                            dealerdraw=11;
                            break;

                        case 12:
                            System.out.println("Dealer got a king-- point value=11");
                            dealerdraw=11;
                            break;
                    }

                    dealerTotal=dealerdraw+dealerTotal;

                    if(dealerTotal>=16)
                    {
                        i=dealerHits+1;
                    }
                }
            }

            System.out.println("\nThe Dealer has a total of: "+dealerTotal);
            System.out.println("You have a total of: "+totalPoints);

            //player win
            if(dealerTotal>21||totalPoints<=21&&dealerTotal<=21&&totalPoints>dealerTotal)
            {
                System.out.println("Player has won! Congratulations!");
                play=false;
            }

            //player loss pt.2
            if(dealerTotal==totalPoints||totalPoints<=21&&dealerTotal<=21&&totalPoints<dealerTotal)
            {
                System.out.println("Sorry! You have lost this game of blackjack! Dealer has won!");
                play=false;
            }

        }while(play==true);

        System.out.println("Thank you for playing!");
    }
}
