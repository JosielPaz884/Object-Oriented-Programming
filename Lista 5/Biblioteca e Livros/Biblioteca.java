import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    @Override
    protected void finalize() {
        System.out.println("Biblioteca destruída!");
        for (Livro livro : livros) {
            livro.biblioteca = null;
        }
    }
}