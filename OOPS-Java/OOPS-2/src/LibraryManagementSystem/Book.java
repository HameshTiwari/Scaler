package LibraryManagementSystem;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String Author;
    private boolean isAvailable;

    Book(String isbn,String title,String author ){

    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean lend(User user)
    {

    }
    public void returnBook(User user)
    {

    }



}
