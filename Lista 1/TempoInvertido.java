//Questão 17
import java.util.Scanner;

public class TempoInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] time = readNumber(scanner);
        System.out.println("Horário: " + time[0] + ":" + time[1] + ":" + time[2]);
        System.out.println("Digite a quantidade de segundos:");
        int segundos = scanner.nextInt();
        int[] timeInvertido = invertTime(time, segundos);
        System.out.println("Segundo Horário: " + timeInvertido[0] + ":" + timeInvertido[1] + ":" + timeInvertido[2]);
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

    private static int[] invertTime(int[] time, int segundos) {
        int convert = (time[0] * 3600) + (time[1] * 60) + time[2];
        int somaTime = Math.abs(convert + segundos);
        int horaInvertida = somaTime / 3600;
        int minutoInvertido = (somaTime % 3600) / 60;
        int segundoInvertido = somaTime % 60;
        return new int[] { horaInvertida, minutoInvertido, segundoInvertido };
    }
}
