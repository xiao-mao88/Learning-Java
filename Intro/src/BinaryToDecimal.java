import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean play=true;
        do
        {
            boolean ask=true;
            Scanner input= new Scanner(System.in);
            System.out.println("Please input a number in binary:");
            int binary= input.nextInt();
            int find=binary, count=0;

            //number length
            while (find!= 0)
            {
                find /= 10;
                ++count;
            }


            //conversion
            double dec=0;
            while (binary > 0) {
                for (int i=0; i<count; i++)
                {
                    int num=binary%10;
                    if(num!=0&&num!=1)
                    {
                        System.out.println("Your input is not in binary. Please try again.\n");
                        binary=0;
                        i=count+1;
                        ask=false;
                    }
                    double number=num*Math.pow(2, i);
                    binary = binary / 10;
                    dec= dec+ number;
                }
            }

            //play again
            if(ask)
            {
                System.out.println("Your decimal value is: "+Math.round(dec));
                System.out.println("Would you like to play again?\n1. Yes\n2. No");
                int playagain=input.nextInt();
                if(playagain==2)
                {
                    play=false;
                }
                System.out.print("\n");
            }

        }while(play==true);
        System.out.print("Thank you for playing!");
    }

}