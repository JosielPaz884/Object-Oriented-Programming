import java.util.ArrayList;
import java.util.List;

public class Enterprise {
    private List<Funcionario> employee;

    public Enterprise() {
        this.employee = new ArrayList<>();
    }

    public void contractEmployee(Funcionario employees) {
        this.employee.add(employees);
    }

    public void FireEmployee(Funcionario employees) {
        this.employee.remove(employees);
    }

    public double payday() {
        double payroll = 0;
        for (Funcionario employee : employees) {
            payroll += employee.getSalary();
        }
        return payroll;
    }
