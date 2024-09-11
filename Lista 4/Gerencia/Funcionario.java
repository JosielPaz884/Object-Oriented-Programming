public class Funcionario {
    private String name;
    private double salary;
    private String position;

    public Funcionario(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public void increaseSalary(double percentage) {
        if (percentage <= 20) {
            salary += (salary * (percentage / 100));
        } else {
            System.out.println("Aumento de salário não permitido. Máximo de 20%.");
        }
    }

    public void promote(String newPosition) {
        if (isPositionCompativel(position, newPosition)) {
            position = newPosition;
        } else {
            System.out.println("Promoção não permitida. Cargo não compatível.");
        }
    }

    private boolean isPositionCompativel(String recentPosition, String newPosition) {
        String[] compatiblePositions = { "junior", "pleno", "senior" };
        for (String compatiblePosition : compatiblePositions) {
            if (recentPosition.equals(compatiblePosition) && newPosition.equals("gerente")) {
                return true;
            }
        }
        return false;
    }

    public void printData() {
        System.out.println("Nome: " + name);
        System.out.println("Salário: " + salary);
        System.out.println("Cargo: " + position);
    }
}
