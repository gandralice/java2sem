import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de pessoas: ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a altura: ");
            alturas[i] = sc.nextDouble();

            System.out.print("Digite o gênero (M/F): ");
            generos[i] = sc.next().charAt(0);
        }
        double maior = alturas[0];
        double menor = alturas[0];
        double somaAlturasMulheres = 0;
        int contM = 0;
        int contF = 0;

        for (int i = 0; i < n; i++) {
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
            if (alturas[i] < menor) {
                menor= alturas[i];
            }
            if (generos[i] == 'F') {
                somaAlturasMulheres += alturas[i];
                contF++;
            } else if (generos[i] == 'M') {
                contM++;
            }
        }
        double mediaAlturaMulheres = contF > 0 ? somaAlturasMulheres / contF : 0;

        // Exibe os resultados
        System.out.println("MAIOR ALTURA = " + maior);
        System.out.println("MENOR ALTURA = " + menor);
        System.out.printf("MÉDIA ALTURA MULHERES =", mediaAlturaMulheres);
        System.out.println("NÚMERO DE HOMENS = " + contM);

        sc.close();
    }
}