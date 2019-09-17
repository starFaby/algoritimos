 package E;

import javax.swing.JOptionPane;

public class sumaFilaColumnaMatriz {

    public static void main(String[] args) {
        int matriz[][], nFilas, nColumnas;
        int sumaFilas, sumaColumnas;
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        matriz = new int[nFilas][nColumnas];
        System.out.println("Dijite la Matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.println("matriz[" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            }
        }
        System.out.println("la matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("matriz[" + i + "][" + j + "]");
            }
        }
        System.out.println("Ahora procedemos a sumar la matriz");
        System.out.println("Ahora se suma las Filas");

        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumaFilas += matriz[i][j]; 
            }
                System.out.println("La suma de la fila " + i + " es " + sumaFilas);
        }
        System.out.println("Ahora se suma las columnas");

        for (int j = 0; j < nColumnas; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaColumnas += matriz[i][j];
            }
                System.out.println("La suma de la columna "+j+" es: "+sumaColumnas);
        }
    }

}
