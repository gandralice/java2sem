import java.text.DecimalFormat;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num do funcionario: ");
        int nf = sc.nextInt();
        System.out.println("Horas trabalhadas: ");
        int ht = sc.nextInt();
        System.out.println("val hora: ");
        float vh = sc.nextFloat();
        float sal = ht * vh;
        DecimalFormat df = new DecimalFormat("#.##");
        String result = df.format(sal);
        System.out.println("Funcionario: " + nf);
        System.out.println("Salario: R$ " + result);
        sc.close();
    }
}
