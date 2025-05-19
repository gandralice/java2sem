import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qnt termos: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Erro");
        } else {
            fibonacci(n);
        }
        sc.close();
    }
    public static void fibonacci(int n) {
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long prox = a + b;
            a = b;
            b = prox;
        }
    }
}