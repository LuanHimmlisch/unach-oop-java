package io.gtihub.luanhimmlisch.book;

// Fig. 7.2: InicArreglo.java
// Inicialización de los elementos de un arreglo con valores predeterminados de cero
public class InicArreglo {
    public static void main(String[] args) {
        // declara la variable arreglo y la inicializa con un objeto arreglo
        int[] arreglo = new int[10]; // crea el objeto arreglo
        System.out.printf("%s%8s%n", "Indice", "Valor"); // encabezados de columnas
        // imprime el valor de cada elemento del arreglo
        for (int contador = 0; contador < arreglo.length; contador++)
            System.out.printf("%5d%8d%n", contador, arreglo[contador]);
    }
} // fin de la clase InicArreglo