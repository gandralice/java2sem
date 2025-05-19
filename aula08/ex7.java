import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("valor antigo: ");
        float a = sc.nextFloat();
        System.out.println("valor atual: ");
        float b = sc.nextFloat();
        System.out.println("Acrescimo: " + percentualAcrescimo(a, b) + "%");
        sc.close();
    }
    public static float percentualAcrescimo(float atual, float antigo) {
        return ((atual-antigo)/ antigo) * 100;
    }
}
