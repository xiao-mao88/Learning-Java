import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Welcome to the distance program! This program is designed " + "to help you calculate the distance between two points on" + " a coordinate plane. Let's get started!");

        System.out.println("\nWhat is the x value of your first coordinate?");
        float x1 = value.nextFloat();

        System.out.println("\nWhat is the y value of your first coordinate?");
        float y1 = value.nextFloat();

        System.out.println("\nWhat is the x value of your second coordinate?");
        float x2 = value.nextFloat();

        System.out.println("\nWhat is the y value of your second coordinate?");
        float y2 = value.nextFloat();

        float x=x1-x2;
        float y= y1-y2;

        double dist = Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));

        System.out.println("\nThe distance between your two coordinates is " + dist + " units");
    }
}
