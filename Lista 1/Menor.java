//Questão 13-b
import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de a:");
        int a = scanner.nextInt();
        System.out.println("Digite o número de b:");
        int b = scanner.nextInt();
        System.out.println("Digite o número de c:");
        int c = scanner.nextInt();
        System.out.println("Digite o número de d:");
        int d = scanner.nextInt();
        int menorAB = ((a + b) - (a - b)) / 2;
        int menorABC = ((menorAB + c) - (menorAB - c)) / 2;
        int menorABCD = ((menorABC + d) - (menorABC - d)) / 2;
        System.out.println("O menor número é: " + menorABCD);
        scanner.close();
    }
}
