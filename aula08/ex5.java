import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com 2 num positivos: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 < 0 || n2 < 0){
            System.out.println("Error");
        }else{
            System.out.println("Soma dos numeros entre " + n1 +" e " + n2 + ": " + numsoma(n1,n2));
        }
    }
    public static int numsoma(int num1, int num2) {
        int soma=0;
        for(int i = num1; i <= num2; i++){
            soma+=i;
        }
        return soma;
    }
}
