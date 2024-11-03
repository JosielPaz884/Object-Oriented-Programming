public abstract class CarroEletrico {
    protected int id;
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected double capacidadeBateria;
    protected double autonomiaMaxima;
    protected double autonomiaAtual;

    public CarroEletrico(int id, String marca, String modelo, int anoFabricacao, double capacidadeBateria) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeBateria = capacidadeBateria;
        this.autonomiaAtual = capacidadeBateria;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public double getAutonomiaAtual() {
        return autonomiaAtual;
    }

    public void carregarBateria(double kWh) {
        if (kWh + autonomiaAtual > capacidadeBateria) {
            autonomiaAtual = capacidadeBateria;
        } else {
            autonomiaAtual += kWh;
        }
    }

    public double verificarAutonomia() {
        return autonomiaAtual;
    }
}
