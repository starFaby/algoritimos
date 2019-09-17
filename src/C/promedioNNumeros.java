/*
Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */
package C;

import javax.swing.JOptionPane;

public class promedioNNumeros {

    public static void main(String[] args) {
        int num;
        int suma=0;
        int elementos=0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));
        while(num > 0){
             suma += num;
             num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));
             elementos++;
        }
        if(elementos == 0){
            JOptionPane.showMessageDialog(null, "No se puede dividir para cero");
        }
        if(elementos > 0){
            float total = suma/elementos;
            JOptionPane.showMessageDialog(null, "La madia es : "+total);
        }
    }
    
}
