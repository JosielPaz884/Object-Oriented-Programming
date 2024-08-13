//Questão 3
import java.util.Scanner;

public class Dimensoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado a:");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor do lado b:");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor do lado c:");
        double c = scanner.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("A área do triângulo é: " + area);
        scanner.close();
    }
}
