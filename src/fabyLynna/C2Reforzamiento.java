package fabyLynna;

import javax.swing.JOptionPane;

public class C2Reforzamiento {

    public static void main(String[] args) {
        boolean on = true;
        int option;
        while (on) {
            option = Integer.parseInt(JOptionPane.showInputDialog("selecciones opcion"
                    + "\n 1._numeros del 1 al 100 de 7 en 7"
                    + "\n 2._ escribir y mostrar 5 numeros en orden"
                    + "\n 5._ Salir"));
            switch (option) {
                case 1:
                    /*
                    Ejercicio 9: Escribir todos los 
                    números del 100 al 0 de 7 en 7.
                     */
                    for (int i = 0; i < 100; i += 7) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    /*
                        Leer 5 números, guardarlos en un 
                        arreglo y mostrarlos en el mismo
                        orden que ingresaron.
                     */
                    int[] numeros = new int[5];
                    for (int i = 0; i < 5; i++) {
                        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ".er numero"));
                    }
                    for (int numero : numeros) {
                        System.out.println(numero);
                    }
                    break;

                case 3:
                    /*
                    Pedir 10 números. Mostrar la media de los
                    números positivos, la media de los   
                    números negativos y la cantidad de ceros.
                     */
                    int num3;
                    int mediaPositivos = 0,
                     mediaNegativos = 0;
                    int sumaPositivos = 0,
                     sumaNegativos = 0;
                    int conteoPositivos = 0,
                     conteoNegativos = 0,
                     conteoCeros = 0;
                    for (int i = 0; i < 10; i++) {
                        num3 = Integer.parseInt(JOptionPane.showInputDialog("._ numero ingresado"));
                        if (num3 > 0) {
                            sumaPositivos += num3;
                            conteoPositivos++;
                        }
                        if (num3 < 0) {
                            sumaNegativos += num3;
                            conteoNegativos++;
                        }
                        if (num3 == 0) {
                            conteoCeros++;
                        }
                    }
                    mediaPositivos = sumaPositivos / conteoPositivos;
                    mediaNegativos = sumaNegativos / conteoNegativos;
                    System.out.println("la media positivos es: " + mediaPositivos);
                    System.out.println("La media negativos es: " + mediaNegativos);
                    System.out.println("Conteo de cero es: " + conteoCeros);
                    break;
                case 4:
                    /*
                        Leer un número y mostrar su cuadrado, 
                        repetir el proceso hasta que se
                        introduzca un número negativo.
                     */
                    int cuadrado = 2;
                    int numero;
                    int result;
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
                    while (numero > 0) {
                        result = (int) Math.pow(numero, cuadrado);
                        System.out.println("el cuadrado de " + numero + " es: " + result);
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

                    }
                    JOptionPane.showMessageDialog(null, "Haz ingresado un numero negativo");
                    break;
                case 5:
                    on = false;
                    JOptionPane.showMessageDialog(null, "Vuelva pronto");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }
        }
    }

}
