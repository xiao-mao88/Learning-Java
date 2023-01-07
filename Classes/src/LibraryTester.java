public class LibraryTester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //tester code
        //books
        Book b1= new Book ("The Catcher in the Rye", "J. D. Salinger");
        Book b2= new Book ("Pride and Prejudice", "Jane Austen");
        Book b3= new Book ("The Art of War", "Sun Tzu");
        Book b4= new Book ("The Little Match Girl", "Hans Christian Anderson");
        //client
        Client cl1= new Client("Lauren");

        //borrow book
        System.out.println(cl1.borrowBook(b1));
        System.out.println(cl1.borrowBook(b2));
        System.out.println(cl1.borrowBook(b3));
        System.out.println(cl1.borrowBook(b4));

        //return book
        System.out.println(cl1.returnBook(b2));

        //current state
        System.out.println(cl1);

        //check if client has book
        System.out.println(cl1.hasBook(b1));
        System.out.println(cl1.hasBook(b4));

        //return/borrow c4
        System.out.println(cl1.returnBook(b4));
        System.out.println(cl1.borrowBook(b4));

        //can borrow
        System.out.println(cl1.canBorrow());
    }
}