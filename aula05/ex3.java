import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com dois números inteiros:");
        int A= sc.nextInt();
        int B= sc.nextInt();
        if((A % B == 0)||(B % A == 0)){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao Sao Multiplos");
        }
        sc.close();
    }
}
