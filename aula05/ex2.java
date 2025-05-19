import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        sc.close();
    }
}
