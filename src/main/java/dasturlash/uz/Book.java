package dasturlash.uz;

import java.util.List;

public class Book {
    private String title;
    private List<String> headers;

    public Book(String title, List<String> headers) {
        this.title = title;
        this.headers = headers;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", headers=" + headers + '}';
    }
}
