import java.util.Random;
import java.util.Scanner;

public class DungeonQuest {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        Random rand= new Random();
        boolean play=true;
        int round= 1;

        System.out.println("Welcome to the Dungeon Quest game! Here are the rules:");
        System.out.println("1. There are two players (you vs. the computer *ahem* monster) and each player will be given a set of 3 cards-- Slash, Mighty Blow, and Leap Aside. ");
        System.out.println("2. Mighty Blow beats Slash, but Leap Aside beats Mighty Blow");
        System.out.println("3. Slash beats Leap Aside, but Mighty Blow beats slash");
        System.out.println("4. Leap Aside beats Mighty Blow, but Slash beats Leap Aside");
        System.out.println("5. If Mighty Blow and Slash are used by both players at the same time, Mighty Blow will cause 2 damage to the player who used Slash, while Slash will cause 1 damage to the player who used Mighty Blow");
        System.out.println("Let's Play!");

        System.out.println("\nHow many hit points would you like to have?");
        int pp= value.nextInt();
        System.out.println("How many hit points does the monster have?");
        int mp= value.nextInt();

        do
        {
            System.out.println("\nRound: "+round+"\nChoose your attack: \n1. Slash\n2. Mighty Blow\n3. Leap Aside");
            int playerAttack= value.nextInt();
            int monsterAttack= rand.nextInt(3);

            switch(playerAttack)
            {
                case 1:
                    System.out.println("You used Slash.");
                    break;
                case 2:
                    System.out.println("You used Mighty Blow.");
                    break;
                case 3:
                    System.out.println("You used Leap Aside.");
                    break;
            }

            switch (monsterAttack)
            {
                case 0:
                    System.out.println("The monster used Slash.");
                    break;
                case 1:
                    System.out.println("The monster used Mighty Blow.");
                    break;
                case 2:
                    System.out.println("The monster used Leap Aside.");
                    break;
            }

            //tie
            if(playerAttack==1&&monsterAttack==0||playerAttack==2&&monsterAttack==1||playerAttack==3&&monsterAttack==2)
            {
                mp=mp-1;
                pp=pp-1;
                System.out.println("Both you and the monster have lost 1 hp.");
            }

            //monster wins round
            if(monsterAttack==2&&playerAttack==2||monsterAttack==0&&playerAttack==3)
            {
                System.out.println("You have lost 1 hp.");
                pp=pp-1;
            }
            if(monsterAttack==1&&playerAttack==1)
            {
                pp=pp-2;
                mp=mp-1;
                System.out.println("You have lost 2 hp. Monster has lost 1 hp.");
            }

            //player wins round
            if(playerAttack==3&&monsterAttack==1||playerAttack==1&&monsterAttack==2)
            {
                System.out.println("Monster has lost 1 hp.");
                mp=mp-1;
            }
            if(playerAttack==2&&monsterAttack==0)
            {
                System.out.println("You have lost 1 hp. Monster has lost 2 hp.");
                mp=mp-2;
                pp=pp-1;
            }

            //print health
            System.out.println("\nPlayer health: "+pp);
            System.out.println("Monster health: "+mp);

            //double death
            if(pp<=0&&mp<=0)
            {
                System.out.println("Double Whammy! Both you and the monster have died at the same time!");
                play= false;
            }

            //player death
            if(pp<=0)
            {
                System.out.println("\nYou lost to the monster! Bleh x__x");
                play=false;
            }

            //monster death
            if(mp<=0)
            {
                System.out.println("\nYou defeated the monster! Yay /^u^/");
                play=false;
            }
            round++;
        }while (play==true);
    }
}
