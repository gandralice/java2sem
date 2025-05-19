import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 num diferentes: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Mediana: " + mediana(num1, num2, num3));
        sc.close();
    }
    public static int mediana(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                return n2;
            } else {
                return n3;
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                return n1;
            }else {
                return n3;
            }
        }else if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                return n1;
            }else {
                return n2;
            }
        }
        return 0;
    }
}
