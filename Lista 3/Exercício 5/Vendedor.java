public class Vendedor extends Funcionario {
    private double sells;

    public Vendedor(String name, double salary, String position, double sells) {
        super(name, salary, position);
        this.sells = sells;
    }

    @Override
    public double sumBonus() {
        return sells * 0.05;
    }
}
