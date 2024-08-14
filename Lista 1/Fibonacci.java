//Questão 15
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number = readNumber();
        double s = (1 + Math.sqrt(5)) / 2;
        double fib = Math.round(Math.pow(s, number) / Math.sqrt(5));
        System.out.println("Número de Fibonacci na posição " + number + " é:" + fib);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
}
