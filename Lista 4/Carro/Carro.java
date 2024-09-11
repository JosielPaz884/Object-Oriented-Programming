public class Carro {
    private String mark;
    private String model;
    private int year;
    private double price;

    public Carro(String mark, String model, int year, double price) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void printInformation() {
        System.out.println("Marca: " + this.mark);
        System.out.println("Modelo: " + this.model);
        System.out.println("Ano: " + this.year);
        System.out.println("Preço: " + this.price + "reais");
    }
}
