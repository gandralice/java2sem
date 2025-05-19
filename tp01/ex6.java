import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        long n2 = sc.nextLong();
        System.out.println(calc(n1, n2));
        sc.close();
    }
    public static double calc(double a, long b) {
        double result = Math.pow(a, b);
        return Math.round(result);
    }
}
