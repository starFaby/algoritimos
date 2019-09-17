/*
    Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera,
    y a continuación los elementos mmmm separar pares y impares de un arreglo
*/
package D;
 
import javax.swing.JOptionPane;

public class separarParesImparesArreglo {
 
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int conteoPares=0,conteoImpares=0;
        for (int i = 0; i < 10; i++) {
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+".er numero Ingresado"));
            if (numeros[i]%2==0) {
                conteoPares++;
            }else{
                conteoImpares++;
            }
        }
        int[] pares = new int[conteoPares];
        int[] impares = new int[conteoImpares];
        conteoPares=0;
        conteoImpares=0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i]%2==0) {
                pares[conteoPares]=numeros[i];
                conteoPares++;
            }else{
                impares[conteoImpares]=numeros[i];
                conteoImpares++;
            }
        }
        System.out.println("Numeros pares");
        for (int i = 0; i < conteoPares; i++) {
            System.out.print(pares[i]+" - ");
        }
        System.out.print("\n Numeros Impres");
        for (int i = 0; i < conteoImpares; i++) {
            System.out.print(impares[i]+" - ");
        }
    }
    
}
