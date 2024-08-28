public class Carro {
    private String mark;
    private String model;
    private int year;
    private double mileage;

    // Construtor
    public Carro(String mark, String model, int year, double mileage) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Método para alterar a quilometragem total
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    // Método sobrecarregado para alterar a quilometragem percorrida em uma viagem
    public void setMileageTraveled(double mileageTraveled) {
        this.mileageTraveled += mileageTraveled;
    }

    // Método para obter a quilometragem atual
    public double getMileage() {
        return this.Mileage;
    }

    // Método para imprimir informações do carro
    public void imprimirInformacoes() {
        System.out.println("Marca: " + this.mark);
        System.out.println("Modelo: " + this.model);
        System.out.println("Ano: " + this.year);
        System.out.println("Quilometragem: " + this.mileage + " km");
    }
}
