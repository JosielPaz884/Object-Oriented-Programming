public class SuvsEletricos extends CarroEletrico {
     private final double autonomiaMaxima = 400;
     private final double tempoCarga = 8;

    public SuvsEletricos(int id, String marca, String modelo, int anoFabricacao, double capacidadeBateria) {
        super(id, marca, modelo, anoFabricacao, capacidadeBateria);
    }
}
