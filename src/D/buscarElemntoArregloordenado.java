/*
Leer 10 enteros ordenados creciente mente. Leer N y buscarlo en la tabla. 
Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
 */
package D;

import javax.swing.JOptionPane;

public class buscarElemntoArregloordenado {
    
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int numero;
        boolean creciente = true;
        do {
            //pedimos el arreglo
            for (int i = 0; i < 10; i++) {
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ".er numero ingresado"));
            }
            //verificamos que este arreglado
            for (int i = 0; i < 9; i++) {
                if (numeros[i] < numeros[i + 1]) {
                    creciente = true;
                }
                if (numeros[i] > numeros[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                JOptionPane.showMessageDialog(null, "Los numeros no estan ordenados \n intente de nuevo");
            }
        } while (creciente == false);
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el umero a buscar"));
        int i = 0;
        while (i < 10 && numeros[i] < numero) {            
            i++;
        }
        if (i==10) {
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
        }else{
            if (numeros[i] == numero) {
                System.out.println("numero encontrado en la posicion: "+i);
            }else{
                System.out.println("Numero NO encontrado");
            }
        }
    }
    
}
