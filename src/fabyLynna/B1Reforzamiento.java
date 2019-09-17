package fabyLynna;

import javax.swing.JOptionPane;

public class B1Reforzamiento {

    public static void main(String[] args) {
        boolean on = true;
        int option;
        while (on) {
            option = Integer.parseInt(JOptionPane.showInputDialog("Selecione opcion"
                    + "\n 1._ Cajero Automatico"
                    + "\n 2._ Calculadora"
                    + "\n 3._ fecha correcta"
                    + "\n 4._ letra mayuscula"
                    + "\n 5._ Salir"));
            switch (option) {
                case 1:
                    /*
                        Hacer un programa que simule
                        un cajero automático 
                        con un saldo inicial de 1000
                        dólares, con el
                        siguiente menú de opciones:

                        1. Ingresar dinero a la cuenta.
                        2. Retirar dinero de la cuenta.
                        3. Salir
                     */
                    float saldoInicial = 1000;
                    float ingresarDinero;
                    float retirarDinero;
                    float totalDinero;
                    int option1;
                    boolean on1;
                    while (on) {
                        option1 = Integer.parseInt(JOptionPane.showInputDialog("Selecciona opcion"
                                + "\n 1._ Ingresar dinero"
                                + "\n 2._ Sacar dinero"
                                + "\n 3._ Salir"));
                        switch (option1) {
                            case 1:
                                ingresarDinero = Float.parseFloat(JOptionPane.showInputDialog("Ingresar dinero"));
                                saldoInicial += ingresarDinero;
                                JOptionPane.showMessageDialog(null, "Total dinero es: " + saldoInicial);
                                break;
                            case 2:
                                retirarDinero = Float.parseFloat(JOptionPane.showInputDialog("Sacar dinero"));
                                saldoInicial -= retirarDinero;
                                JOptionPane.showMessageDialog(null, "saldo total es: " + saldoInicial);
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Vuelva pronto");
                                on1 = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion Invalida");
                                on1 = false;
                        }
                    }

                    break;
                case 2:
                    /*
                        crear calculadora con
                        las 4 operaciones matematicas
                     */
                    float num1;
                    float num2;
                    float suma;
                    float resta;
                    float multiplicacion;
                    float divicion;
                    boolean on2 = true;
                    int option2;
                    while (on2) {
                        option2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion"
                                + "\n 1._ Suma "
                                + "\n 2._ Resta"
                                + "\n 3._ multiplicaion"
                                + "\n 4._ divicion"
                                + "\n 5._ Salir"));
                        switch (option2) {
                            case 1:
                                num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
                                num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                                suma = num1 + num2;
                                System.out.println("la suma es: " + suma);
                                break;
                            case 2:
                                num1 = Float.parseFloat(JOptionPane.showInputDialog("ingresa el primer numero"));
                                num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el segundo numero"));
                                resta = num1 + num2;
                                System.out.println("la resta es: " + resta);
                                break;
                            case 3:
                                num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
                                num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el segundo numero"));
                                multiplicacion = num1 * num2;
                                System.out.println("La multiplicaion es: " + multiplicacion);
                                break;
                            case 4:
                                num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
                                num2 = Float.parseFloat(JOptionPane.showInputDialog("ingrese el ssegundo numero"));
                                divicion = num1 / num2;
                                System.out.println("La division es: " + divicion);
                                break;
                            case 5:
                                on2 = false;
                                JOptionPane.showMessageDialog(null, "Vuelva pronto");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion invalida");
                                break;
                        }
                    }
                    break;
                case 3:
                    /*
                    Pedir el día, mes y año
                    de una fecha e indicar 
                    si la fecha es correcta.
                    Suponiendo todos los meses 
                    de 30 días.
                     */
                    int dia;
                    int mes;
                    int ano;
                    dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
                    if (dia >= 1 && dia <= 30) {
                        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
                        if (mes >= 1 && mes <= 12) {
                            ano = Integer.parseInt(JOptionPane.showInputDialog("ingrese el año"));
                            if (ano != 0) {
                                System.out.println("fecha correcta");
                            } else {
                                System.out.println("Año incorrecto");
                            }
                        } else {
                            System.out.println("Mes incorrecto");
                        }

                    } else {
                        System.out.println("Dia incorrecto");
                    }
                    break;
                case 4:
                    /*
                        Programa que lea un carácter
                        por teclado y compruebe si 
                        es una letra mayúscula.
                    */
                    char letra;
                    letra=JOptionPane.showInputDialog("ingresar letra").charAt(0);
                    if (Character.isLowerCase(letra)) {
                        System.out.println("Es letra minuscula");
                    }else if(Character.isUpperCase(letra)){
                        System.out.println("Es una letra mayuscula");
                    }else{
                        System.out.println("Es un caracter ");
                    }
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
