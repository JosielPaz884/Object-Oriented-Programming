public class Produto {
    private String name;
    private double price;
    private int quantity;

    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addProduct(int count) {
        this.quantity += count;
    }

    public void removeProduct(int count) {
        if (count <= this.quantity) {
            this.quantity -= count;
        } else {
            System.out.println("Quantidade insuficiente");
        }
    }

    public void ajustPrice(double percent) {
        this.price *= (1 + (percent / 100));
    }
}
