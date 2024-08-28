public class Livro {
    private String title;
    private String author;
    private int yearPublic;

    public Livro(String title, String author, int yearPublic) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublic() {
        return yearPublic;
    }
}
