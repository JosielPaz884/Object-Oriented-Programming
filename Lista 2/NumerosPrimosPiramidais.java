
//Questão 25
import java.util.ArrayList;
import java.util.List;

public class NumerosPrimosPiramidais {
    public static void main(String[] args) {
        List<Integer> pyramidNumbers = new ArrayList<>();
        int number = 2;
        while (pyramidNumbers.size() < 100) {
            if (pyramidNumber(number)) {
                pyramidNumbers.add(number);
                System.out.println("Número piramidal " + pyramidNumbers.size() + ": " + number);
            }
            number++;
        }
    }

    private static boolean pyramidNumber(int num) {
        int number = 1;
        while (true) {
            int pyramidNumber = (number * (number + 1) * (2 * number + 1)) / 6;
            if (pyramidNumber == num) {
                return true;
            } else if (pyramidNumber > num) {
                return false;
            }
            number++;
        }
    }
}
