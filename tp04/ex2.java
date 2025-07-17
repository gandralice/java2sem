import java.io.File;
public class ex2 {
    public static void main(String[] args) {
        String caminhoDir = "C:\\Users\\alice\\Downloads";
        File dir = new File(caminhoDir);

        if (dir.isDirectory()) {
            System.out.println("Arquivos no diretório: ");

            File[] listaDeArquivos = dir.listFiles();

            if (listaDeArquivos != null) {
                for (int i = 0; i < listaDeArquivos.length; i++) {
                    File arquivo = listaDeArquivos[i];

                    if (arquivo.isFile()) {
                        System.out.println("Arquivo: " + arquivo.getName());
                    } else if (arquivo.isDirectory()) {
                        System.out.println("Subdiretório: " + arquivo.getName());
                    }
                }
            }
        } else {
            System.out.println("não é um diretório válido");
        }
    }
}
