//Questão 2
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do triângulo:");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do triângulo:");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
        scanner.close();
    }
}
