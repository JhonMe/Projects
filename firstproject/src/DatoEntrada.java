import javax.swing.*;
import java.util.Scanner;

public class DatoEntrada {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Ingrese el primer numero: ");
        String strNum2 = JOptionPane.showInputDialog("Ingrese el segundo numero: ");

        int Primer = Integer.parseInt(strNum1);
        int segunto = Integer.parseInt(strNum2);

        int resultado = Primer + segunto;

        JOptionPane.showMessageDialog(null, "El resultado es el siguiente Jhon: "+ resultado);
    }
}
