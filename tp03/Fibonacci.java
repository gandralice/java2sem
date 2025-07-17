import java.util.Scanner;

public class Fibonacci {
    public static int calcFibonacci(int num) {
        if (num <=  1){ return num; }
        return calcFibonacci(num - 1) + calcFibonacci(num - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de termos: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci number: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(Fibonacci.calcFibonacci(i) + " ");
        }
    }
}
