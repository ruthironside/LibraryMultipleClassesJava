import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void checkoutBook(Book book) {
        this.collection.add(book);
    }


    public void checkoutBookFromLibrary(Library library) {
        Book book = library.removeBook();
        checkoutBook(book);
    }
}
