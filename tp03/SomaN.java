import java.util.Scanner;

public class SomaN {
    public static long calcSomaN(int num){
        if (num <= 0){
            return 0;
        }
        return num + calcSomaN(num-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SomaN.calcSomaN(n));
        sc.close();
    }
}
