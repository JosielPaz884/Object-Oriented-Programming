public class Produto {
    private String name;
    private int quantityStock;
    private double price;

    public Produto(String name, double price, int quantityStock) {
        this.name = name;
        this.quantityStock = quantityStock;
        this.price = price;
        validPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            this.quantityStock += quantity;
        } else {
            System.out.println("Quantidade inválida. Não é possível adicionar uma quantidade negativa ao estoque.");
        }
    }

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= quantityStock) {
            this.quantityStock -= quantity;
        } else if (quantity <= 0) {
            System.out.println("Quantidade inválida. Não é possível vender uma quantidade negativa.");
        } else {
            System.out.println("Não há quantidade suficiente em estoque para vender.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        validPrice(price);
        this.price = price;
    }

    private void validPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Preço inválido. O preço não pode ser zero ou negativo.");
        }
    }
}
