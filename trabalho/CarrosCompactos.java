public class CarrosCompactos extends CarroEletrico {
     private final double autonomiaMaxima = 200;
     private final double tempoCarga = 4;

    public CarrosCompactos(int id, String marca, String modelo, int anoFabricacao, double capacidadeBateria) {
        super(id, marca, modelo, anoFabricacao, capacidadeBateria);
    }
}
