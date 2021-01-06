import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book();
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canTakeBooks() {
        assertEquals(true, library.spaceAvailable());
    }

    @Test
    public void canAddABook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryFull() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(false, library.spaceAvailable());
    }
}
