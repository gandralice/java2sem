import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com dois valores: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println("Media: " + calcM(n1, n2));
        sc.close();
    }
    public static double calcM(double n1, double n2) {
        return (n1 + n2)/2;
    }
}
