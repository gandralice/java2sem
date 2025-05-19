import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        if((n>10) || (n<=0)){
            System.out.println("Quantidade de números inválida");
        }else{

            int[] v = new int[n];
            for(int i=0; i<n; i++){
                v[i] = sc.nextInt();
            }
            System.out.println("Números negativos: ");
            for(int i=0; i<n; i++){
                int num = v[i];
                if(num<0){
                    System.out.println(num);
                }
            }
        }
        sc.close();
    }
}