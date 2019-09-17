/*
    Leer 5 números por teclado, almacenarlos en un arreglo y a
    continuación realizar la media de los números positivos, 
    la media de los negativos y conteo el número de ceros.
 */
package D;

import javax.swing.JOptionPane;

public class promedioDeUnArreglo {

    public static void main(String[] args) {
        float sumaPositivos=0,sumaNegativos=0,mediaPositivos=0,mediaNegativos=0;
        int conteoCeros=0, conteoPositivos=0,conteoNegativos=0;
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+"ingrese un numero"));
            if (numeros[i]==0) {
                conteoCeros++;
            }
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                conteoPositivos++;
            }
            if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                conteoNegativos++;
            }
        }
        if (conteoPositivos==0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir para cero");
        }else{
            mediaPositivos = sumaPositivos/conteoPositivos;
            JOptionPane.showMessageDialog(null, "La media de positivos es: "+mediaPositivos);
        }
        if (conteoNegativos==0) {
            JOptionPane.showMessageDialog(null, "la division para cero no existe");
        }else{
            mediaNegativos = sumaNegativos/conteoNegativos;
            JOptionPane.showMessageDialog(null, "La media de nuemros negativos es. "+mediaNegativos);
        }
        if (conteoCeros ==0) {
            JOptionPane.showMessageDialog(null, "no existe ceros");
        }else{
            JOptionPane.showMessageDialog(null, "la cantidad de ceros es: "+conteoCeros);
        }

    }

}
