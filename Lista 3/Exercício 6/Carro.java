public class Carro {
    private String mark;
    private String model;
    private int year;
    private double mileage;

    public Carro(String mark, String model, int year, double mileage) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setMileageTraveled(double mileageTraveled, boolean travel) {
        if(travel){
             this.mileageTraveled += mileageTraveled;
        }else{
             this.mileageTraveled = mileageTraveled;
        }
    }
    
    public double getMileage() {
        return this.Mileage;
    }
    
    public void printInformation() {
        System.out.println("Marca: " + this.mark);
        System.out.println("Modelo: " + this.model);
        System.out.println("Ano: " + this.year);
        System.out.println("Quilometragem: " + this.mileage + " km");
    }
}
