public class Retangulo {
    private double altura;
    private double largura;

    public double area(){
        return largura*altura;
    }
    public double perimetro(){
        return (largura+altura)*2;
    }
    public double diagonal(){
        return Math.sqrt((altura*altura)+(largura*largura));
    }
}