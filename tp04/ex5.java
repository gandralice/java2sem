import java.io.File;
import java.io.IOException;

public class ex5 {
    public static void main(String[] args) {
        File arquivoExcluir = new File("arquivo_excluir.txt");

        try {
            arquivoExcluir.createNewFile();

            // 2. Agora, tentamos excluí-lo
            boolean sucesso = arquivoExcluir.delete();

            if (sucesso) {
                System.out.println("Arquivo excluído com sucesso");
            } else {
                System.out.println("Falha ao excluir o arquivo");
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}