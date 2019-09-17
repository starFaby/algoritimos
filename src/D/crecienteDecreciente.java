/*
Leer por teclado una serie de 10 números enteros.
La aplicación debe indicarnos si los números están ordenados
de forma creciente, decreciente, o si están desordenados.
 */
package D;

import javax.swing.JOptionPane;

 
public class crecienteDecreciente {
 
    public static void main(String[] args) {
        boolean crecient=false, decreciente=false;
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        for (int i = 0; i < 9; i++) {
            if (numeros[i] < numeros[(i+1)]) {
                crecient=true;
            }
            if (numeros[i] > numeros[(i+1)]) {
                decreciente=true;
            }
        }
        if (crecient==true && decreciente==false) {
            JOptionPane.showMessageDialog(null, "Los numeros estan en modo creciente");
        }
        if (crecient==false && decreciente==true) {
            JOptionPane.showMessageDialog(null, "Los numeros estan de forma decreciente");
        }
        if (crecient==true && decreciente==true) {
            JOptionPane.showMessageDialog(null, "los Numeros estan desordenados ");
        }
        if (crecient==false && decreciente==false) {
            JOptionPane.showMessageDialog(null, "los numeros son iguales");
        }
    }
    
}
