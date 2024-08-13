//Questão 7
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        double media = 6 / ((1 / nota1) + (2 / nota2) + (3 / nota3));

        if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
            System.out.println("Nota invalida");
        } else {
            System.out.println("A media ponderada e: " + media);
        }
        scanner.close();
    }
}
