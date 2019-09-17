/*
Leer por teclado dos tablas de 10 números enteros y mezclarlas en 
una tercera de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.
 */
package D;

import javax.swing.JOptionPane;

public class mezclarDosArreglos {

    public static void main(String[] args) {
        int a[], b[], c[];
        a = new int[10];
        b = new int[10];
        c = new int[20];
        for (int i = 0; i < 10; i++) {
            a[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el "+(i+1)+" numero"));
        }
        for (int i = 0; i < 10; i++) {
            b[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese el "+(i+1)+" numero"));
        }
        int j=0;
        for (int i = 0; i < 10; i++) {
            c[j]= a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        System.out.println("El tercer arreglo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(c[i]);
        }
    }

}
