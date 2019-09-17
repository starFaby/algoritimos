package fabyLynna;

import javax.swing.JOptionPane;

public class D1Reforzamineto {

    public static void main(String[] args) {
        boolean on = true;
        int option;
        while (on) {
            option = Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion"
                    + "\n 1._ buscar un elemento de un arreglo ordenado"
                    + "\n 2._"
                    + "\n 3._"
                    + "\n 4._"
                    + "\n 4._ Salir"));
            switch (option) {
                case 1:
                    /*
                        Leer 10 enteros ordenados creciente mente.
                        Leer N y buscarlo en la tabla. 
                        Se debe mostrar la posición en que se
                        encuentra. Si no está, indicarlo 
                        con un mensaje.
                     */
                    boolean ordenado = true;
                    int[] arreglo = new int[10];
                    int numeroABuscar;
                    do {
                        for (int i = 0; i < 10; i++) {
                            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " numero ingresado"));
                        }
                        for (int i = 0; i < 9; i++) {
                            if (arreglo[i] < arreglo[i + 1]) {
                                ordenado = true;
                            }
                            if (arreglo[i] > arreglo[i + 1]) {
                                ordenado = false;
                                break;
                            }
                        }
                        if (ordenado == false) {
                            JOptionPane.showInputDialog("Numeros desordenados \n Ingres de nuevo los numeros");
                        }

                    } while (ordenado == false);
                    numeroABuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
                    int i = 0;
                    while (i < 10 && arreglo[i] < numeroABuscar) {
                        i++;
                    }
                    if (i == 10) {
                        System.out.println("Numero no encontrado");
                    } else {
                        if (arreglo[i] == numeroABuscar) {
                            System.out.println("Numero encontrado en la pocicion " + i + " y el numero es: " + arreglo[i]);
                        } else {
                            System.out.println("numero NO.... encontrado");
                        }
                    }
                    break;
                case 2:
                    /*
                        Leer por teclado una serie de 10 números
                        enteros.
                        La aplicación debe indicarnos si
                        los números están ordenados
                        de forma creciente, decreciente, 
                        o si están desordenados.
                     */
                    int[] arreglo2;
                    arreglo2 = new int[10];
                    boolean creciente = false;
                    boolean decreciente = false;
                    for (int j = 0; j < 10; j++) {
                        arreglo2[j] = Integer.parseInt(JOptionPane.showInputDialog((j + 1) + " numero ingresado"));
                    }
                    System.out.println("Verificar si esta arreglado o no");
                    for (int j = 0; j < 9; j++) {
                        if (arreglo2[j] < arreglo2[j + 1]) {
                            creciente = true;
                        }
                        if (arreglo2[j] > arreglo2[j + 1]) {
                            decreciente = true;
                        }

                    }
                    if (creciente == true) {
                        System.out.println("Los numeros estan ordenados");
                    }
                    if (decreciente == true) {
                        System.out.println("Los numeros estan formados en forma decreciente");
                    }
                    if (creciente == true && decreciente == true) {
                        System.out.println("Los numeros estan desordenados");
                    }
                    if (creciente == false && decreciente == false) {
                        System.out.println("Los numeros son iguales");
                    }
                    break;
                case 3:
                    /*
                        Crear un programa que lea por teclado
                        una tabla de 10 números enteros y la
                        desplace una posición hacia abajo: el
                        primero pasa a ser el segundo, 
                        el segundo pasa a ser el tercero y así 
                        sucesivamente. El último pasa a ser el primero.
                     */
                    int[] arreglo3;
                    arreglo3 = new int[10];
                    int ultimo;
                    System.out.println("llenando el arreglo");
                    for (int j = 0; j < 10; j++) {
                        arreglo3[j] = Integer.parseInt(JOptionPane.showInputDialog((j + 1) + " Numero Ingresado"));
                    }
                    ultimo = arreglo3[9];
                    for (int j = 8; j > 0; j--) {
                        arreglo3[j + 1] = arreglo3[j];
                    }
                    arreglo3[0] = ultimo;
                    for (int j = 0; j < 10; j++) {
                        System.out.println(arreglo3[j]);
                    }
                    break;
                case 4:
                    /*
                        Leer 5 elementos numéricos que 
                        se introducirán ordenados de forma creciente.
                        Éstos los guardaremos en una tabla de tamaño 10. 
                        Leer un número N, e insertarlo en el lugar
                        adecuado para que la tabla continúe ordenada.
                     */
                    int[] arreglo4;
                    arreglo4 = new int[10];
                    boolean creciente4 = true;
                    int numero,
                     sitio_num = 0,
                     n = 0;
                    do {
                        for (int j = 0; j < 5; j++) {
                            arreglo4[j] = Integer.parseInt(JOptionPane.showInputDialog((j + 1) + "nuemro ingresado"));
                        }
                        for (int j = 0; j < 4; j++) {
                            if (arreglo4[j] < arreglo4[j + 1]) {
                                creciente4 = true;
                            }
                            if (arreglo4[j] > arreglo4[j + 1]) {
                                creciente4 = false;
                                break;
                            }
                        }
                        if (creciente4 == false) {
                            System.out.println("numeros desordenados"
                                    + "\n Ingrese nuevos numeros");
                        }

                    } while (creciente4 == false);
                    System.out.println("Numero a insertar");
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a insertar"));
                    while (arreglo4[n] < numero && n < 5) {
                        sitio_num++;
                        n++;
                    }
                    for (int j = 4; j > sitio_num; j--) {
                        arreglo4[j + 1] = arreglo4[j];
                    }
                    arreglo4[sitio_num] = numero;
                    System.out.println("el nuevo arreglo es: ");
                    for (int j = 0; j < 6; j++) {
                        System.out.print(arreglo4[j] + "-");
                    }
                    break;
                case 5:
                    on = false;
                    JOptionPane.showMessageDialog(null, "Vuelva Pronto");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;
            }
        }
    }

}
