public class aula10e3 {
    public static void main(String[] args) {
        int v[] = new int[5];

        try {
            System.out.println(v[5]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Índice fora dos limites do array.");
        }
    }
}