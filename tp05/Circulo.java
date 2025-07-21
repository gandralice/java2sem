public class Circulo {
    private double raio;

    public double getRaio(){
        return this.raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(5.2);
        System.out.println(circulo.getRaio());
        System.out.println(circulo.calcularArea());
    }
}
