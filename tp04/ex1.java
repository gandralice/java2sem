import java.io.File;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho de um diretório: ");
        String caminho = sc.nextLine();

        File diretorio = new File(caminho);

        if (diretorio.exists() && diretorio.isDirectory()) {
            System.out.println("O diretório existe");
        } else {
            System.out.println("O diretório não existe");
        }
        sc.close();
    }
}
