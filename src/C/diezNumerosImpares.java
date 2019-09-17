/*
    mostrar los diez numeros impares
    y multiplicar los numeros impares
*/
package C;

public class diezNumerosImpares {

    public static void main(String[] args) {
        long producto = 1;
        for (int i = 1; i < 20; i += 2) {
            producto *= i;
            System.out.println(i);
        }
        System.out.println("Multiplicacnion de nuemros impares " + producto);
    }

}
