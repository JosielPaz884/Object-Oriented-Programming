import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> books;

    public Biblioteca() {
        this.books = new ArrayList<>();
    }

    public void addBook(Livro book) {
        books.add(book);
    }

    public void removeBook(Livro book) {
        books.remove(book);
    }

    public List<Livro> searchBookAuthor(String author) {
        List<Livro> booksByAuthor = new ArrayList<>();
        for (Livro book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public List<Livro> searchBookTitle(String titles) {
        List<Livro> booksByTitle = new ArrayList<>();
        for (Livro book : books) {
            if (book.getTitle().equals(titles)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }
}
