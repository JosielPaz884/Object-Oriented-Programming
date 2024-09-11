public class Manage {
    public static void main(String[] args) {
        Funcionario employee = new Funcionario("John Doe", 5000.0, "junior");
        System.out.println("Dados iniciais:");
        employee.printData();
        System.out.println("---------------------");
        System.out.println("\nAumentando salário em 15%:");
        employee.increaseSalary(15);
        employee.printData();
        System.out.println("---------------------");
        System.out.println("\nAumentando salário em 30% (não permitido):");
        employee.increaseSalary(30);
        employee.printData();
        System.out.println("---------------------");
        System.out.println("\nPromovendo para pleno:");
        employee.promote("pleno");
        employee.printData();
        System.out.println("---------------------");
        System.out.println("\nPromovendo para gerente (não permitido):");
        employee.promote("gerente");
        employee.printData();
        System.out.println("---------------------");
        System.out.println("\nPromovendo para gerente (permitido):");
        employee.promote("senior");
        employee.promote("gerente");
        employee.printData();
    }
}
