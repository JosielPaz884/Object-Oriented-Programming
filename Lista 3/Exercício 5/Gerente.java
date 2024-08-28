public class Gerente extends Funcionario {
    private double salaryFixed;

    public Gerente(String name, double salary, String position, double salaryFixed) {
        super(name, salary, position);
        this.salaryFixed = salaryFixed;
    }

    @Override
    public double sumBonus() {
        return salaryFixed;
    }
}
