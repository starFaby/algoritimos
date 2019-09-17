/*
Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
 */
package E;
 
import javax.swing.JOptionPane;

public class hallarMatrizTranspuesta {
 
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("fila "+i+" columna "+j);
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            }
        }
        System.out.println("\n Matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Trasponiendo la matriz");
        int aux;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];  
                matriz[i][j] = matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        System.out.println("La Matriz Transpuesta es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        
    }
    
}
