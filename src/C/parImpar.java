/*
Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
package C;

import javax.swing.JOptionPane;

public class parImpar {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un nuemro"));
        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Es un nuemro par");
            } else {
                JOptionPane.showMessageDialog(null, "Es un nuemro impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));
        }
        JOptionPane.showMessageDialog(null, "Vuelva pronto");
    }

}
