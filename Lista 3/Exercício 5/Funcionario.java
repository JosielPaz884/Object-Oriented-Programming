public class Funcionario {
    protected String name;
    protected double salary;
    protected String position;

    public Funcionario(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public double sumBonus() {
        return salary * 0.1;
    }
}
