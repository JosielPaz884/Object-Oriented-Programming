
//Questão 8
import java.util.Scanner;

public class Inteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();
        int z = 0;
        for (int x = 0; x < num + 1; x++) {
            z = z + x;
        }
        System.out.println(z);
        scanner.close();
    }
}
