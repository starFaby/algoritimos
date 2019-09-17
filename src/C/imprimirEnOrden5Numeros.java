/*
Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden que ingresaron.
 */
package C;

import javax.swing.JOptionPane;

/**
 *
 * @author fabystar
 */
public class imprimirEnOrden5Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    
}
