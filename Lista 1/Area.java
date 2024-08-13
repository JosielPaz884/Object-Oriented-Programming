//Questão 1
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do Retângulo:");
        double altura = scanner.nextDouble();
        System.out.println("Digite a largura do Retângulo:");
        double largura = scanner.nextDouble();
        double area = altura * largura;
        System.out.println("A área do retângulo é: " + area);
        scanner.close();
    }
}
