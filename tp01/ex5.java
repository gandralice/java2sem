import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num: ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Erro, num negativo");
        }else{
            System.out.println("fatorial = " + fatorial(num));
        }
        sc.close();
    }
    public static int fatorial(int n) {
        int fat = 1;
        for(int i = n; i > 0; i--){
            fat *= i;
        }
        return fat;
    }
}