import java.util.Scanner;
import java.util.ArrayList;

public class Estoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> products = new ArrayList<>();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1-Cadastrar produto");
            System.out.println("2-Listar produtos");
            System.out.println("3-Adicionar produtos ao estoque");
            System.out.println("4-Vender");
            System.out.println("5-Ajustar preço de um produto");
            System.out.println("6-Sair");
            System.out.println("Escolha uma opção:");
            int option = scanner.nextInt();
            System.out.println("");

            switch (option) {
                case 1:
                    System.out.println("Digite o nome do Produto:");
                    String name = scanner.next();
                    System.out.println("Digite a quantidade do Produto:");
                    int quantity = scanner.nextInt();
                    System.out.println("Digite o preço do Produto:");
                    double price = scanner.nextDouble();
                    Produto product = new Produto(name, price, quantity);
                    products.add(product);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    if (products.isEmpty()) {
                        System.out.println("Não há produtos no estoque!");
                    } else {
                        for (Produto p : products) {
                            System.out.println("Nome: " + p.getName());
                            System.out.println("Preço: R$" + p.getPrice());
                            System.out.println("Quantidade em estoque: " + p.getQuantityStock());
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Qual é o índice do produto que deseja adicionar ao estoque? ");
                    int indexAdd = scanner.nextInt();
                    int x = indexAdd - 1;
                    if (x >= 0 && x < products.size()) {
                        System.out.print("Quantos produtos deseja adicionar ao estoque? ");
                        int addQuantity = scanner.nextInt();
                        products.get(x).addStock(addQuantity);
                        System.out.println("Quantidade em estoque após adicionar " + addQuantity +
                                " produtos: " + products.get(x).getQuantityStock());
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Qual é o índice do produto que deseja vender do estoque? ");
                    int indexRemove = scanner.nextInt();
                    int y = indexRemove - 1;
                    if (y >= 0 && y < products.size()) {
                        System.out.print("Quantos produtos deseja vender do estoque? ");
                        int removeQuantity = scanner.nextInt();
                        products.get(y).sell(removeQuantity);
                        System.out.println("Quantidade em estoque após vender " + removeQuantity +
                                " produtos: " + products.get(y).getQuantityStock());
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 5:
                    System.out.print("Qual é o índice do produto que deseja ajustar o preço? ");
                    int indexAjust = scanner.nextInt();
                    int z = indexAjust - 1;
                    if (z >= 0 && z < products.size()) {
                        System.out.print("Digite novo preço: ");
                        double percent = scanner.nextDouble();
                        products.get(z).setPrice(percent);
                        ;
                        System.out.println("Preço após ajuste: R$" + products.get(z).getPrice());
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
