import java.util.Scanner;

public class TempConv2 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Welcome! This program will convert your temperature in fahrenheit to celsius or your temperature in celsius.");

        System.out.println("\nWhat is the temperature?");
        double temp= value.nextDouble();

        System.out.println("\nWhat are the units for your temperature? Enter '1' for fahrenheit and enter '2' for celsius.");
        double choice= value.nextDouble();

        if(choice==1)
        {
            double conversion= (temp-32)*(5/9);
            System.out.println("\nYour new temperature is "+conversion+ " degrees celsius.");
        }
        if(choice==2)
        {
            double conversion= (temp*(5/9))+32;
            System.out.println("\nYour new temperature is "+conversion+ " degrees fahrenheit.");
        }
    }
}
