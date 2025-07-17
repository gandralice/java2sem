import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ex6 {
    public static void main(String[] args) {
        Path origem = Paths.get("arquivo_original.txt");
        Path destino = Paths.get("arquivo_copia.txt");

        try {
            Files.write(origem, "conteudo original".getBytes());

            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Arquivo copiado '" + origem + "', copia:'" + destino + "'");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}