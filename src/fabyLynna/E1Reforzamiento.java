package fabyLynna;

import javax.swing.JOptionPane;

public class E1Reforzamiento {

    public static void main(String[] args) {
        boolean on = true;
        int option;
        while (on) {
            option = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion"
                    + "\n 1._Matriz Transpuesta"
                    + "\n 5._ Salir"));
            switch (option) {
                case 1:
                    int[][] matriz = new int[3][3];
                    System.out.println("Llenando matriz");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                            System.out.println("matriz[" + i + "][" + j + "]= " + matriz[i][j]);

                        }
                    }
                    System.out.println("matriz original");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matriz[i][j]);
                        }
                        System.out.println("");
                    }
                    System.out.println("Transponiendo matriz");
                    int aux;
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i);
                        for (int j = 0; j < i; j++) {
                            aux = matriz[i][j];
                            matriz[i][j] = matriz[j][i];
                            matriz[j][i] = aux;
                        }
                    }
                    System.out.println("Matriz transpuesta es: ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.println(matriz[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    /*
                        Crear una matriz “marco” de
                        tamaño 5x5: todos sus elementos 
                        deben ser 0 salvo los de los 
                        bordes que deben ser 1. Mostrarla.
                     */
                    int[][] matriz2;
                    matriz2 = new int[5][5];
                    System.out.println("Iniciando matriz");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i == 0 || i == 4) {
                                matriz2[i][j] = 1;
                            } else if (j == 0 || j == 4) {
                                matriz2[i][j] = 1;
                            } else {
                                matriz2[i][j] = 0;
                            }
                        }
                    }
                    System.out.println("mostrando matriz");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(matriz2[i][j]);
                        }
                        System.out.println("");
                    }
                case 3:
                    /*
                        Crear y cargar una matriz de
                        tamaño n x m y decir si es
                        simétrica o no.
                    */
                    int[][] matriz3;
                    int nFilas, nColumnas;
                    boolean simetrica = true;
                    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
                    nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columas"));
                    System.out.println("Llenando la matriz");
                    matriz3 = new int[nFilas][nColumnas];
                    for (int i = 0; i < nFilas; i++) {
                        for (int j = 0; j < nColumnas; j++) {
                            System.out.print(matriz3[i][j]);
                        }
                        System.out.println("");
                    }
                    if (nFilas == nColumnas) {
                        int i,j;
                        i = 0;
                        while(i < nFilas && simetrica==true){
                            j = 0;
                            while(j<nColumnas && simetrica==true){
                                if (matriz3[i][j] != matriz3[j][i]) {
                                    simetrica =false;
                                }
                                j++;
                            }
                            i++;
                        }
                        if (simetrica == true) {
                            System.out.println("Es simetrica");
                        }else{
                            System.out.println("No es simetrica");
                        }
                    }else{
                        System.out.println("La matriz NO es simetrica ");
                    }
                    break;
                case 5:
                    on = false;
                    JOptionPane.showMessageDialog(null, "Vuelva pronto");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida ");
                    break;
            }
        }
    }

}
