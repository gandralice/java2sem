import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // get
    public String getTitulo () {
        return this.titulo;
    }
    public String getAutor () {
        return this.autor;
    }
    public int getAnoPublicacao () {
        return this.anoPublicacao;
    }

    //set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String titulo = sc.nextLine();
        String autor = sc.nextLine();
        int anoPublicacao = sc.nextInt();
        sc.close();
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setAnoPublicacao(anoPublicacao);

        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
    }
}
