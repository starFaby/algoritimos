/*
    crear calculadora con
    las 4 operaciones matematicas
*/
package B;

import javax.swing.JOptionPane;

public class calculadora {

    public static void main(String[] args) {
        float num1 = 0;
        float num2 = 0;
        float total;
        float suma;
        float resta;
        float multiplicacion;
        float divicion;
        boolean power = true;
        int option = 0;
        while (power) {
            option = Integer.parseInt(JOptionPane.showInputDialog("ingresa una opcion"));
            switch (option) {
                case 1:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
                    suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
                    resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
                    multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion es: " + multiplicacion);
                    break;
                case 4:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
                    divicion = num1 / num2;
                    System.out.println("La divicion es: " + divicion);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "gracias por visiatrnos  ... vuelva pronto");
                    power = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");
                    break;
            }
        }
    }

}
