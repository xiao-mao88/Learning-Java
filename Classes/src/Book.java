public class Book {
    private String title;
    private String author;

    public Book (String t, String a)
    {
        title= t;
        author= a;
    }

    //setters
    public void setTitle (String t)
    {
        title=t;
    }

    public void setAuth (String a)
    {
        author= a;
    }

    //getters
    public String getTitle()
    {
        return title;
    }

    public String getAuth()
    {
        return author;
    }

    public String toString()
    {
        return "Title: " + title + "\nAuthor: " + author;
    }
}
