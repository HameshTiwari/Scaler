package LibraryManagementSystem;

public class Librarian extends User {
    private String employeeNumber;
    Librarian(String employeeNumber , String name , String contact)
    {
        super(name , contact);
        this.employeeNumber=employeeNumber;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Librarian DashBoard");
        System.out.println("Name "+getName()+" Employee Number "+employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void returnBook() {
        return;
    }

    public void addNewBook()
    {

    }
    public void removeBook()
    {

    }
}
