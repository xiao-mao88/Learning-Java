import java.util.Scanner;
public class ErrorChecking {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean play=true;
        String num="NUMBER";

        do {
            Scanner input = new Scanner(System.in);

            //inputs
            System.out.println("Please enter a word made up only of letters from the word \"NUMBER\"");
            String userWord= input.nextLine();
            String upperCase= userWord.toUpperCase();
            int len = userWord.length();

            //check for validity
            boolean check=true;
            for (int i=0;i<=len-1;i++)
            {
                String letter= upperCase.substring(i,i+1);
                if(num.indexOf(letter)<0)
                {
                    System.out.println("Your input is not valid");
                    i=len;
                    check=false;
                }
            }

            //output
            if(check)
            {
                System.out.println("Your input is valid");
            }

            //play again
            System.out.println("\nWould you like to play again?\n1. Yes\n2. No");
            int playagain= input.nextInt();
            if(playagain==2)
            {
                play=false;
            }
            System.out.print("\n");
        }while (play==true);

        System.out.print("Program ended, thank you for playing! OwO");
    }

}