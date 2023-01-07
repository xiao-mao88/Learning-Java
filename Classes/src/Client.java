public class Client {
    //instance variables
    private String name;
    private Book B1;
    private Book B2;
    private Book B3;

    //constructors
    public Client (String n)
    {
        name= n;
    }

    public Client (String n, Book b1)
    {
        name= n;
        B1= b1;
    }

    public Client (String n, Book b1, Book b2)
    {
        name= n;
        B1= b1;
        B2= b2;
    }

    public Client (String n, Book b1, Book b2, Book b3)
    {
        name= n;
        B1= b1;
        B2= b2;
        B3= b3;
    }

    public boolean canBorrow()
    {
        if(B1==null || B2==null || B3==null)
        {
            return true;
        }
        return false;
    }

    public boolean returnBook (Book b)
    {
        if(b==B1)
        {
            System.out.println("Thank you for returning " + b.getTitle() + " by " + b.getAuth());
            B1=null;
            return true;
        }

        if(b==B2)
        {
            System.out.println("Thank you for returning " + b.getTitle() + " by " + b.getAuth());
            B2=null;
            return true;
        }

        if(b==B3)
        {
            System.out.println("Thank you for returning " + b.getTitle() + " by " + b.getAuth());
            B3=null;
            return true;
        }

        return false;
    }

    public boolean borrowBook (Book b)
    {
        if (B1==null)
        {
            B1=b;
            System.out.println("You have borrowed " + B1.getTitle() + " by " + B1.getAuth());
            return true;
        }

        else if (B2==null)
        {
            B2=b;
            System.out.println("You have borrowed " + B2.getTitle() + " by " + B2.getAuth());
            return true;
        }

        else if (B3==null)
        {
            B3=b;
            System.out.println("You have borrowed " + B3.getTitle() + " by " + B3.getAuth());
            return true;
        }

        System.out.println("You cannot borrow anymore books");
        return false;
    }

    public boolean hasBook (Book b)
    {
        if (b==B1 || b==B2 || b==B3)
        {
            System.out.println("Client " + name + " has " + b.getTitle() + " by " + b.getAuth());
            return true;
        }

        System.out.println("Client " + name + " does not have " + b.getTitle() + " by " + b.getAuth());
        return false;
    }

    public String toString ()
    {
        String result = "";
        result += "\nClient Name: " + name;

        result += "\n\nBook 1: ";
        if (B1 != null)
        {
            result += B1.getTitle() + " by " + B1.getAuth();
        }

        result += "\n\nBook 2: ";
        if (B2 != null)
        {
            result +=B2.getTitle() + " by " + B2.getAuth();
        }

        result += "\n\nBook 3: ";
        if (B3 != null)
        {
            result +=B3.getTitle() + " by " + B3.getAuth() + "\n";
        }

        return result;
    }
}