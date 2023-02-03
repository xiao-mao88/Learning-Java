import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to your bank account, where you can deposit or withdraw money from your account!");

        boolean bank=true;
        double amount=0;
        do
        {
            Scanner value= new Scanner(System.in);
            System.out.println("\nWould you like to deposit or withdraw money?");
            System.out.println("1. Deposit\n2. Withdraw");
            int dw= value.nextInt();
            if(dw==1)
            {
                System.out.println("How much money would you like to deposit?");
                double deposit= value.nextDouble();
                amount= amount+deposit;
            }
            if(dw==2)
            {
                System.out.println("How much money would you like to withdraw?");
                double withdraw= value.nextDouble();
                amount= amount-withdraw;
            }
            System.out.println("The total amount of money in your bank account is $"+ amount);

            System.out.println("\nWould you like to make another deposit or withdraw?");
            System.out.println("1. Yes\n2. No");
            int replay= value.nextInt();
            if(replay==2)
            {
                bank=false;
            }
        }while(bank==true);
        System.out.println("Thanks for banking with us!");
    }
}
