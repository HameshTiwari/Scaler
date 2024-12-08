package LibraryManagementSystem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextBook textBook1 = new TextBook("T111", "Khan sab", "Physic 101","Physics", 2 );
        TextBook textBook2 = new TextBook("T222", "Jumbo", "Jumbos Jumbooree", "English Lit", 1);
        NovelBook novelBook1 = new NovelBook("N111", "Premchand", "ek aur ek", "Hindi lit");
        NovelBook novelBook2 = new NovelBook("N222", "Robert Ludlum", "Something", "Mystery");

        LibraryManagementSystem.addBook(textBook1);
        LibraryManagementSystem.addBook(textBook2);
        LibraryManagementSystem.addBook(novelBook1);
        LibraryManagementSystem.addBook(novelBook2);

        Member member1 = new Member("Jagira", "123123123");
        Member member2 = new Member("Chopra", "112211221122");
        Member member3 = new Member("Baazigar", "9999999999");
        Librarian librarian1 = new Librarian("L111", "PC Bhargava", "221122112211");
        Librarian librarian2 = new Librarian("L222", "Shakila Begum", "332233223322");

        LibraryManagementSystem.registerNewUser(member1);
        LibraryManagementSystem.registerNewUser(member2);
        LibraryManagementSystem.registerNewUser(member3);
        LibraryManagementSystem.registerNewUser(librarian1);
        LibraryManagementSystem.registerNewUser(librarian2);

        System.out.println("---------Books----------");
        textBook1.displayBookDetails();
        textBook2.displayBookDetails();
        novelBook1.displayBookDetails();
        novelBook2.displayBookDetails();
        System.out.println();

        System.out.println("---------Users----------");
        member1.displayDashboard();
        member2.displayDashboard();
        librarian1.displayDashboard();
        librarian2.displayDashboard();

        System.out.println();
        if (textBook1.lend(member1)) {
            System.out.println("Member 1 lended textbook 1");
        } else {
            System.out.println("Member 1 NOT lended");
        }
        if (textBook2.lend(member2)) {
            System.out.println("Member 2 lended textBook2 ");
        } else {
            System.out.println("Member 2 NOT lened  textBook2 ");
        }
        if (textBook2.lend(member3)) {
            System.out.println("Member 3 lended textBook2 again ");
        } else {
            System.out.println("Member 3 NOT lended textBook2");
        }

        System.out.println();
        System.out.println("---------My Library ----------");
        LibraryManagementSystem.DisplayBooks();
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("---------My users ----------");
        LibraryManagementSystem.DisplayUsers();
        System.out.println("-----------------------------");

        System.out.println();
        System.out.println("---------Search for Books----------");
        List<Book> Books = LibraryManagementSystem.bookSearch("prem","NovelBook");
        System.out.println("Searched Book");
        for (Book book : Books) {
            book.displayBookDetails();
        }



    }
}