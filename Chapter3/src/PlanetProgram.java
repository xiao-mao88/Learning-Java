import java.util.Scanner;

public class PlanetProgram {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Welcome! This program will tell you your weight and age on a planet of your choosing based off of your weight and age on earth.");

        System.out.println("What is your age?");
        double age= value.nextDouble();

        System.out.println("\nWhat is your weight (in pounds)?");
        double weight= value.nextDouble();

        System.out.println("\nWhich planet would you like to choose: \n 1: Mercury\n 2: Venus\n 3: Earth\n 4: Mars\n 5: Jupiter\n 6: Saturn \n 7: Uranus \n 8: Neptune \n 9: Pluto");
        int choice= value.nextInt();
        System.out.println("\n");

        //Mercury
        if (choice==1)
        {
            double age1= age/0.241;
            double weight1= weight*0.38;
            System.out.println("Your age on Mercury will be "+age1+" Earth years and your weight will be "+weight1+" pounds.");
        }

        //Venus
        if (choice==2)
        {
            double age1= age/0.615;
            double weight1= weight*0.91;
            System.out.println("Your age on Venus will be "+age1+" Earth years and your weight will be "+weight1+" pounds.");
        }

        //Earth
        if (choice==3)
        {
            System.out.println("Your age on Earth will be "+age+" Earth years and your weight will be "+weight+" pounds.");
        }

        //Mars
        if (choice==4)
        {
            double age1= age/1.888;
            double weight1= weight*0.38;
            System.out.println("Your age on Mars will be "+age1+" Earth years and your weight will be "+weight1+" pounds.");
        }

        //Jupiter
        if (choice==5)
        {
            double age1= age/11.9;
            double weight1= weight*2.36;
            System.out.println("Your age on Jupiter will be "+age1+" Earth years and your weight will be "+weight1+" pounds.");
        }

        //Saturn
        if (choice==6)
        {
            double age1= age/29.5;
            double weight1= weight*0.91;
            System.out.println("Your age on Saturn will be "+age1+" Earth years and your weight will be "+weight1+" pounds.");
        }

        //Uranus
        if (choice==7)
        {
            double age1= age/84.0;
            double weight1= weight*0.89;
            System.out.println("Your age on Uranus will be "+age1+" Earth years and your weight will be "+weight1+" pounds.");
        }

        //Neptune
        if (choice==8)
        {
            double age1= age/164.8;
            double weight1= weight*1.12;
            System.out.println("Your age on Neptune will be "+age1+" Earth years and your weight will be "+weight1+" pounds.");
        }

        //Pluto
        if (choice==9)
        {
            double age1= age/248.5;
            double weight1= weight*0.06;
            System.out.println("Your age on Pluto will be "+age1+" Earth years and your weight will be "+weight1+" pounds.");
        }
    }
}
