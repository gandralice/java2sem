import java.util.Scanner;

public class Fatorial {
    private int num;

    public static long calcFatorial(int num) {
        if (num < 0) {
            return 0;
        } else if (num == 0 || num == 1) {
            return 1;
        }
        return num*calcFatorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        System.out.println("O fatorial de " + n + " é " + Fatorial.calcFatorial(n));
        sc.close();
    }
}
