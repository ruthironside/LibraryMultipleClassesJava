import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalogue;
    private int capacity;

    public Library() {
        this.catalogue = new ArrayList<Book>();
        this.capacity = 2;
    }

    public int bookCount() {
        return this.catalogue.size();
    }

    public void addBook(Book book) {
        this.catalogue.add(book);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean spaceAvailable() {
        int totalBooks = bookCount();
        return totalBooks < this.capacity;
    }

    public Book removeBook() {
        return this.catalogue.remove(0);
    }

}
