/*
Realizar un juego para adivinar un número. 
Para ello generar un número aleatorio entre 0-100, y luego ir   
pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor
con respecto a N. El proceso termina     cuando el usuario acierta y mostrar
el número de intentos.
 */
package C;

import javax.swing.JOptionPane;

public class adivinarNuemroAleatorio {

    public static void main(String[] args) {
        int numero;
        int aleatorio;
        int contador = 0;
        aleatorio = (int) (Math.random() * 100);
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        while (numero != aleatorio) {
            if (aleatorio > numero) {
                JOptionPane.showMessageDialog(null, "ingresa un numero menor");
            } else {
                JOptionPane.showMessageDialog(null, "ingresa un numero mayor");
            }
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        }
        JOptionPane.showMessageDialog(null, "unmero adivinado es: "+aleatorio+"\n numero de intentos "+contador);

    }

}
