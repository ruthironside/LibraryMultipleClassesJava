import java.util.ArrayList;
import java.util.HashMap;

public class Book {

        private String title;
        private String genre;
        private String author;

        public static void main(String[] args) {
            HashMap<String, Integer> genres = new HashMap<String, Integer>();

            genres.put("Fiction", 20);
            genres.put("Non Fiction", 30);
        }

        public Book(String title, String genre, String author) {
            this.title = title;
            this.genre = genre;
            this.author = author;
        }


    public Book() {

    }
}
