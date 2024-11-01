public class Viagem {
    private Motorista motorista;
    private CarroEletrico carro;
    private Eletroposto eletroposto;
    private double distanciaPercorrida;
    private String destino;

    public Viagem(Motorista motorista, CarroEletrico carro, String destino) {
        this.motorista = motorista;
        this.carro = carro;
        this.destino = destino;
    }

    public void registrarViagem(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
        if (carro.verificarAutonomia() < distanciaPercorrida) {
            planejarParadas();
        }
    }

    private void planejarParadas() {
        double autonomiaRestante = carro.verificarAutonomia();
        double distanciaRestante = calcularDistanciaRestante(destino);
        List<Eletroposto> eletropostosDisponiveis = new ArrayList<>();

        if (autonomiaRestante < distanciaRestante) {
            double distanciaNecessaria = distanciaRestante - autonomiaRestante;
            for (Eletroposto eletroposto : eletropostos) {
                if (verificarSeEletropostoNaRota(eletroposto)) {
                    if (eletroposto.getVagasDisponiveis() > 0) {
                        eletropostosDisponiveis.add(eletroposto);
                    }
                }
            }
            while (distanciaNecessaria > 0 && !eletropostosDisponiveis.isEmpty()) {
                Eletroposto eletropostoMaisProximo = encontrarEletropostoMaisProximo(eletropostosDisponiveis);
                if (eletropostoMaisProximo != null) {
                    double autonomiaRecuperada = calcularEnergiaNecessaria(eletropostoMaisProximo);
                    carro.carregarBateria(autonomiaRecuperada);
                    distanciaNecessaria -= autonomiaRecuperada;
                    eletropostoMaisProximo.setVagasDisponiveis(eletropostoMaisProximo.getVagasDisponiveis() - 1);
                    registrarRecarga(new Recarga(carro, eletropostoMaisProximo, autonomiaRecuperada));
                } else {
                    System.out.println("Não há eletropostos disponíveis para recarga.");
                    break;
                }
            }
        } else {
            System.out.println("A autonomia do carro é suficiente para chegar ao destino.");
        }
    }

    private double calcularDistanciaRestante(String destino) {
        return 300;
    }

    private boolean verificarSeEletropostoNaRota(Eletroposto eletroposto) {
        return true;
    }

    private Eletroposto encontrarEletropostoMaisProximo(List<Eletroposto> eletropostos) {
        return eletropostos.get(0);
    }

    private double calcularEnergiaNecessaria(Eletroposto eletroposto) {
        double energiaNecessaria = carro.getCapacidadeBateria() -
                carro.getAutonomiaAtual();
        return Math.min(energiaNecessaria, eletroposto.getTempoCarga() * 10);
    }
}
