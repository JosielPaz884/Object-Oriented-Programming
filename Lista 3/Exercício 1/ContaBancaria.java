public class ContaBancaria {
    private int accountNumber;
    private double balance;
    private Cliente client;

    public ContaBancaria(int accountNumber, Cliente client) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void withDraw(double value) {
        if (value > 0 && value <= balance) {
            balance -= value;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void transfer(ContaBancaria destiny, double value) {
        if (value > 0 && value <= balance) {
            withDraw(value);
            destiny.deposit(value);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
        }
    }
}
