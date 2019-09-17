/*
Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 */
package C;
 
import javax.swing.JOptionPane;

public class numeroMostrarCuadrado {
 
    public static void main(String[] args) {
         float base;
         float exponente=2;
         base = Float.parseFloat(JOptionPane.showInputDialog("ingresa un nuemro"));
         while(base > 0){
             float total =(float) Math.pow(base, exponente);
             JOptionPane.showMessageDialog(null, "El cuadrado de este numero "+base+" es: "+total);
             base = Float.parseFloat(JOptionPane.showInputDialog("ingresa un nuemro"));
         }
         JOptionPane.showMessageDialog(null, "Introducio un numero negativo y no es valido");
    }
    
}
