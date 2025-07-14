public class Empregado {
    private String nome;
    private double salBruto;
    private double descontos;

    public double salLiquido() {
        return salBruto-descontos;
    }
    public double aumentarSal(double aumento) {
        this.salBruto += aumento;
        return this.salBruto;
    }
    public String getNome() {
        return nome;
    }

    public double getSalBruto() {
        return salBruto;
    }

    public double getDescontos() {
        return descontos;
    }
}


