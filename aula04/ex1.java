import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
        int val1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo valor:");
        int val2 = Integer.parseInt(input2);

        int soma = val1 + val2;
        JOptionPane.showMessageDialog(null,"SOMA= " + soma);
    }
}
