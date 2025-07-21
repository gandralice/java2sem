public class ContaBancaria {
    private double saldo;
    private String titular;

    //get
    public double getSaldo() {
        return this.saldo;
    }
    public String getTitular() {
        return this.titular;
    }

    //set
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void realizarDeposito(double valor){
        this.saldo += valor;
    }

    public void realizarSaque(double valor){
        if(this.saldo >= valor){this.saldo -= valor;}
    }

    public static void main(String[] args) {
        ContaBancaria cBancaria = new ContaBancaria();

        cBancaria.setTitular("Alice");
        cBancaria.setSaldo(500);

        cBancaria.realizarDeposito(500);
        cBancaria.realizarSaque(200);

        System.out.println("Titular: " + cBancaria.getTitular() + " Saldo: " + cBancaria.getSaldo());
    }
}
