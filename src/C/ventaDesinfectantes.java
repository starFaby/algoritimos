/*
    Una empresa que se dedica a la venta de desinfectantes necesita
    un programa para gestionar las facturas. En cada factura figura: el código del artículo, 
    la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas:
    Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron
    de más de $600.
*/
package C;

import javax.swing.JOptionPane;

public class ventaDesinfectantes {

    public static void main(String[] args) {
        int codigo, cantidadLitros, litrosArticulo1=0, conteoMas600=0;
        float precioLitro, importeFactura,FacturacionTotal=0;
        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° " + i + "\n Dijite el codigo:"));
            cantidadLitros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° " + i + "\n Dijite la cantidad de litros:"));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el " + i + " precio del litro"));
            importeFactura =(float) cantidadLitros *precioLitro;
            FacturacionTotal += importeFactura;
            if (codigo == 1) {
                litrosArticulo1 += cantidadLitros;
            }
            if (importeFactura > 600) {
                conteoMas600++; 
           }
        }
        System.out.println("RESUMEN DE VENTAS");
        System.out.println("Facturacion total : "+ FacturacionTotal);
        System.out.println("Cantidad vendidads en el articulo 1: "+litrosArticulo1);
        System.out.println("Cantidad facturas mayores a 600$ :"+conteoMas600);
    }

}
