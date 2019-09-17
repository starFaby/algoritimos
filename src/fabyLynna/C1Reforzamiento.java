package fabyLynna;

import javax.swing.JOptionPane;

public class C1Reforzamiento {

    public static void main(String[] args) {
        boolean on = true;
        int option;
        while (on) {
            option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion"));
            switch (option) {
                case 1:
                    /*
                        Ejercicio 15: Dadas las edades
                        y alturas de 5 alumnos, mostrar la edad y 
                        la estatura media, la cantidad de 
                        alumnos mayores de 18 años, y la cantidad 
                        de alumnos que miden más de 1.75.
                     */
                    int edad;
                    int estatura;
                    int sumaEdad = 0;
                    int sumaAltura = 0;
                    int mediaEdad;
                    int mediaAltura;
                    int conteoMayores18 = 0;
                    int conteoEstatura175 = 0;
                    for (int i = 0; i < 5; i++) {
                        edad = Integer.parseInt(JOptionPane.showInputDialog(i + ".er edad"));
                        estatura = Integer.parseInt(JOptionPane.showInputDialog(i + ".era estatura"));
                        sumaEdad += edad;
                        sumaAltura += estatura;
                        if (edad > 18) {
                            conteoMayores18++;
                        }
                        if (estatura > 175) {
                            conteoEstatura175++;
                        }
                    }
                    mediaEdad = sumaEdad / 5;
                    mediaAltura = sumaAltura / 5;
                    System.out.println("La media de las edades es: " + mediaEdad);
                    System.out.println("La media de edades es:" + mediaAltura);
                    System.out.println("Alumnos mayores de 18 son: " + conteoMayores18);
                    System.out.println("Alumnos altos son: " + conteoEstatura175);
                    break;
                case 2:
                    /*
                    Realizar un juego para adivinar un número. 
                    Para ello generar un número aleatorio entre 0-100,
                    y luego ir   
                    pidiendo números indicando “es mayor” o 
                    “es menor” según sea mayor o menor
                    con respecto a N. El proceso termina   
                    cuando el usuario acierta y mostrar
                    el número de intentos.
                     */
                    int aleatorio,
                     num = 0,
                     conteo = 0;
                    aleatorio = (int) (Math.random() * 100);
                    System.out.println(aleatorio);
                    boolean on2 = true;
                    while (on2) {
                        num = Integer.parseInt(JOptionPane.showInputDialog("Dijita un numero"));
                        if (num > aleatorio) {
                            System.out.println("Ingresa un numero menor");
                        }
                        if (num < aleatorio) {
                            System.out.println("Ingresa un numero mayor");
                        }

                        conteo++;
                        if (aleatorio == num) {
                            on2 = false;
                        }
                    }
                    System.out.println("El numero adivinado es: " + num);
                    System.out.println("Lo isiste en " + conteo + " intentos");

                    break;
                case 3:
                    /*
                        Dadas 6 notas, escribir la cantidad
                        de alumnos aprobados, condicionados (=4)
                        y suspensos.
                     */
                    int notas;
                    int conteoAprobados = 0;
                    int conteoCondicionados = 0;
                    int conteoSuspensos = 0;
                    for (int i = 0; i < 6; i++) {
                        notas = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ".er nota ingresada"));
                        if (notas > 4) {
                            conteoAprobados++;
                        }
                        if (notas == 4) {
                            conteoCondicionados++;
                        }
                        if (notas < 4) {
                            conteoSuspensos++;
                        }
                    }
                    System.out.println("Alumnos aprobados son: " + conteoAprobados);
                    System.out.println("Alumnos condicionados son: " + conteoCondicionados);
                    System.out.println("Alumnos suspensos son: " + conteoSuspensos);
                    break;
                case 4:
                    /*
                    mostrar los diez numeros impares
                     */
                    int producto = 1;
                    for (int i = 1; i < 20; i++) {
                        int num4 = i + 1;
                        if (num4 % 2 != 0) {
                            producto *= num4;
                        }
                    }
                    System.out.println(producto);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por visitarnos");
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;

            }
        }
    }

}
