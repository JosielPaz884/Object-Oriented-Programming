//Questão 4
import java.util.Scanner;

public class Seno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado a do Triângulo:");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor do lado b do Triângulo");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor do ângulo do Triângulo:");
        double angulo = scanner.nextDouble();
        double seno = Math.sin(angulo * Math.PI / 180);
        double area = (a * b * seno) / 2;
        System.out.println("A área do triângulo é: " + area);
        scanner.close();
    }
}
