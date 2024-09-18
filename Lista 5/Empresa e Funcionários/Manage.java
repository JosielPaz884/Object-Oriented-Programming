public class Manage {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Minha Empresa");

        Funcionario funcionario1 = new Funcionario("João", "Desenvolvedor");
        Funcionario funcionario2 = new Funcionario("Maria", "Gerente");

        empresa.contratar(funcionario1);
        empresa.contratar(funcionario2);

        empresa.listarFuncionarios();

        empresa.demitir(funcionario1);

        empresa.listarFuncionarios();
    }
}