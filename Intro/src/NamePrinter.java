import java.util.Scanner;
public class NamePrinter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name;

        System.out.println("What is your name?\n");

        Scanner input = new Scanner (System.in);

        name=input.nextLine();

        System.out.print("\n");

        int len = name.length();

        //regular name
        System.out.print(name.substring(0,len));

        //name backwards
        System.out.println("\n");
        for(int i=len; 0<i;i--)
        {
            String back = name.substring(i-1,i);
            System.out.print(back);
        }
        System.out.print("\n\n");

        //name vertical
        for(int i=0;i<=len-1;i++)
        {
            String letter = name.substring(i,i+1);
            System.out.println(letter);
        }
        System.out.println("\n");

        //name diagonal
        for(int i=0; i<=len-1;i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            String diag = name.substring(i,i+1);
            System.out.println(diag);
        }

    }
}
