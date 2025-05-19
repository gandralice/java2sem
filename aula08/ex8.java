import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com 3 notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        System.out.println("media aritmetica (a), media ponderada (p)");
        char m = sc.next().charAt(0);
        if (m == 'p'){
            System.out.println("peso 3 notas:");
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();
            System.out.println(calcMediaP(n1, n2, n3, p1, p2, p3));
        }else if (m == 'a'){
            System.out.println(calcMediaA(n1, n2, n3));
        }else {
            System.out.println("opcao invalida");
        }
        sc.close();
    }
    public static double calcMediaA(double nota1, double nota2, double nota3) {
            return (nota1 + nota2 + nota3) / 3;
    }
    public static double calcMediaP(double nota1, double nota2, double nota3, int peso1, int peso2, int peso3) {
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
    }
}
