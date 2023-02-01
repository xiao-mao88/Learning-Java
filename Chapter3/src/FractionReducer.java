import java.util.Scanner;

public class FractionReducer {
    public static void main(String[] args) {
        System.out.println("Welcome! This program is designed to help you reduce fractions!");
        boolean replay=true;
        do
        {
            Scanner value= new Scanner(System.in);
            System.out.println("Please insert your numerator: ");
            int num= value.nextInt();
            System.out.println("Please insert your denominator: ");

            int dem= value.nextInt();
            int gcf=1;
            for(int i=2; i<=num; i++)
            {
                if (num%i==0 && dem%i==0)
                {
                    gcf= i;
                }
            }
            int num2= num/gcf;
            int dem2= dem/gcf;

            if(dem2==1)
            {
                System.out.println("Your new fraction is: "+ num2);
            }

            else
            {
                System.out.println("Your new fraction is: "+ num2 + "/"+ dem2);
            }

            System.out.println("\nWould you like to try again?");
            System.out.println("1. Yes\n2. No");
            int choice= value.nextInt();

            if(choice==2)
            {
                replay=false;
            }
        }while(replay==true);
    }
}
