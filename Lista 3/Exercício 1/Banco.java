import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String name = scanner.nextLine();
        System.out.println("Digite seu CPF:");
        String cpf = scanner.nextLine();
        System.out.println("Digite seu endereço:");
        String address = scanner.nextLine();
        Cliente client = new Cliente(name, cpf, address);
        System.out.println("Digite número da sua conta bancária:");
        int accountNumber = scanner.nextInt();
        ContaBancaria account = new ContaBancaria(accountNumber, client);
        System.out.println("Seu cadastro foi concluido!!");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Ver dados de cadastro'");
            System.out.println("5. Ver saldo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    account.deposit(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    account.withDraw(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o número da conta de destino: ");
                    int numberAccountDestiny = scanner.nextInt();
                    System.out.print("Digite o valor a transferir: ");
                    double valorTransferencia = scanner.nextDouble();
                    ContaBancaria accountDestiny = new ContaBancaria(numberAccountDestiny,
                            new Cliente("Maria da Silva", "987.654.321-00", "Rua dos Coqueiros, 456"));
                    account.transfer(accountDestiny, valorTransferencia);
                    break;

                case 4:
                    System.out.println("Dados do Cadastro da Conta:\n--------------------");
                    System.out.println("Nome: " + client.getName());
                    System.out.println("CPF: " + client.getCpf());
                    System.out.println("Endereço: " + client.getAddress());
                    System.out.println("Número da Conta:" + account.getAccountNumber());
                    break;

                case 5:
                    System.out.println("Saldo atual: " + account.getBalance());
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
