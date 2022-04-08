package io.gtihub.luanhimmlisch.book;

// Fig. 7.5: SumaArreglo.java
// Cálculo de la suma de los elementos de un arreglo.
public class SumaArreglo {
    public static void main(String[] args) {
        int[] arreglo = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;
        // suma el valor de cada elemento al total
        for (int contador = 0; contador < arreglo.length; contador++)
            total += arreglo[contador];
        System.out.printf("Total de los elementos del arreglo: %d%n", total);
    }
} // fin de la clase SumaArreglo