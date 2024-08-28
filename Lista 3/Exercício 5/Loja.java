public class Loja {
    public static void main(String[] args) {
        Gerente manager = new Gerente("Maria", 5000, "Gerente", 1000);
        Vendedor seller = new Vendedor("Pedro", 3000, "Vendedor", 10000);
        System.out.println("Nome do Gerente:" + manager.getName() + "\nBônus do gerente: " + manager.sumBonus() + "\n");
        System.out.println("Nome do Vendedor:" + seller.getName() + "\nBônus do vendedor: " + seller.sumBonus());
    }
}
