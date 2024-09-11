import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String titular = scanner.nextLine();
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(numeroConta, titular, saldo);
        System.out.println("Seu cadastro foi concluido!!");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Alterar Dados");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Ver dados de cadastro e saldo'");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome:");
                    String nome = scanner.next();
                    System.out.println("Digite o número da conta:");
                    int numero = scanner.nextInt();
                    System.out.println("Digite seu saldo:");
                    double sal = scanner.nextDouble();
                    conta.setTitular(nome);
                    conta.setNumeroConta(numero);
                    conta.setSaldo(sal);
                    System.out.println("Dados alterados com sucesso!!");
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 4:
                    System.out.println("Dados do Cadastro da Conta:\n--------------------");
                    System.out.println("Titularidade: " + conta.getTitular());
                    System.out.println("Numero da Conta: " + conta.getNumeroConta());
                    System.out.println("Saldo: " + conta.getSaldo());

                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
