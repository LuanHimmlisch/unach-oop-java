package io.gtihub.luanhimmlisch;

/**
 *
 * @author Ricardo Vega Morales
 */
public class PruebaEstudiante {

    public static void main(String[] args) {
        Estudiante cuenta1 = new Estudiante("Jacqueline Perez Flores", 93.5);
        Estudiante cuenta2 = new Estudiante("Ricardo Isai Piña García", 72.75);

        System.out.printf("La calificacion en letra de %s es: %s%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerCalificacionEstudiante());
        System.out.printf("La calificacion en letra de %s es: %s%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerCalificacionEstudiante());
    }
} // fin de la clase PruebaEstudiante
