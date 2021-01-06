import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower("Pete");
        book = new Book();
        library = new Library();
        library.addBook(book);
    }

    @Test
    public void borrowerStartsWithNoBooks() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void borrowerCanBorrowBook() {
        borrower.checkoutBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void borrowerCanBorrowBookFromLibrary() {
        Book book = library.removeBook();
        assertEquals(0, library.bookCount());
    }
}
