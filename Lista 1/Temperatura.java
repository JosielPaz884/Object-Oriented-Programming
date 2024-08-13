//Questão 9
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = ((celsius * 180) / 100) + 32;
        double kelvin = celsius + 273.15;
        double rankine = fahrenheit + 459.67;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin);
        System.out.println("Temperatura em Rankine: " + rankine);
        scanner.close();
    }
}
