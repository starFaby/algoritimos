/*
    La calificación final de un 
    estudiante de Informática se
    calcula con base a las calificaciones
    de cuatro aspectos de su rendimiento
    académico: participación,
    primer examen parcial, segundo examen parcial
    y examen final.   
    Sabiendo que las calificaciones 
    anteriores entran a la calificación
    final con ponderaciones del 10%, 25%, 25% y 40%,    
    Hacer un programa que calcule e 
    imprima la calificación final obtenida por un estudiante.
*/
package A;

import javax.swing.JOptionPane;

public class califcacionFinalEstudiante {


    public static void main(String[] args) {
        float participacion;
        float priemrExamen;
        float segundoExamen;
        float examenFinal;
        
        participacion = Float.parseFloat(JOptionPane.showInputDialog("ingrese cantida"));
        priemrExamen = Float.parseFloat(JOptionPane.showInputDialog("ingrese cantida"));
        segundoExamen = Float.parseFloat(JOptionPane.showInputDialog("ingrese cantida"));
        examenFinal = Float.parseFloat(JOptionPane.showInputDialog("ingrese cantida"));
        
        participacion *= 0.10;
        priemrExamen *= 0.25;
        segundoExamen *= 0.25;
        examenFinal *= 0.40;
        
        float notaFinal = participacion+priemrExamen+segundoExamen+examenFinal;
        System.out.println("la nota final es: "+notaFinal);
        
    }
    
}
