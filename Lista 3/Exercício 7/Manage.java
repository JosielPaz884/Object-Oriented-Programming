public class Manage{
  public static void main(String[] args) {
        Empresa enterprise = new Empresa();

        Funcionario employee1 = new Funcionario("João", 5000);
        Funcionario employee2 = new Funcionario("Maria", 6000);
        Funcionario employee3 = new Funcionario("Pedro", 7000);

        enterprise.contractEmployee(employee1);
        System.out.println("Funcionário contratado:"+employee1.getName());
        enterprise.contractEmployee(employee2);
        System.out.println("Funcionário contratado:"+employee2.getName());
        enterprise.contractEmployee(employee3);
        System.out.println("Funcionário contratado:"+employee3.getName());

        System.out.println("Folha de pagamento total: " + enterprise.payday());

        enterprise.FireEmployee(employee2);

        System.out.println("Folha de pagamento total após demissão: " + enterprise.payday());
    }
}
