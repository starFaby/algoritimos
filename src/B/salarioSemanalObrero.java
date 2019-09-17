package B;
/*
Ejercicio 5: Un obrero necesita calcular su salario semanal,
el cual se obtiene de la siguiente manera: Si trabaja 40 horas o menos
se le paga $16 por hora. Si trabaja mas de 40 horas se le paga $16 por 
cada una de las primeras 40 horas y $20 por cada hora extra. 
*/
import javax.swing.JOptionPane;

public class salarioSemanalObrero {

    public static void main(String[] args) {
        
        int obrero;
        int salario;
        int semana = 40;
        int diaTrabajado= 8;
        int pagoPorHora = 16;
        int horaextra = 20;
        int horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese total de horas"));
        if (horas <= 40) {
             salario = pagoPorHora * horas;
             System.out.println("Salario por trabajar : "+salario);
        } else if (horas > 40) {
            int numeroHoras1 = semana;
            int numeroHoras2 = semana - horas;
            int sumaHoras = numeroHoras1 +numeroHoras2;
            int salario1 = numeroHoras1 * pagoPorHora;
            int salrio2 = numeroHoras2 * (horaextra *-1);
            salario = salario1 +salrio2;
            System.out.println("en la semana trabajo "+numeroHoras1+ " horas"
                    + "\n En la semana trabajo "+numeroHoras2 * -1 +" Horas extraordinarias"
                    + "\n Salario normal "+salario1
                    + "\n salario solo horas extraordinaria "+salrio2
                    + "\n Salario total "+salario
                    + "\n");
        }else if(horas==0){
            System.out.println("NO A TRABAJADO NINGUNA HORA");
        }
    }

}
