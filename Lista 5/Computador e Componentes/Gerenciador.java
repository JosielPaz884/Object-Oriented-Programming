public class Gerenciador {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel Core i7", 3.2);
        Memoria memoria = new Memoria(16);
        PlacaMae placaMae = new PlacaMae("ASUS PRIME", 4);
        Computador computador = new Computador(processador, memoria, placaMae);
        System.out.println("Computador:");
        System.out.println("Processador: " + computador.getProcessador().getModelo() + " "
                + computador.getProcessador().getVelocidade() + " GHz");
        System.out.println("Memória: " + computador.getMemoria().getCapacidade() + " GB");
        System.out.println("Placa Mãe: " + computador.getPlacaMae().getModelo() + " com "
                + computador.getPlacaMae().getSlots() + " slots");
        computador = null;
        System.gc();
    }
}