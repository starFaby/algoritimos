/*
Pedir el día, mes y año
de una fecha e indicar 
si la fecha es correcta.
Suponiendo todos los meses 
de 30 días.
*/
package B;

import javax.swing.JOptionPane;

public class fechaCorrecta {

    public static void main(String[] args) {
        int dia;
        int mes;
        int año;
        dia = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL DIA"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL MES"));
        año = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL AÑO"));

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    System.out.println("FECHA CORRECTA");
                } else {
                    System.out.println("Fecha incorrecta: año incorrecto");
                }
            } else {
                System.out.println("Fecha incorrecta: mes incorrecto");
            }

        } else {
            System.out.println("Fecha incorrecta: dia incorrecto");
        }

    }

}
