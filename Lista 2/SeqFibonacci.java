
//Questão 17
import java.util.Scanner;

public class SeqFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int fibCount = 0;
        while (true) {
            int number = readnumber(scanner);
            if (number < 0) {
                break;
            }
            count++;
            if (fibonacci(number)) {
                fibCount++;
            }
        }
        double percentage = (double) fibCount / count * 100;
        System.out.println("A porcentagem de números que são números de Fibonacci é: " + percentage);
        scanner.close();
    }

    private static int readnumber(Scanner scanner) {
        System.out.println("Digite um número(para sair digite um número negativo):");
        int num = scanner.nextInt();
        return num;
    }

    private static boolean fibonacci(int number) {
        if (number < 0) {
            return false;
        }
        if (number == 0 || number == 1) {
            return true;
        }
        int x = 0;
        int y = 1;
        while (y < number) {
            int temp = x;
            x = y;
            y = temp + y;
        }
        return y == number;
    }
}
