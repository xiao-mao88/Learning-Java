import java.util.Scanner;

public class SecretCode {
    //valid length
    private static boolean isValidLength (String s)
    {
        int len=s.length();
        if (2<=len&&len<=12)
        {
            return true;
        }
        return false;
    }

    //convert to ASCII
    private static int charToAscii (String s)
    {
        int count=0;
        for (int i=0; i<s.length();i++)
        {
            char result= s.charAt(i);
            count=result+count;
        }
        return count;
    }

    //number of digits
    private static int getNumDigits (int n)
    {
        int counting=0;
        int digits=0;
        for (int j=1; j>counting; j++)
        {
            n=n/10;
            if(n<1)
            {
                counting=j+2;
            }
            digits++;
        }
        return digits;
    }

    //turn to secret code
    private static String getSecretCode (int number)
    {
        int pair1=number/100;
        int pair2=number%100;
        if(pair1<65)
        {
            pair1+=61;
        }

        if(pair2<65)
        {
            pair2+=61;
        }

        String secret1=Character.toString((char)pair1);
        String secret2=Character.toString((char)pair2);
        String code= secret1+secret2;
        return code;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean again=true;
        Scanner input= new Scanner(System.in);


        do {
            //user input
            System.out.println("What would you like to convert to code?");
            String user= input.nextLine();

            //check length
            if (isValidLength(user)==false)
            {
                System.out.println("Not a valid input. Please make sure your input is at least 2 characters and at most 12.\n");
            }

            else
            {
                System.out.println("Sum of ASCII Codes: " + charToAscii(user));

                int num=charToAscii(user);

                //times 10?
                if(getNumDigits(num)%2!=0)
                {
                    num*=10;
                }

                //4000?
                if(num<=4000)
                {
                    num*=4;
                    System.out.println("Less than 4000--> "+ num);
                }

                else
                {
                    System.out.println("More than 4000--> "+ num);
                }

                if(getNumDigits(num)%2!=0)
                {
                    num/=10;
                }

                System.out.println("Secret Code: "+ getSecretCode(num));

                //try again?
                System.out.println("\nWould you like to convert another code?\n1. Yes\n2. No");
                int play= input.nextInt();
                if(play==2)
                {
                    again=false;
                }
                System.out.print("\n");
                String bleh= input.nextLine();
            }

        }while(again==true);
        System.out.println("Thank you for playing!");
    }
}
