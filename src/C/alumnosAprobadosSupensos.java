/*
Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
package C;
 
import javax.swing.JOptionPane;

public class alumnosAprobadosSupensos {
 
    public static void main(String[] args) {
        int aprobados, conteoAprobados=0;
        int condicionados, conteoCondicionados=0;
        int suspensos, conteoSuspensos=0;
        int notas;
        for (int i = 1; i <= 6; i++) {
            notas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota"));
            if (notas > 4 && notas <= 10) {
                conteoAprobados++;
            }
            if (notas ==4) {
                conteoCondicionados++;
            }
            if (notas > 0 && notas < 4) {
                conteoSuspensos++;
            }
        }
        System.out.println("Alumnos aprobados "+conteoAprobados);
        System.out.println("Alumnos condicionados "+ conteoCondicionados);
        System.out.println("Alumnos suspensos "+conteoSuspensos);
    }
    
}
