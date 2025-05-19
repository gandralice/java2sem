import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de X: ");
        float x = sc.nextFloat();

        System.out.print("Informe o valor de Y: ");
        float y = sc.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Ponto de origem");
        } else if (x == 0) {
            System.out.println("Sobre o eixo Y");
        } else if (y == 0) {
            System.out.println("Sobre o eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Primeiro quadrante (Q1)");
        } else if (x < 0 && y > 0) {
            System.out.println("Segundo quadrante (Q2)");
        } else if (x < 0 && y < 0) {
            System.out.println("Terceiro quadrante (Q3)");
        } else if (x > 0 && y < 0) {
            System.out.println("Quarto quadrante (Q4)");
        }
        sc.close();
    }
}
