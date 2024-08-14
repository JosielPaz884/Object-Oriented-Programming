//Questão 16
import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] time1 = readNumber(scanner);
        System.out.println("Primeiro Horário: " + time1[0] + ":" + time1[1] + ":" + time1[2]);
        int[] time2 = readNumber(scanner);
        System.out.println("Segundo Horário: " + time2[0] + ":" + time2[1] + ":" + time2[2]);
        int sub = convert(time1, time2);
        System.out.println("A diferença entre os dois horários em segundo é: " + sub + " s");
        scanner.close();
    }

    private static int[] readNumber(Scanner scanner) {
        System.out.println("Digite a hora do horário:");
        int hora = scanner.nextInt();
        System.out.println("Digite a minuto do horário:");
        int minuto = scanner.nextInt();
        System.out.println("Digite a segundo do horário:");
        int segundo = scanner.nextInt();
        return new int[] { hora, minuto, segundo };
    }

    private static int convert(int[] time1, int[] time2) {
        int convertSegundo1 = (time1[0] * 3600) + (time1[1] * 60) + time1[2];
        int convertSegundo2 = (time2[0] * 3600) + (time2[1] * 60) + time2[2];
        int sub = Math.abs(convertSegundo2 - convertSegundo1);
        return sub;
    }
}
