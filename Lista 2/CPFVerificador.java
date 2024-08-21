
//Questão 32
import java.util.Scanner;

public class CPFVerificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cpf = readnumber(scanner);
        int[] digits = new int[11];
        for (int i = 0; i < 9; i++) {
            digits[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        int[] verifier = verifyDigit(digits);
        System.out.println("Os dois últimos dígitos verificadores são: " + verifier[9] + "" + verifier[10]);
        scanner.close();
    }

    private static String readnumber(Scanner scanner) {
        System.out.println("Digite os primeiros nove dígitos do seu CPF:");
        String digit = scanner.next();
        return digit;
    }

    private static int[] verifyDigit(int[] digits) {
        int sum = (10 * digits[0]) + (9 * digits[1]) + (8 * digits[2]) + (7 * digits[3]) +
                (6 * digits[4]) + (5 * digits[5]) + (4 * digits[6]) + (3 * digits[7]) + (2 * digits[8]);
        int rest = sum % 11;
        if (rest == 0 || rest == 1) {
            digits[9] = 0;
        } else {
            digits[9] = 11 - rest;
        }
        sum = (11 * digits[0]) + (10 * digits[1]) + (9 * digits[2]) + (8 * digits[3]) +
                (7 * digits[4]) + (6 * digits[5]) + (5 * digits[6]) + (4 * digits[7]) + (3 * digits[8])
                + (2 * digits[9]);
        rest = sum % 11;
        if (rest == 0 || rest == 1) {
            digits[10] = 0;
        } else {
            digits[10] = 11 - rest;
        }
        return digits;
    }
}
