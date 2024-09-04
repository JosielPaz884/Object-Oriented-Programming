public class Manage {
    public static void main(String[] args) {
        FolhaPagamento paperPay = new FolhaPagamento();

        Funcionario employ1 = new Funcionario(1, 40, 20.0);
        employ1.setAmountOvertime(10);
        employ1.calculateSalary();
        paperPay.addEmployee(employ1);

        Funcionario employ2 = new Funcionario(2, 30, 25.0);
        employ2.setAmountOvertime(5);
        employ2.calculateSalary();
        paperPay.addEmployee(employ2);

        Funcionario employ3 = new Funcionario(3, 50, 30.0);
        employ3.setAmountOvertime(15);
        employ3.calculateSalary();
        paperPay.addEmployee(employ3);

        System.out.println("Folha de pagamento:");
        paperPay.order();
        paperPay.print();
    }
}
