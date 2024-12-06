package LibraryManagementSystem;

public class Member extends User {
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT=5;

    Member()
    {
        super();
        borrowedBooksCount=0;
    }
    Member(String name , String contact)
    {
        super(name,contact);
        borrowedBooksCount=0;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Books Borrowed="+borrowedBooksCount);
        System.out.println(getName() +" "+getContactInfo());
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;

    }
}
