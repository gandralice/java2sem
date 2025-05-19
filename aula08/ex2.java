import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System. out. print (numSolver(sc.nextInt () ) ) ;
        sc.close ();
    }
    public static float numSolver(int qntNum) {
        Scanner scannerLocal = new Scanner (System. in) ;
        float soma = 0;
        for (int i = 0; i < qntNum; i++){
            soma = soma + scannerLocal.nextFloat();
        }
        scannerLocal.close();
        return soma / qntNum;
    }
}
