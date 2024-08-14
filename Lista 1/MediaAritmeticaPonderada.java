//Questão 14
import java.util.Scanner;

public class MediaAritmeticaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de a:");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de b:");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor de c:");
        double c = scanner.nextDouble();
        double maior = Math.max(a, Math.max(b, c));
        double pesoMaior = 4.0;
        double peso = 3.0;
        double somaPonderada = 0.0;
        if (a == maior) {
            somaPonderada += a * pesoMaior;
            somaPonderada += b * peso;
            somaPonderada += c * peso;
        } else if (b == maior) {
            somaPonderada += a * peso;
            somaPonderada += b * pesoMaior;
            somaPonderada += c * peso;
        } else {
            somaPonderada += a * peso;
            somaPonderada += b * peso;
            somaPonderada += c * pesoMaior;
        }
        double mediaPonderada = somaPonderada / (pesoMaior + (2 * peso));
        System.out.printf("A média aritmética ponderada é:" + mediaPonderada);
        scanner.close();
    }
}
