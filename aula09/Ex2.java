import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        double[]v = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            v[i] = sc.nextDouble();
        }
        System.out.print("VALORES= ");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i] + " ");
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += v[i];
        }
        System.out.println("SOMA= " + soma);
        double media = soma/n;
        System.out.println("MEDIA= " + media);

        sc.close();
    }
}