public class Gerenciador {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25, "12345678909");
        pessoa.mostrarDados();
        pessoa.setNome("João Silva");
        pessoa.setIdade(30);
        System.out.println("---------------");
        pessoa.mostrarDados();
        System.out.println("---------------");
        pessoa.setIdade(-5);
        System.out.println("---------------");
        pessoa.mostrarDados();
    }
}
