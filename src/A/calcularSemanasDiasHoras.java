/*
    Construir un programa que, dado un número
    total de horas, devuelve el número de
    semanas, días y horas  equivalentes. 
    Por ejemplo, dado un total de 1000 horas
    debe mostrar 5 semanas, 6 días y 16 horas.
*/
package A;

import javax.swing.JOptionPane;

public class calcularSemanasDiasHoras {

    public static void main(String[] args) {
        int horasTotales;
        int semanas;
        int dias;
        int horas;
        horasTotales = Integer.parseInt(JOptionPane.showInputDialog("ingrese"));
                
        semanas = horasTotales/168;
        dias = horasTotales%168/24;
        horas = horasTotales%24;
        
        System.out.println("semanas "+semanas+ " Diaz "+ dias+ " horas "+horas);
        
    }
    
}
