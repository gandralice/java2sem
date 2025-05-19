import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int[]v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            v[i] = sc.nextInt();
        }

        System.out.print("NUMEROS PARES: ");
        int qnt = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) {
                System.out.println(v[i]);
                qnt++;
            }
        }
        System.out.println("QUANTIDADE DE PARES= "+ qnt);
    }
}