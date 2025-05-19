public class aula10e5 {
    public static void main(String[] args) {
        String texto = null;
        try {
            System.out.println("Texto: " + texto.length());

        } catch (NullPointerException e) {
            System.out.println("Erro: Objeto nulo.");
        }
    }
}