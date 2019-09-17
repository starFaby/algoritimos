/*
Programa que lea un carácter
por teclado y compruebe si 
es una letra mayúscula.
*/
package B;

import javax.swing.JOptionPane;

public class letraMayuscula {

    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("ingresa la letra").charAt(0);
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "letra es mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "letra es minuscula");
        }
    }

}
