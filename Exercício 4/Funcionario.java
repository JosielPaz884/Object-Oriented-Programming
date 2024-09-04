public class Funcionario {
    private int code;
    private double quantityHours;
    private double valueTime;
    private double valueSalary;
    private double amountOvertime;

    public Funcionario(int code, double quantityHours, double valueTime) {
        this.code = code;
        this.quantityHours = quantityHours;
        this.valueTime = valueTime;
        this.valueSalary = 0; 
        this.amountOvertime = 0; 
    }

    public int getCode() {
        return code;
    }

    public double getQuantityHours() {
        return quantityHours;
    }

    public double getValueTime() {
        return valueTime;
    }

    public double getValueSalary() {
        return valueSalary;
    }

    public double getAmountOvertime() {
        return amountOvertime;
    }

    public void setAmountOvertime(double amountOvertime) {
        this.amountOvertime = amountOvertime;
    }

    public double calculateOvertime() {
        return amountOvertime * valueTime * 1.5; 
    }

    public void calculateSalary() {
       valueSalary = quantityHours *valueTime +calculateOvertime();
    }

    public void print() {
        System.out.println("Código: " + code);
        System.out.println("Salário: R$ " + valueSalary);
        System.out.println("Quantidade de horas trabalhadas: " + quantityHours);
    }
}
