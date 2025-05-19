import  java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Selecione um produto (1 a 5): ");
        int produto = sc.nextInt();

        System.out.print("Informe a quantidade desejada: ");
        int quantidade = sc.nextInt();

        float valorTotal;
        switch (produto) {
            case 1:
                valorTotal = 4.00F * quantidade;
                System.out.printf("O valor total é: R$%.2f%n", valorTotal);
                break;
            case 2:
                valorTotal = 4.50F * quantidade;
                System.out.printf("O valor total é: R$%.2f%n", valorTotal);
                break;
            case 3:
                valorTotal = 5.00F * quantidade;
                System.out.printf("O valor total é: R$%.2f%n", valorTotal);
                break;
            case 4:
                valorTotal = 2.00F * quantidade;
                System.out.printf("O valor total é: R$%.2f%n", valorTotal);
                break;
            case 5:
                valorTotal = 1.50F * quantidade;
                System.out.printf("O valor total e: R$%.2f%n", valorTotal);
                break;
            default:
                System.out.println("Produto não encontrado. Selecione um valor de 1 a 5.");
                break;
        }
        sc.close();
    }
}

