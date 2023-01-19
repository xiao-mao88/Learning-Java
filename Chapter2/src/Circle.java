import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Welcome to the circle program where we will calculate the area of your circle!");

        System.out.println("\nPlease input the radius of the circle: ");
        double radius= value.nextDouble();
        double area= (Math.pow(radius,2)) *3.14;

        System.out.println("\nPlease input the units of the circle: ");
        String bleh= value.nextLine();
        String units= value.nextLine();

        System.out.println("\nYour calculated area is " + area+ " " +units);
    }
}
