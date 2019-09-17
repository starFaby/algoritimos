package fabyLynna;

import javax.swing.JOptionPane;

public class D2Reforzamiento {

    public static void main(String[] args) {
        boolean on = true;
        int option;
        while (on) {
            option = Integer.parseInt(JOptionPane.showInputDialog("Selecciona opcion"
                    + "\n 1._  mezclar dos arreglos"
                    + "\n 2._ Media positivos y media negativos"
                    + "\n 3._ separar numeros pares y impares"
                    + "\n 4._ no existe ejercicio"
                    + "\n Salir"));
            switch (option) {
                case 1:
                    /*
                        Leer por teclado dos tablas de 10 
                        números enteros y mezclarlas en 
                        una tercera de la forma: el 1º de A,
                        el 1ºde B, el 2º de A, el 2º de B, etc.
                     */
                    int[] a;
                    int[] b;
                    int[] c;
                    a = new int[10];
                    b = new int[10];
                    c = new int[20];
                    System.out.println("Llenando el primer arreglo");
                    for (int i = 0; i < 10; i++) {
                        a[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "numero ingresado"));
                    }
                    System.out.println("Llenando el segundo arreglo");
                    for (int i = 0; i < 10; i++) {
                        b[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "numero ingresado"));
                    }
                    System.out.println("mezaclando los dos arreglos");
                    int j = 0;
                    for (int i = 0; i < 10; i++) {
                        c[j] = a[i];
                        j++;
                        c[j] = b[i];
                        j++;
                    }
                    System.out.println("El nuevo arreglo es:");
                    for (int i = 0; i < 20; i++) {
                        System.out.print(c[i] + "-");
                    }
                    break;
                case 2:
                    /*
                        Leer 5 números por teclado, 
                        almacenarlos en un arreglo y a
                        continuación realizar la 
                        media de los números positivos, 
                        la media de los negativos 
                        y conteo el número de ceros.
                     */
                    int mediaPositivos,
                     mediaNegativos,
                     sumaPositivos = 0,
                     sumaNegativos = 0;
                    int conteoPositivos = 0,
                     conteoNegativos = 0,
                     conteoCeros = 0;
                    int[] arrays2;
                    arrays2 = new int[5];
                    System.out.println("Llenando el  arreglo");
                    for (int i = 0; i < 5; i++) {
                        arrays2[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "numero ingresado"));
                        if (arrays2[i] > 0) {
                            sumaPositivos = arrays2[i];
                            conteoPositivos++;
                        }
                        if (arrays2[i] < 0) {
                            sumaNegativos = arrays2[i];
                            conteoNegativos++;
                        }
                        if (arrays2[i] == 0) {
                            conteoCeros++;
                        }
                    }
                    if (conteoPositivos == 0) {
                        System.out.println("No se puede dividir para cero");
                    } else {
                        mediaPositivos = sumaPositivos / conteoPositivos;
                        System.out.println("La Media positivos es " + mediaPositivos);
                    }

                    if (conteoNegativos == 0) {
                        System.out.println("No se puede dividir para cero");
                        mediaNegativos = sumaNegativos / conteoNegativos;
                        System.out.println("La media negativos es: " + mediaNegativos);
                    }
                    System.out.println(" El conteo de ceros es: " + conteoCeros);
                    break;
                case 3:
                    /*
                        Leer 10 enteros. Guardar en otra 
                        tabla los elementos pares de la primera,
                        y a continuación los elementos mmmm
                        separar pares y impares de un arreglo
                     */
                    int[] arrays3;
                    arrays3 = new int[10];
                    int conteoPares = 0,
                     conteoImpares = 0;
                    int[] pares,
                     impares;
                    System.out.println("Llenando el arreglo");
                    for (int i = 0; i < 10; i++) {
                        arrays3[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "numeros ingresados"));
                        if (arrays3[i] % 2 == 0) {
                            conteoPares++;
                        }
                        if (arrays3[i] % 2 != 0) {
                            conteoImpares++;
                        }
                    }
                    pares = new int[conteoPares];
                    impares = new int[conteoImpares];
                    conteoPares = 0;
                    conteoImpares = 0;
                    for (int i = 0; i < 10; i++) {
                        if (arrays3[i] % 2 == 0) {
                            pares[conteoPares] = arrays3[i];
                            conteoPares++;
                        }
                        if (arrays3[i] % 2 != 0) {
                            impares[conteoImpares] = arrays3[i];
                            conteoImpares++;
                        }
                    }
                    System.out.println("numeros pares");
                    for (int i = 0; i < conteoPares; i++) {
                        System.out.println(pares[i]);
                    }
                    System.out.println("Numeros Impares");
                    for (int i = 0; i < conteoImpares; i++) {
                        System.out.println(impares[i]);
                    }
                 
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Esta seccione no tiene \n ejercicio");
                    break;
                case 5:
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;
            }
        }
    }

}
