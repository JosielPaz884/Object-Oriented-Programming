//Questão 11
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a coordenada do x1:");
        double x1 = scanner.nextDouble();
        System.out.println("Digite a coordenada do y1:");
        double y1 = scanner.nextDouble();
        System.out.println("Digite a coordenada do x2:");
        double x2 = scanner.nextDouble();
        System.out.println("Digite a coordenada do y2:");
        double y2 = scanner.nextDouble();
        double x = x2 - x1;
        double y = y2 - y1;
        double finalx = Math.pow(x, 2);
        double finaly = Math.pow(y, 2);
        double distancia = Math.sqrt(finalx + finaly);
        System.out.println("A distancia entre os pontos é: " + distancia);
        scanner.close();
    }
}
