import java.util.*;

public class Library {
    private ArrayList<Book> collection;
    
    public Library() {
        this.collection = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.collection.add(newBook);
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> matches = new ArrayList<Book>();
        for (Book book : collection) {
            if (StringUtils.included(book.title(), title)) {
                matches.add(book);
            }
        }
        return matches;
    }
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> matches = new ArrayList<Book>();
        for (Book book : collection) {
            if (StringUtils.included(book.publisher(), publisher)) {
                matches.add(book);
            }
        }
        return matches;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> matches = new ArrayList<Book>();
        for (Book book : collection) {
            if (book.year() == year) {
                matches.add(book);
            }
        }
        return matches;
    }
    
    public void printBooks() {
        for (Book book : collection) {
            System.out.println(book);
        }
    }
}
