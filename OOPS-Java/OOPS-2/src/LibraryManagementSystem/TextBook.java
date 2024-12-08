package LibraryManagementSystem;

public class TextBook extends Book{
    private String subject;
    private int edition;


    TextBook(String isbn , String Author,String title , String subject,int edition){
        super(isbn,title,Author);
        this.subject=subject;
        this.edition=edition;

    }

    public void displayBookDetails()
    {
        System.out.println("Book Details :");
        System.out.println("Book title"+getTitle()+" ISBN "+getIsbn()+" Author "+getAuthor());
        System.out.println("Subject "+subject+" edition "+edition);
    }

}
