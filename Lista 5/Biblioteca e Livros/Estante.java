public class Estante {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", biblioteca);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", biblioteca);
        Livro livro3 = new Livro("O Código da Vinci", "Dan Brown", biblioteca);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        System.out.println("Livros da biblioteca:");
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }
        biblioteca.removerLivro(livro2);
        System.out.println("\nLivros da biblioteca após remover um livro:");
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }
        biblioteca = null;
        System.gc();
        try {
            System.out.println("\nLivros da biblioteca após destruir a biblioteca:");
            for (Livro livro : biblioteca.getLivros()) {
                System.out.println(livro.getTitulo() + " - " + livro.getAutor());
            }
        } catch (NullPointerException e) {
            System.out.println("Biblioteca destruída!");
        }
    }
}