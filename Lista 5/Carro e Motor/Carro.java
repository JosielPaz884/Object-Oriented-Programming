public class Carro {
    private Motor motor;
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.motor = new Motor();
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMotor(double potencia, String tipoCombustivel) {
        this.motor.setPotencia(potencia);
        this.motor.setTipoCombustivel(tipoCombustivel);
    }

    public Motor getMotor() {
        return motor;
    }

    public void printInformation() {
        System.out.println("Dados do Carro:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Potência: " + this.motor.getPotencia());
        System.out.println("Tipo de Combustível: " + this.motor.getTipoCombustivel());
    }
}