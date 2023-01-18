import java.util.Scanner;

public class TemConv1 {
    public static void main(String[] args) {

        final int BASE=32;
        final double conversion=5.0/9.0;
        int farenheittemp;
        double celsiustemp;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your temperature in fahrenheit (integer): ");

        farenheittemp = in.nextInt();

        celsiustemp=conversion*(farenheittemp-BASE);

        System.out.println("Fahrenheit Temperature: " + farenheittemp);
        System.out.println("Celsius Equivalent: " + celsiustemp);
    }
}
