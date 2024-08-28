public class RideCarro{
  public static void main(String[] args) {
        Carro myCar = new Carro("Ford", "Focus", 2015, 0);
        System.out.println("Informações iniciais do carro:");
        myCar.printInformation();
        myCar.setMileage(10000); 
        System.out.println("\nInformações do carro após alterar a quilometragem total:");
        myCar.imprimirInformacoes();
        myCar.setMileageTraveled(500, true); 
        System.out.println("\nInformações do carro após somar quilometragem de viagem:");
        myCar.printInformation());
    }
}
