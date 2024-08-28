import java.util.List;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca library = new Biblioteca();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1-Cadastrar livro");
            System.out.println("2-Remover livro");
            System.out.println("3-Buscar livros por autor");
            System.out.println("4-Buscar livros por título");
            System.out.println("5-Sair");
            System.out.print("Escolha uma opção:");
            int option = scanner.nextInt();
            System.out.println("");

            switch (option) {
                case 1:
                    addBooks(library, scanner);
                    break;

                case 2:
                    removeBooks(library, scanner);
                    break;

                case 3:
                    searchBookAuthors(library, scanner);
                    break;

                case 4:
                    searchBookTitles(library, scanner);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void addBooks(Biblioteca library, Scanner scanner) {
        System.out.print("Título do livro:");
        String title = scanner.next();
        System.out.print("Autor do livro:");
        String author = scanner.next();
        System.out.print("Ano de publicação do livro:");
        int yearPublic = scanner.nextInt();
        Livro book = new Livro(title, author, yearPublic);
        library.addBook(book);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void removeBooks(Biblioteca library, Scanner scanner) {
        System.out.print("Título do livro a remover:");
        String titles = scanner.next();
        Livro book = searchBook(library, titles);
        if (book != null) {
            library.removeBook(book);
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private static void searchBookAuthors(Biblioteca library, Scanner scanner) {
        System.out.print("Autor a buscar:");
        String author = scanner.next();
        List<Livro> books = library.searchBookAuthor(author);
        if (books.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            System.out.println("Livros de " + author + ":");
            for (Livro book : books) {
                System.out.println(book.getTitle());
            }
        }
    }

    private static void searchBookTitles(Biblioteca library, Scanner scanner) {
        System.out.print("Título a buscar:");
        String title = scanner.next();
        List<Livro> books = library.searchBookTitle(title);
        if (books.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            System.out.println("Livros com título '" + title + "':");
            for (Livro book : books) {
                System.out.println(book.getTitle());
            }
        }
    }

    private static Livro searchBook(Biblioteca library, String title) {
        for (Livro book : library.books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
