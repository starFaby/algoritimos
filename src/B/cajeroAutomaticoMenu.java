/*
    Hacer un programa que simule un cajero automático 
    con un saldo inicial de 1000 dólares, con el
    siguiente menú de opciones:

    1. Ingresar dinero a la cuenta.
    2. Retirar dinero de la cuenta.
    3. Salir
*/
package B;

import javax.swing.JOptionPane;

public class cajeroAutomaticoMenu {

    public static void main(String[] args) {
        float saldoInicial=1000;
        float ingresaDinero;
        float retirrarDinero;
        boolean power= true;
        while(power){
            int option = Integer.parseInt(JOptionPane.showInputDialog("ingres la opcion deceada"
                    + "\n 1._ Ingresar dinero"
                    + "\n 2._ retirar dinero"
                    + "\n 3._ Salir"));
            switch(option){
                case 1:
                    ingresaDinero = Float.parseFloat(JOptionPane.showInputDialog("Ingresar Dinero"));
                    saldoInicial+=ingresaDinero;
                    JOptionPane.showMessageDialog(null, "Su saldo es: "+ saldoInicial);
                    break;
                case 2:
                    ingresaDinero = Float.parseFloat(JOptionPane.showInputDialog("Ingresar Dinero"));
                    saldoInicial-=ingresaDinero;
                    JOptionPane.showMessageDialog(null, "Su saldo es: "+ saldoInicial);
                    break;
                case 3:
                    power = false;
                    JOptionPane.showMessageDialog(null, "gracias por visitarnos: vuelva pronto");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");
                    break;
            }
        }
    }
    
}
