/*
Programa que lea 
un número entero y
muestre si el número
es múltiplo de 10.
*/
package B;

import javax.swing.JOptionPane;

public class numeroMUltiploDiez {

    public static void main(String[] args) {
        boolean power = true;
        int option;
        while (power) {
            option = Integer.parseInt(JOptionPane.showInputDialog("ingrese opcion \n 1._ multiplo \n 2._ salir"));
            switch (option) {
                case 1:
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
                    if (numero % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de dos");
                    }else if (numero % 3 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de tre");
                    }else if (numero % 4 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de cuatro");
                    }else if (numero % 5 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de cinco");
                    }else if (numero % 6 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de seis");
                    }else if (numero % 7 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de siete");
                    }else if (numero % 8 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de ocho");
                    }else if (numero % 9 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de nueve");
                    }else if (numero % 10 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de diez");
                    }else if (numero % 11 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de once");
                    }else if (numero % 12 == 0) {
                        JOptionPane.showMessageDialog(null, "es multiplo de doce");
                    }else{
                        JOptionPane.showMessageDialog(null, "es un numero superior a 12");
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Gracias pr entrar vuelva pronto");
                    power = false;
                    break;

            }

        }
    }

}
