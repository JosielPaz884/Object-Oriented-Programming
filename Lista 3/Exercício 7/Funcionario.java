public class Funcionario {
    private String name;
    private double salary;

    public Funcionario(String name, double salary) {
        this.name= name;
        this.salary= salary;
    }

    public String getNome() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
