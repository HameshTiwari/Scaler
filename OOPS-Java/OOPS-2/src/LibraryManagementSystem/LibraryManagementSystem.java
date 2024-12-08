package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
/*import LibraryManagementSystem.Book;
import LibraryManagementSystem.Member;
*/

public class LibraryManagementSystem {
    static List<Book> bookInventory = new ArrayList<>();
    static List<User> registeredUsers = new ArrayList<>();

    public static void addBook(Book book){
        bookInventory.add(book);
    }

    public static void registerNewUser(User user){
        registeredUsers.add(user);
    }

    public List<Book> getBooks(){
        return bookInventory;
    }
    public List<User> getRegisteredUsers(){
        return registeredUsers;
    }
    public static void DisplayBooks(){
        for (int i = 0; i < bookInventory.size(); i++) {
            Book bk = bookInventory.get(i);
            bk.displayBookDetails();
        }
    }
    public static void DisplayUsers(){
        for (int i = 0; i < registeredUsers.size(); i++) {
            User usr = registeredUsers.get(i);
            usr.displayDashboard();
        }
    }
    public static List<Book> bookSearch(String search){
        List<Book> SearchResults = new ArrayList<>();
        for(int i=0;i<bookInventory.size();i++){
            Book bk = bookInventory.get(i);
            if((bk.getAuthor().toLowerCase().contains(search.toLowerCase()))|| (bk.getTitle().toLowerCase().contains(search.toLowerCase())))
                SearchResults.add(bk);
        }
        return SearchResults;
    }

    public static List<Book> bookSearch(String search , String bookType){
        List<Book> SearchResults = new ArrayList<>();
        if(bookType=="TextBook") {
            for(int i = 0; i < bookInventory.size(); i++) {
                Book bk = bookInventory.get(i);
                if((bk.getAuthor().toLowerCase().contains(search.toLowerCase()))|| (bk.getTitle().toLowerCase().contains(search.toLowerCase())))
                    SearchResults.add(bk);
            }
        }
        else
        {
            if(bookType=="NovelBook") {
                for (int i = 0; i < bookInventory.size(); i++) {
                    Book bk = bookInventory.get(i);
                    if((bk.getAuthor().toLowerCase().contains(search.toLowerCase()))|| (bk.getTitle().toLowerCase().contains(search.toLowerCase())))
                        SearchResults.add(bk);
                }
            }
        }
        return SearchResults;
    }



}
