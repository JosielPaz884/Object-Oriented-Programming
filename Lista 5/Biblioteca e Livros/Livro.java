public class Livro {
    private String titulo;
    private String autor;
    private Biblioteca biblioteca;

    public Livro(String titulo, String autor, Biblioteca biblioteca) {
        this.titulo = titulo;
        this.autor = autor;
        this.biblioteca = biblioteca;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    protected void finalize() {
        System.out.println("Livro " + titulo + " destruído!");
    }
}
