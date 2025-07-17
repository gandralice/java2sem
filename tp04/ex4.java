import java.io.File;
import java.io.IOException;

public class ex4 {
    public static void main(String[] args) {
        File arquivoOriginal = new File("arquivo_teste.txt");
        File arquivoRenomeado = new File("arquivo_renomeado.txt");

        try {
            arquivoOriginal.createNewFile();
            System.out.println("Arquivo de teste criado.");

            boolean sucesso = arquivoOriginal.renameTo(arquivoRenomeado);

            if (sucesso) {
                System.out.println("Arquivo renomeado com sucesso");
            } else {
                System.out.println("Falha ao renomear o arquivo");
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}