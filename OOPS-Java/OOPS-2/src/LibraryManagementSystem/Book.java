package LibraryManagementSystem;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String Author;
    private boolean isAvailable;

    Book()
    {
        isAvailable=true;
    }
    Book(String isbn,String title,String author ){
        this.isbn=isbn;
        this.title=title;
        this.Author=author;
        this.isAvailable=true;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks())
        {
            isAvailable=false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable=true;
        user.returnBook();
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public String getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return Author;
    }

    public abstract void displayBookDetails();


}
