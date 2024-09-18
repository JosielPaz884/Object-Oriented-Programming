public class Processador {
    private String modelo;
    private double velocidade;

    public Processador(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }
}
