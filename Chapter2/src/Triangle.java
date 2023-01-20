import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Welcome! This program will take in the sides of a triangle " +
                "and calculate the perimeter & area for you!");

        System.out.println("\nSide Length 1: ");
        double Length1= value.nextDouble();

        System.out.println("\nSide Length 2: ");
        double Length2= value.nextDouble();

        System.out.println("\nSide Length 3:");
        double Length3= value.nextDouble();

        System.out.println("\nWhat are your units?");
        String x= value.nextLine();
        String units= value.nextLine();

        double perimeter = Length1+Length2+Length3;
        double s = perimeter/2;
        double inside = s*(s-Length1)*(s-Length2)*(s-Length3);
        double area = Math.pow(inside, 0.5);

        System.out.println("\nYour perimeter is: " + perimeter + " " + units);
        System.out.println("\nYour area is: " + area + " " + units);
    }
}
