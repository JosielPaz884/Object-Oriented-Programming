//Questão 16
import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora do primeiro horário:");
        int hora1 = readNumber(scanner);
        System.out.println("Digite a minuto do primeiro horário:");
        int minuto1 = readNumber(scanner);
        System.out.println("Digite a segundo do primeiro horário:");
        int segundo1 = readNumber(scanner);
        System.out.println("Primeiro Horário" + hora1 + ":" + minuto1 + ":" + segundo1);
        System.out.println("Digite a hora do segundo horário:");
        int hora2 = readNumber(scanner);
        System.out.println("Digite a minuto do segundo horário:");
        int minuto2 = readNumber(scanner);
        System.out.println("Digite a segundo do segundo horário:");
        int segundo2 = readNumber(scanner);
        System.out.println("Segundo Horário" + hora2 + ":" + minuto2 + ":" + segundo2);
        int convertSegundo1 = (hora1 * 3600) + (minuto1 * 60) + segundo1;
        int convertSegundo2 = (hora2 * 3600) + (minuto2 * 60) + segundo2;
        int sub = Math.abs(convertSegundo2 - convertSegundo1);
        System.out.println("A diferença entre os dois horários em segundo é: " + sub + " s");
        scanner.close();
    }

    private static int readNumber(Scanner scanner) {
        int number = scanner.nextInt();
        return number;
    }
}
