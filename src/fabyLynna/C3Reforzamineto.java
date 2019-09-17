
package fabyLynna;

import javax.swing.JOptionPane;

public class C3Reforzamineto {

    public static void main(String[] args) {
        boolean on = true;
        int option;
        while(on){
            option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion"
                    + "\n 1._ "
                    + "\n 2._"
                    + "\n 3._"
                    + "\n 4._"
                    + "\n 5._ Salir"));
            switch(option){
                case 1:
                    /*
                        Leer números hasta que se introduzca
                        un 0. Para cada uno indicar si es
                        par o impar.
                     */
                    int num;
                    num = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
                    while(num != 0){
                        if (num%2 == 0) {
                            System.out.println("El numero es Par");
                        }else{
                            System.out.println("El numero es Impar");
                        }
    
                    }
                    break;
                case 2:
                    /*
                        Pedir 10 números, y mostrar al
                        final si se ha introducido alguno negativo.
                    */
                    int num2;
                    int conteoCeros = 0;
                    int conteoPositivo = 0;
                    int conteoNegativo = 0;
                    for (int i = 0; i < 10; i++) {
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
                        if (num2 > 0) {
                            conteoPositivo++;
                        }else{
                            conteoNegativo++;
                        }
                        if (num2 == 0) {
                            conteoCeros++;
                        }
                        
                    }
                    System.out.println("numeros positivos hay "+conteoPositivo);
                    System.out.println("numeros negativos hay "+conteoNegativo);
                    System.out.println("numeros igual a cero hay "+conteoCeros);
                    break;
                case 3:
                    /*
                        Pedir números hasta que se introduzca
                        uno negativo, y calcular la media.
                    */
                    int num3;
                    int mediaNumeros=0;
                    int sumaNumeros = 0;
                    int conteoNumeros=0;
                    num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                    while(num3 > 0 && num3 != 0){
                        sumaNumeros += num3;
                        conteoNumeros++;
                    }
                    mediaNumeros = sumaNumeros/conteoNumeros;
                    System.out.println("La media de N numeros es: "+mediaNumeros);
                    break;
                case 4:
                    /*
                        Una empresa que se dedica a la venta
                        de desinfectantes necesita
                        un programa para gestionar las 
                        facturas. En cada factura figura:
                        el código del artículo, 
                        la cantidad vendida en litros
                        y el precio por litro. Se pide
                        de 5 facturas introducidas:
                        Facturación total, cantidad
                        en litros vendidos del artículo 1 
                        y cuantas facturas se emitieron
                        de más de $600.
                    */
                    float codigoArticulo;
                    float cantidadLitros;
                    float precioLitros;
                    float precioVendidoArticulos1=0;
                    float precioFinalLitro;
                    int conteo600=0;
                    float facturacionTotal=0;
                    for (int i = 0; i < 5; i++) {
                        codigoArticulo = Float.parseFloat(JOptionPane.showInputDialog((i+1)+" Factura \n Ingrese el codigo"));
                        cantidadLitros = Float.parseFloat(JOptionPane.showInputDialog((i+1)+" Factura \n Ingrese la cantidad de litros"));
                        precioLitros = Float.parseFloat(JOptionPane.showInputDialog((i+1)+" Factura \n Ingrese el precio del litro"));
                        if (codigoArticulo == 1) {
                            precioVendidoArticulos1 = cantidadLitros * precioLitros;
                        }
                        precioFinalLitro = cantidadLitros * precioLitros;
                        if (precioFinalLitro > 600) {
                            conteo600++;
                        }
                        facturacionTotal += precioFinalLitro;
                    }
                    System.out.println("Facturacion total de las 5 facturas es: "+facturacionTotal);
                    System.out.println("Cantidad de litros vendidos en el articulo 1 "+precioVendidoArticulos1);
                    System.out.println("Facturas mas de 600 son :"+conteo600);
                    
                    break;
                case 5:
                    on = false;
                    JOptionPane.showMessageDialog(null, "Vuelva pronto");
                    break;
                default:
                    
                    break;
            }
        }
    }
    
}
