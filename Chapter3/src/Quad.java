import java.util.Scanner;

public class Quad {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Welcome to the Quad Program! In this program we will find the number of real roots a quadratic equation in the form of ax^2+bx+c can have.");

        System.out.println("\nWhat is your value for a?");
        double a= value.nextDouble();

        System.out.println("\nWhat is your value for b?");
        double b= value.nextDouble();

        System.out.println("\nWhat is your value for c?");
        double c= value.nextDouble();

        double disc= Math.pow(b,2)-(4*a*c);

        if(disc>0)
        {
            System.out.println("\nYour quadratic equation has 2 solutions.");
        }
        if (disc<0)
        {
            System.out.println("\nYour quadratic equation has no real solutions.");
        }
        if(disc==0)
        {
            System.out.println("\nYour quadratic equation has 1 real solution");
        }
    }
}
