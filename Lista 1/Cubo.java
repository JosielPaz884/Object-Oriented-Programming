//Questão 5
import java.util.Scanner;

public class Cubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da aresta do cubo:");
        double aresta = scanner.nextDouble();
        double volume = Math.pow(aresta, 3);
        double area = 6 * (Math.pow(aresta, 2));
        System.out.println("O volume do cubo é: " + volume);
        System.out.println("A área do cubo é: " + area);
        scanner.close();
    }
}
