//Questão 13-a
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de a:");
        int a = scanner.nextInt();
        System.out.println("Digite o número de b:");
        int b = scanner.nextInt();
        System.out.println("Digite o número de c:");
        int c = scanner.nextInt();
        int maiorAB = ((a + b) + (a - b)) / 2;
        int maiorABC = ((maiorAB + c) + (maiorAB - c)) / 2;
        System.out.println("O maior número é: " + maiorABC);
        scanner.close();
    }
}
