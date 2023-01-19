import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Welcome to the JAVA rectangular calculator!\n");
        System.out.println("Please enter your width: ");
        double width = num.nextDouble();

        System.out.println("\nPlease enter your length: ");
        double length = num.nextDouble();

        double perimeter= 2*(length+width);
        double area= length*width;

        System.out.println("Your perimeter is: " + perimeter);
        System.out.println("Your area is: " +area);
    }
}
