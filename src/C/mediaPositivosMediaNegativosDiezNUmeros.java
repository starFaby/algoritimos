/*
 Pedir 10 números. Mostrar la media de los números positivos, la media de los   
números negativos y la cantidad de ceros.
 */
package C;
 
import javax.swing.JOptionPane;

public class mediaPositivosMediaNegativosDiezNUmeros {
 
    public static void main(String[] args) {
        int num;
        int sumaPositivos = 0;
        int sumaNegatiivos = 0;
        int conteoPositivos = 0;
        int conteoNegativos = 0;
        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor"));
            if (num > 0) {
                sumaPositivos += num;
                conteoPositivos++;
            }
            if (num < 0) {
                sumaNegatiivos +=num;
                conteoNegativos++;
            }
        }
        if (conteoPositivos==0) {
            JOptionPane.showMessageDialog(null, "No existe divicion para cero");
        }else{
            int total= sumaPositivos/conteoPositivos;
            JOptionPane.showMessageDialog(null, "Media de nuemros positivos es: "+total);
        }
        
        if (conteoNegativos == 0) {
            JOptionPane.showMessageDialog(null, "No existe la divicion para cero");
        }else{
            int total= sumaNegatiivos/conteoNegativos;
            JOptionPane.showMessageDialog(null, "Media de nuemros negativos es: "+total);
        }
    }
    
}
