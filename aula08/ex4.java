import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(verif(n));
        sc.close();
    }
    public static int verif(int num) {
        if(num >=0){
            return 1;
        }else {
            return 0;
        }
    }
}
