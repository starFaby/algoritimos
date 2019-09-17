/*
Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
Éstos los guardaremos en una tabla de tamaño 10. 
Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 */
package D;

import javax.swing.JOptionPane;

public class insertarDentroDeUnArreglos {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        boolean creciente = true;
        int numero, sitio_num = 0, j = 0;
        do {
            for (int i = 0; i < 5; i++) {
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            }
            for (int i = 0; i < 4; i++) {
                if (numeros[i] < numeros[i + 1]) {
                    creciente = true;
                }
                if (numeros[i] > numeros[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                JOptionPane.showInputDialog("el arreglo no esta ordenado en forma creciente");
            }
        } while (creciente == false);

        System.out.println("Djite un elemento para insertar");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor a ingresar"));
        while (numeros[j] < numero && j < 5) {
            sitio_num++;
            j++;
        }

        for (int i = 4; i >= sitio_num; i--) {
            numeros[i + 1] = numeros[i];
        }

        numeros[sitio_num] = numero;
        for (int i = 0; i < 6; i++) {
            System.err.print(numeros[i] + " - ");
        }

    }

}
