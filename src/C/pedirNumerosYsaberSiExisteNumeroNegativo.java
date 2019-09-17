/*
    Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */
package C;

import javax.swing.JOptionPane;

public class pedirNumerosYsaberSiExisteNumeroNegativo {

    public static void main(String[] args) {
        int num;
        int conteoNumerosPositivos=0;
        int conteoNumerosNegativos=0;
        for (int i = 0; i < 10; i++) {
            num= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            if (num > 0) {
                conteoNumerosPositivos++;
            }else{
                conteoNumerosNegativos++;
            }
        }
        System.out.println("cantidad de numeros positivos son: "+conteoNumerosPositivos);     
        System.out.println("cantidad de numeros negativos son: "+conteoNumerosNegativos);

        
    }
    
}
