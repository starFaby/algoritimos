package fabyLynna;

import javax.swing.JOptionPane;

public class A1_1Reforzamiento {
    
    public static void main(String[] args) {
        boolean on = true;
        int option;
        while (on) {
            option = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion"
                    + "\n 1._ Multiplo de 10"
                    + "\n 2._ ordenar"
                    + "\n 3._ Salario de un obrero"
                    + "\n 4._ Salir"));
            switch (option) {
                case 1:
                    /*
                    Programa que lea 
                    un número entero y
                    muestre si el número
                    es múltiplo de 10.
                     */
                    boolean on1 = true;
                    int option1;
                    while (on1) {
                        option1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
                        if (option1 % 10 == 0) {
                            System.out.println(" El numero "+option1+" es multiplo de 10");
                            on1 = false;
                        }else{
                            System.out.println(" El numero "+option1+" NO...es  multiplo de 10");
                        }
                    }
                    
                    break;
                case 2:
                    /*
                        Pedir tres números y mostrarlos
                        ordenados de menor a mayor.
                    */
                    int num1;
                    int num2;
                    int num3;
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el primer numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el segundo numero"));
                    num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el tercer numero"));
                    if (num1 > num2 && num2 > num3) {
                        System.out.println(" numero mayor "+num1+" Numero intermedio "+num2+" Numero menor "+num3);
                    }else if(num2 > num3 && num3 > num1){
                        System.out.println(" numero mayor "+num2+" Numero intermedio "+num3+" Numero menor "+num1);
                    }else if(num3 > num1 && num1 > num2){
                        System.out.println(" numero mayor "+num1+" Numero intermedio "+num2+" Numero menor "+num3);
                    }else if(num1 < num2 && num2 < num3){
                        System.out.println(" numero mayor "+num3+" Numero intermedio "+num2+" Numero menor "+num1);
                    }else if(num2 < num3 && num3 < num1){
                        System.out.println(" numero mayor "+num1+" Numero intermedio "+num3+" Numero menor "+num2);
                    }else if(num3 < num1 && num1 < num2){
                        System.out.println(" numero mayor "+num2+" Numero intermedio "+num1+" Numero menor "+num3);
                    }
                    
                    
                    break;
                case 3:
                    /*
                        Ejercicio 5: Un obrero necesita 
                        calcular su salario semanal,
                        el cual se obtiene de la siguiente
                        manera: Si trabaja 40 horas o menos
                        se le paga $16 por hora. Si trabaja
                        mas de 40 horas se le paga $16 por 
                        cada una de las primeras 40 horas 
                        y $20 por cada hora extra. 
                    */
                    int horasTrabajadas;
                    int salarioSemanal;
                    int horasMenos40;
                    int horasMas40;
                    int salarioNormalHora=16;
                    int salarioExtraHora=20;
                    horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas"));
                    if (horasTrabajadas <= 40) {
                        salarioSemanal = horasTrabajadas * salarioNormalHora;
                        System.out.println("El salario semanal es: "+salarioSemanal);
                    }else if(horasTrabajadas >40){
                        salarioSemanal = (40 * salarioNormalHora)+((horasTrabajadas-40)*salarioExtraHora);
                        System.out.println("Salario semanal es: "+salarioSemanal);
                    }
                    
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Vuelva pronto");                    
                    on =  false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
                    break;
            }
        }
    }
    
}
