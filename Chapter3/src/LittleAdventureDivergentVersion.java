import java.util.Scanner;

public class LittleAdventureDivergentVersion {
    public static void main(String[] args) {
        System.out.println("Welcome to the little adventure game, where you can choose your own " +
                "adventure! Let's Begin!");

        boolean play=true;

        do
        {
            Scanner value = new Scanner(System.in);
            System.out.println("You are in a room, in front of you are two doors- Red and Blue." +
                    " Which do you choose?");
            System.out.println("1. Red\n2. Blue");
            int choice1= value.nextInt();

            if(choice1==1)
            {
                System.out.println("You arrive at another room. In front of you are two items- " +
                        "a block of cheese and a knife. Which do you choose?");
                System.out.println("1. Block of cheese\n2. Knife");
                int item1= value.nextInt();

                if(item1==1)
                {
                    System.out.println("You pick up the block of cheese and suddenly see a dog " +
                            "baring its fangs at you. What do you do?");
                    System.out.println("1. Throw the block of cheese.\n2. Try to make peace with " +
                            "the dog.");
                    int throwcheese= value.nextInt();

                    if(throwcheese==1)
                    {
                        System.out.println("You throw the block of cheese as far as you can, " +
                                "and it distracts the dog, giving you time to slip away.");
                        System.out.println("Congratulations! You resonate the most with the " +
                                "Erudite faction. Please choose wisely on choosing day!");
                        System.out.println("Would you like to try again?");
                        System.out.println("1. Yes\n2. No");
                        int replay= value.nextInt();
                        if(replay==1)
                        {
                            play=true;
                        }
                        else
                        {
                            play=false;
                        }
                    }

                    if(throwcheese==2)
                    {
                        System.out.println("You sit down to try and make peace with the dog. " +
                                "It works.");
                        System.out.println("Congratulations! You resonate the most with the " +
                                "Amity faction. Please choose wisely on choosing day!");
                        System.out.println("Would you like to try again?");
                        System.out.println("1. Yes\n2. No");
                        int replay= value.nextInt();
                        if(replay==1)
                        {
                            play=true;
                        }
                        else
                        {
                            play=false;
                        }
                    }
                }

                if(item1==2)
                {
                    System.out.println("You pick up the knife and suddenly see a dog baring its " +
                            "fangs at you. What do you do?");
                    System.out.println("1. Use the knife to fight the dog\n2. Run away");
                    int useknife= value.nextInt();

                    if(useknife==1)
                    {
                        System.out.println("You use the knife and stab the dog.");
                        System.out.println("Congratulations! You resonate the most with the " +
                                "Dauntless faction. Please choose wisely on choosing day.");

                        System.out.println("Would you like to try again?");
                        System.out.println("1. Yes\n2. No");
                        int replay= value.nextInt();
                        if(replay==1)
                        {
                            play=true;
                        }
                        else
                        {
                            play=false;
                        }
                    }

                    if(useknife==2)
                    {
                        System.out.println("You try to run away from the dog, but it begins to " +
                                "chase you and catches you.");
                        System.out.println("No faction wishes to own you. You are factionless. " +
                                "Best of luck...");

                        System.out.println("Would you like to try again?");
                        System.out.println("1. Yes\n2. No");
                        int replay= value.nextInt();
                        if(replay==1)
                        {
                            play=true;
                        }
                        else
                        {
                            play=false;
                        }
                    }
                }
            }

            if(choice1==2)
            {
                System.out.println("You arrive at another room. You see a feeble old man. " +
                        "What do you do?");
                System.out.println("1. Approach the old man\n2. Ignore the old man");
                int approach= value.nextInt();

                if(approach==1)
                {
                    System.out.println("The old man looks at you and asks, 'Do you know this man?" +
                            "' as he points at the newspaper photo of a wanted criminal. You do " +
                            "know this man... in fact, he is your best friend. What do you do?");
                    System.out.println("1. Tell the truth\n2. Lie");
                    int truefalse= value.nextInt();

                    if(truefalse==1)
                    {
                        System.out.println("You tell the man the truth and your best friend is caught.");
                        System.out.println("Congratulations! You resonate the most with the Candor " +
                                "faction! Please choose wisely on choosing day!");

                        System.out.println("Would you like to try again?");
                        System.out.println("1. Yes\n2. No");
                        int replay= value.nextInt();
                        if(replay==1)
                        {
                            play=true;
                        }
                        else
                        {
                            play=false;
                        }
                    }

                    if(truefalse==2)
                    {
                        System.out.println("You lie to the old man. He eyes you suspiciously and" +
                                " threatens to put your into jail, but you keep your mouth shut");
                        System.out.println("Congratulations! You resonate the most with the " +
                                "Abnegation faction! Please choose wisely on choosing day!");

                        System.out.println("Would you like to try again?");
                        System.out.println("1. Yes\n2. No");
                        int replay= value.nextInt();
                        if(replay==1)
                        {
                            play=true;
                        }
                        else
                        {
                            play=false;
                        }
                    }
                }

                if(approach==2)
                {
                    System.out.println("You decide to ignore the old man and continue on your " +
                            "way. Suddenly, the old man comes running towards you with a knife! " +
                            "What do you do?");
                    System.out.println("1. Stay and fight\n2. Try to reason");
                    int flightfight= value.nextInt();

                    if(flightfight==1)
                    {
                        System.out.println("You stay and fight the old man. You win.");
                        System.out.println("Congratulations! You resonate the most with the " +
                                "Dauntless faction. Please choose wisely on choosing day!");
                        System.out.println("Would you like to try again?");
                        System.out.println("1. Yes\n2. No");
                        int replay= value.nextInt();
                        if(replay==1)
                        {
                            play=true;
                        }
                        else
                        {
                            play=false;
                        }
                    }

                    if(flightfight==2)
                    {
                        System.out.println("You try to reason with the old man. It works and he " +
                                "listens.");
                        System.out.println("Congratulations! You resonate the most with the " +
                                "Erudite faction! Please choose wisely on choosing day!");

                        System.out.println("Would you like to try again?");
                        System.out.println("1. Yes\n2. No");
                        int replay= value.nextInt();
                        if(replay==1)
                        {
                            play=true;
                        }
                        else
                        {
                            play=false;
                        }
                    }
                }
            }
        }
        while(play==true);
        System.out.println("Thanks for playing! We hope to see you again!");
    }
}
