import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Senha: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            System.out.println("Senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}