package io.gtihub.luanhimmlisch;

// Cómo solucionar el problema del promedio de la clase mediante la repetición controlada por contador.
import java.util.Scanner; // el programa usa la clase Scanner

/**
 * @author Ricardo Vega Morales
 */
public class PromedioClase {
    public static void main(String[] args) {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        // fase de inicialización
        int total = 0; // inicializa la suma de calificaciones introducidas por el usuario
        int contadorCalificaciones = 1; // inicializa # de calificación a introducir a continuación

        // la fase de procesamiento usa la repetición controlada por contador
        while (contadorCalificaciones <= 10) // itera 10 veces
        {
            System.out.println("Escriba la calificacion: "); // indicador
            int calificacion = entrada.nextInt(); // recibe siguiente calificación de entrada
            total = total + calificacion; // suma calificación al total
            contadorCalificaciones = contadorCalificaciones + 1; // incrementa el contador en 1”
        }
        // fase de terminación
        int promedio = total / 10; // la división de enteros produce resultado entero

        // muestra el total y el promedio de las calificaciones
        System.out.printf("%nEl total de las 10 calificaciones es %d%n", total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    } // fin de main
} // fin de la clase PromedioClase