import java.util.Scanner;

public class LittleAdventureMagicGirlVersion {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Welcome to Madoka Magica's Adventure! Let's begin!");
        boolean replay=true;
        do{
            System.out.println("You are taking a walk one day, and a weird animal-like...thing comes up to you.\n" + "'Hee....hee....hee... Hello sacrifi- I mean chosen one! You have been chosen to be a Magical Girl! Will you take on the glory of fighting evil?");
            System.out.println("1. Yes\n2. No");
            int magicgirl= value.nextInt();
            //continue 1
            if(magicgirl==1)
            {
                System.out.println("'Wonderful!' The creature hands you a wristwatch with a small disk on it, 'To transform, just yell out TRANSFORMATION, and you will become the perfect magic girl!' Upon handing you the item, the creature vanishes and leaves...");

                System.out.println("A bit confused, you continue about your day. You wake up the next day and go to school (or work we don't discriminate). On the way, you see a hostage situation! Will you save the people, or will you act like you know nothing?");
                System.out.println("1. Transform and save the day!\n2. Leave the vicinity immediately.\n");
                int savehostages= value.nextInt();

                //save hostages
                if(savehostages==1)
                {
                    System.out.println("\nYou yell out TRANSFORMATION and turn into a pink dressed magical girl. But wait- what are your powers? As you ponder what to do, another magical girl in a sky blue dress appears.");
                    System.out.println("'Hello, are you new or something?' asks the magical girl. You nod your head and the magical girl smirks. 'I'm Aira, you can check out your powers by pressing the red button on your watch, but do hurry up there's kind of a situation going on.'");
                    System.out.println("Would you like to press the button?");
                    System.out.println("1. Press the button!\n2. Don't press the button.");
                    int pressbutton= value.nextInt();

                    if(pressbutton==1)
                    {
                        System.out.println("\nYou press the red button and out pops a system notification. Welcome! As you fight evil and collect karma points your powers will naturally level up! Here are your starter stats: ");
                    }

                    if(pressbutton==2)
                    {
                        System.out.println("\nAs you fumble around with the wristwatch, Aira fights the robbers. Just as you decide to press the red button, it's too late! Aira gets bombarded by bullets and dies.");
                        System.out.println("Suddenly, a purple portal appears and the weird creature appears as well.");
                        System.out.println("'Tsk, tsk. What an.... oh well,' it sighs. The creature pulls Aira into the portal. 'At least she'll make good fertilizer....'\nThe creature then turns to you and says, 'Best of luck to you as well, remember, there's also a quota of daily karma points.... I hope you won't need to find out what happens if it isn't followed...' Leaving these words, the creature vanishes.");
                        System.out.println("Karma points? Finally, you press the red button and a notification welcoming you and showing your stats pops up. At the bottom there is a not explaining karma points are earned by doing good each day, and there is a minimum of 10 karma points needed daily.");
                        System.out.println("Will you go and save the hostages & to obtain the karma points?");
                        System.out.println("1. Yes\n2. No");
                        int savehostages2= value.nextInt();

                        if(savehostages2==1)
                        {
                            System.out.println("You use your magic skills and save the hostages! You receive the 10 daily karma points needed.");
                        }

                        if(savehostages2==2);
                        {
                            System.out.println("\nYou give up on trying to save the hostages and continue to your destination. You make it in the nick of time, but what are you going to do about those missing karma points?");
                            System.out.println("1. Ignore them\n2. After you are done, go and attempt to obtain the missing karma points");
                            int obtainpoints= value.nextInt();

                            //bad end 2
                            if(obtainpoints==1)
                            {
                                System.out.println("\nWhat karma points pfft. You decide to ignore the fact that you do not have enough karma points and go about your day. As midnight comes around you begin to have this feeling of dread...");
                                System.out.println("At exactly midnight, a purple portal suddenly opens. An arm grabs out and snatches you!\n\nYou DIED!");
                                System.out.println("Would you like to play again?");
                                System.out.println("1. Yes\n2. No");
                                int playagain= value.nextInt();
                                if(playagain==2)
                                {
                                    replay=false;
                                }
                            }

                            if(obtainpoints==2)
                            {
                                System.out.println("After your work day, you hurriedly transform and scour the city for any 'good' you can do.");
                            }
                        }
                    }
                }

                //don't save hostages
                if(savehostages==2)
                {
                    System.out.println("You speedwalk away from the hostage situation. Suddenly you hear somebody else yell 'TRANSFORM'. You turn your head to see a magical girl in a sky blue uniform! You watch as the magical girl attempts to save the hostages, but she is having a hard time. What will you do?");
                    System.out.println("1. Transform and help the 'comrade'\n2. Ignore and leave.");
                }
            }

            //bad end 1
            if (magicgirl==2)
            {
                System.out.println("'WELL I see you have made your CHOICE', cackled the animal, 'Death is the only option you have left... perhaps your luck will be better in another lifetime!'");
                System.out.println("A scythe appears into the hands of the creature and pierces into you, slicing your body in half.");
                System.out.println("\nYOU DIED!");

                //play again?
                System.out.println("\nWould you like to play again?");
                System.out.println("1. Yes\n2. No");
                int playagain= value.nextInt();

                if(playagain==2)
                {
                    replay=false;
                }
            }
        }while(replay==true);

        System.out.println("Thanks for playing Madoka Magica's Adventure! See you next time!");
    }
}
