/*
Guillermo tiene N dolares. Luis tiene la mitad de lo que
posee Guillermo. Juan tiene la mitad de lo que poseen
Luis y Guillermo juntos. Hacer un programa que calcule
e imprima la cantidad de dinero que tienen entre los tres.
*/

package A;

import javax.swing.JOptionPane;

 public class averiguarCantidadDinero {
    public static void main(String[] args) {
       int guillermo = 0;
       int luis = 0;
       int juan = 0;
       
       guillermo = Integer.parseInt(JOptionPane.showInputDialog("ingrese catidad"));
       luis = guillermo/2;
       juan = (guillermo+luis)/2;
        System.out.println("Guillermo tiene "+guillermo
                + "\n luis tinen: "+ juan
                 + "\n juan tiene "+juan);
        System.out.println("LA SUMA ES: "+(guillermo+luis+juan));
    }
    
}
