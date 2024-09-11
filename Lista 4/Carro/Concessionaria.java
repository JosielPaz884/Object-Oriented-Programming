public class Concessionaria {
    public static void main(String[] args) {
        Carro myCar = new Carro("Ford", "Focus", 2015, 0);
        System.out.println("Informações iniciais do carro:");
        myCar.setPrice(1000);
        System.out.println("\nInformações do carro após somar quilometragem de viagem:");
        myCar.printInformation();
    }
}
