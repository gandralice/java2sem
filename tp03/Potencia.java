import java.util.Scanner;

public class Potencia {
    public static long calcPotencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        }
        return base*calcPotencia(base, expoente-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        int base = sc.nextInt();
        System.out.println("Expoente: ");
        int expoente = sc.nextInt();
        sc.close();
        if(expoente < 0){
            System.out.println("Erro: expoente negativo");
        }else {
            System.out.println(base + " elevado a " + expoente + " é: " +calcPotencia(base, expoente));
        }
    }
}
