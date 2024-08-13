//Questão 10
import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = ((fahrenheit - 32) * 100) / 180;
        System.out.println("A temperatura em celsius é: " + celsius);
        scanner.close();
    }
}
