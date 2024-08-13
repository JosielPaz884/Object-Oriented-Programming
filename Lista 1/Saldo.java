//Questão 12
import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        System.out.println("Digite a quantidade de meses:");
        int meses = scanner.nextInt();
        double taxaJuros = 20;
        double aux = saldoInicial * (1 + (taxaJuros / 100));
        double saldoFinal = Math.pow(aux, meses);
        System.out.println("O seu saldo final é: " + saldoFinal);
        scanner.close();
    }
}
