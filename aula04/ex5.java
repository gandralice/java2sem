import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cod peca 1: ");
        int cod1 = sc.nextInt();
        System.out.println("Quantidade: ");
        int qnt1 = sc.nextInt();
        System.out.println("Val unitario: ");
        float val1 = sc.nextFloat();

        System.out.println("Cod peca 2: ");
        int cod2 = sc.nextInt();
        System.out.println("Quantidade: ");
        int qnt2 = sc.nextInt();
        System.out.println("Val unitario: ");
        float val2 = sc.nextFloat();

        System.out.println("VALOR A PAGAR: R$" + (qnt1*val1+qnt2*val2));
        sc.close();
    }
}
