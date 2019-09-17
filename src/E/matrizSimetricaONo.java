 
package E;

import javax.swing.JOptionPane;

public class matrizSimetricaONo {

    public static void main(String[] args) {
        int matriz[][], nFilas, nColumnas;
        boolean simetrica = true;
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        matriz = new int[nFilas][nColumnas];
        System.out.println("Dijite una matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.println("fila " + i + " columna " + j);
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los numeros"));
            }
        }
        if (nFilas == nColumnas) {
            int i, j;
            i = 0;
            while (i < nFilas && simetrica == true) {
                j = 0;
                while (j < nColumnas && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica==true) {
                JOptionPane.showMessageDialog(null, "la matriz SI es simetrica");
            }else{
                JOptionPane.showMessageDialog(null, "La matriz NO es simetrica");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es SIMETRICA");

        }
    }

}
