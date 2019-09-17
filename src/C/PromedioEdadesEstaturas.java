/*
Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y 
la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad 
de alumnos que miden más de 1.75.
 */
package C;

import javax.swing.JOptionPane;

public class PromedioEdadesEstaturas {

    public static void main(String[] args) {
        int edad = 0, sumaEdad = 0, conteoMayor18 = 0, conteoMayor178 = 0, mediaEdad = 0, mediaAltura = 0;
        float altura, sumaAltura = 0;
        for (int i = 0; i < 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la " + i + " edad"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la " + i + " altura"));
            sumaEdad += edad;
            sumaAltura += altura;
            if (edad > 18) {
                conteoMayor18++;
            }
            if (altura > 178) {
                conteoMayor178++;
            }
        }
        mediaEdad = sumaEdad / 5;
        mediaAltura = (int) sumaAltura / 5;
        System.out.println("mayores de dad son: " + conteoMayor18);
        System.out.println("altura superior de 1.75 son: " + conteoMayor178);
        System.out.println("La mediana de la edad es. "+mediaEdad);
        System.out.println("La mediana de la altura es: "+mediaAltura);

    }

}
