/*
Ejercicio 9: Escribir todos los números del 100 al 0 de 7 en 7.
 */
package C;

import javax.swing.JOptionPane;

public class escibirNumeosCeroCien {

    public static void main(String[] args) {
        int multiplo;
        multiplo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el multiplo"));
        for (int i = 0; i < 100; i+=multiplo) {
           // JOptionPane.showMessageDialog(null, "Los multiplos de "+multiplo+" son "+i);
            System.out.println("Los multiplos de "+multiplo+" son "+i);
        }
        
    }

}
