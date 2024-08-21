
//Questão 24
import java.util.Scanner;

public class NumerosPerfeitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;

        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Digite um número inteiro:");
            int num = scanner.nextInt();
            if (perfeito(num)) {
                if (num < menor) {
                    menor = num;
                }
            }
        }

        System.out.println("O menor número perfeito informado foi: " + menor);
        scanner.close();
    }

    public static boolean perfeito(int num) {
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }
}
