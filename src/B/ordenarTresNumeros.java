/*
Pedir tres números y mostrarlos ordenados de menor a mayor.
 */
package B;

import javax.swing.JOptionPane;

public class ordenarTresNumeros {

    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingresar primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingresar segundo numero"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("ingresar tercer numero"));

        if ((numero1 > numero2) && (numero2 > numero3)) {
            System.out.println("Numero mayor "+numero1+" numero intermedio "+numero2+" numero menor"+numero3);
        }else if((numero2 > numero3) && (numero3 > numero1)){
            System.out.println("numero mayor "+numero2+ "Numero intermedio "+numero3+ " nuemro menor "+ numero1);
        }else if((numero3 > numero2) && (numero2 > numero1)){
            System.out.println("numero mayor "+numero3+ "Numero intermedio "+numero2+ " nuemro menor "+ numero1);
        }
    }

}
