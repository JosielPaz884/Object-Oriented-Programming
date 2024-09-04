public class FolhaPagamento {
    private Funcionario[] employees = new Funcionario[50];

    public void addEmployee(Funcionario employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
               employees[i] = employee;
                break;
            }
        }
    }

    public void order() {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i]. getValueSalary() < employees[j]. getValueSalary()) {
                    Funcionario aux = employees[i];
                    employees[i] = employees[j];
                   employees[j] = aux;
                }
            }
        }
    }

    public void print() {
        for (Funcionario employee : employees) {
            if (employee != null) {
                employee.print();
                System.out.println();
            }
        }
    }
}
