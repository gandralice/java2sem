import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com dois num reais: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println("tipo de operacao: ");
        char op = sc.next().charAt(0);
        sc.close();
        switch (op){
            case '+':
                System.out.println("soma=" + calcSoma(n1, n2));
                break;
            case '-':
                System.out.println("Subtracao= " + calcSubt(n1, n2));
                break;
            case '*':
                System.out.println("Multiplicacao= " + calcMult(n1, n2));
                break;
            case '/':
                System.out.println("Divisao= " + calcDivi(n1,n2));
                break;
            default:
                System.out.println("operacao invalida!");
                break;
        }
    }
    public static double calcSoma(double n1, double n2) {
        return n1 + n2;
    }
    public static double calcSubt(double n1, double n2) {
        return n1 - n2;
    }
    public static double calcMult(double n1, double n2) {
        return n1 * n2;
    }
    public static double calcDivi(double n1, double n2) {
        return n1 / n2;
    }
}
