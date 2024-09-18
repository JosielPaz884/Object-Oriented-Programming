import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void contratar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void demitir(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo());
        }
    }
}
