import java.util.Random;

public class DieRoller {
    public static void main(String[] args) {
        Random generator= new Random();
        int num1;
        System.out.println("Welcome to the die roller program! This program will roll a d4, d6, d8, d10, d12, d20, and d100 dice.");

        num1= generator.nextInt(4);
        System.out.println("\n\nd4 roll: "+num1);

        num1= generator.nextInt(6);
        System.out.println("\nd6 roll: "+num1);

        num1= generator.nextInt(8);
        System.out.println("\nd8 roll: "+num1);

        num1= generator.nextInt(10);
        System.out.println("\nd10 roll: "+num1);

        num1= generator.nextInt(12);
        System.out.println("\nd12 roll: "+num1);

        num1= generator.nextInt(20);
        System.out.println("\nd20 roll: "+num1);

        num1= generator.nextInt(100);
        System.out.println("\nd100 roll: "+num1);
    }
}
