import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com 2 num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("maior: " + maior(num1, num2));
        sc.close();
    }
    public static int maior(int a, int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
}
