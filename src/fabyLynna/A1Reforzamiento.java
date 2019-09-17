package fabyLynna;

import javax.swing.JOptionPane;

public class A1Reforzamiento {
    
    public static void main(String[] args) {
        boolean on = true;
        int option;
        while (on) {
            option = Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion"
                    + "\n 1._ Averiguar la cantidad de dinero"
                    + "\n 2._ Calcular semanas diaz y horas"
                    + "\n 3._ calificacion de un estudiante"
                    + "\n 4._ Suna de 3 notas"
                    + "\n 5._ Salir"));
            switch (option) {
                case 1:
                    /*
                    Guillermo tiene N dolares. Luis tiene
                    la mitad de lo que
                    posee Guillermo. Juan tiene
                    la mitad de lo que poseen
                    Luis y Guillermo juntos. Hacer
                    un programa que calcule
                    e imprima la cantidad de dinero
                    que tienen entre los tres.
                    */
                    int guillermo;
                    int luis;
                    int juan;
                    int total;
                    guillermo =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que tiene guillermo"));
                    luis = guillermo/2;
                    juan = (guillermo+luis)/2;
                    total = guillermo+luis+juan;
                    System.out.println("Entre guillermo juan y luis tienen: "+total);
                    break;
                case 2:
                    /*
                        Construir un programa que, dado un número
                        total de horas, devuelve el número de
                        semanas, días y horas  equivalentes. 
                        Por ejemplo, dado un total de 1000 horas
                        debe mostrar 5 semanas, 6 días y 16 horas.
                    */
                    int totalHoras;
                    int semanas;
                    int dias;
                    int horas;
                    totalHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas"));
                    semanas = totalHoras/168;
                    dias = totalHoras%168/24;
                    horas = totalHoras%24;
                    System.out.println("\n total de horas "+totalHoras
                            + "\n total de semanas "+semanas
                            + "\n total de diaz "+dias
                            + "\n total de horas "+horas);
                    break;
                case 3:
                    /*
                        La calificación final de un 
                        estudiante de Informática se
                        calcula con base a las calificaciones
                        de cuatro aspectos de su rendimiento
                        académico: participación,
                        primer examen parcial,
                        segundo examen parcial
                        y examen final.   
                        Sabiendo que las calificaciones 
                        anteriores entran a la calificación final
                        con ponderaciones del 10%, 25%, 25% y 40%,    
                        Hacer un programa que calcule e 
                        imprima la calificación final obtenida por un estudiante.
                    */
                    float participacion;
                    float primerExamenParcial;
                    float segundoExamenParcial;
                    float examenFinal;
                    float totalAprovacion;
                    participacion = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota de participacion"));
                    primerExamenParcial = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del primer examen"));
                    segundoExamenParcial = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del segundo examen"));
                    examenFinal = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del examen final"));
                    participacion *=0.10;
                    primerExamenParcial *= 0.25;
                    segundoExamenParcial *= 0.25;
                    examenFinal *= 0.40;
                    totalAprovacion = participacion+primerExamenParcial+segundoExamenParcial+examenFinal;
                    System.out.println("Total nota es: "+examenFinal);
                    
                    break;
                case 4:
                    /*
                        Hacer un programa que calcule e 
                        imprima la suma de tres calificaciones.
                    */ 
                    int nota;
                    int notaTotal = 0;
                    for (int i = 0; i < 3; i++) {
                        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
                        notaTotal += nota;
                    }
                    System.out.println("la suma de las tres notas son: "+notaTotal);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Vuelva pronto");
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;
            }
        }
    }
    
}
