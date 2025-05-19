
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        do {
            System.out.print("X: ");
            x = sc.nextInt();
            System.out.print("Y: ");
            y = sc.nextInt();

            if (x != 0 && y != 0) {
                System.out.println(determinarQuadr(x, y));
            }

        } while (x != 0 && y != 0);

        System.out.println("Fim");
        sc.close();
    }

    public static String determinarQuadr(int x, int y) {
        if (x > 0 && y > 0) {
            return "Primeiro quadrante (Q1)";
        } else if (x < 0 && y > 0) {
            return "Segundo quadrante (Q2)";
        } else if (x < 0 && y < 0) {
            return "Terceiro quadrante (Q3)";
        } else {
            return "Quarto quadrante (Q4)";
        }
    }
}
