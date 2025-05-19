import java.util.Scanner;

public class ex1 {
    public static int dobro (int num){
        return num + num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num: ");
        int n = sc.nextInt();
        System.out.printf("Dobro: " + dobro(n));
        sc.close();
    }
}
