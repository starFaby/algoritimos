/*
    Crear un programa que lea por teclado
    una tabla de 10 números enteros y la
    desplace una posición hacia abajo: el
    primero pasa a ser el segundo, 
    el segundo pasa a ser el tercero y así 
    sucesivamente. El último pasa a ser el primero.
 */
package D;
      
import javax.swing.JOptionPane;

public class desplazamiento {
 
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int ultimo;
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+" ingresa un nummero"));
        }
        ultimo=numeros[9];
        for (int i = 8; i >=0; i--) {
           numeros[i+1]=numeros[i];
        }
        numeros[0]=ultimo;
        JOptionPane.showMessageDialog(null, "el nuevo arreglo es: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" Numero "+numeros[i]);
        }
    }
    
}
