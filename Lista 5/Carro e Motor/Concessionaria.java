import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.println("Digite a marca do carro: ");
        String marca = scanner.nextLine();
        System.out.println("Digite o tipo de combustivel do carro: ");
        String tipoCombustivel = scanner.nextLine();
        System.out.println("Digite a potência do carro: ");
        double potencia = scanner.nextDouble();
        Carro carro = new Carro(marca, modelo);
        carro.setMotor(potencia, tipoCombustivel);
        System.out.println("");
        carro.printInformation();
        scanner.close();
    }
}