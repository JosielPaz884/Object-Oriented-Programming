public class Computador {
    private Processador processador;
    private Memoria memoria;
    private PlacaMae placaMae;

    public Computador(Processador processador, Memoria memoria, PlacaMae placaMae) {
        this.processador = processador;
        this.memoria = memoria;
        this.placaMae = placaMae;
    }

    public Processador getProcessador() {
        return processador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    @Override
    protected void finalize() {
        processador = null;
        memoria = null;
        placaMae = null;
    }
}