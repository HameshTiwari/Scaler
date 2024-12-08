package LibraryManagementSystem;

public class NovelBook extends Book {
    String genre;

    NovelBook(String isbn , String Author,String title , String genre){
        super(isbn,title,Author);
        this.genre=genre;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("Book Details :");
        System.out.println("Book title"+getTitle()+" ISBN "+getIsbn()+" Author "+getAuthor());
        System.out.println("Subject "+genre);
    }
}
