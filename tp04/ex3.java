import java.io.File;
import java.io.IOException;

public class ex3 {
    public static void main(String[] args) {
        File arquivo = new File("novo_arquivo.txt");

        try {
            boolean sucesso = arquivo.createNewFile();

            if (sucesso) {
                System.out.println("Arquivo criado com sucesso");
            } else {
                System.out.println("Erro ao criar arquivo");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }
}