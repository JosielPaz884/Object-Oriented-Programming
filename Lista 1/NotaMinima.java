//Questão 8
import java.util.Scanner;

public class NotaMinima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        double notaMinima = (3 * nota1 * nota2) / (nota1 + 2 * nota2) - nota2 - (2 * nota1);
        int aux = -1;
        double total = notaMinima * aux;
        System.out.printf("A nota mínima para aprovação é: " + total);
        scanner.close();
    }
}
