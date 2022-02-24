package io.gtihub.luanhimmlisch;

/**
 * PROGRAMA
 * 
 * @author Ricardo Vega Morales
 */
public class Estudiante {
    private String nombre;
    private double promedio;

    // el constructor inicializa las variables de instancia
    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;

        // valida que promedio sea > 0.0 y <= 100.0; de lo contrario,
        // mantiene el valor predeterminado de la variable de instancia promedio (0.0)
        if (promedio > 0.0)
            if (promedio <= 100.0)
                this.promedio = promedio; // asigna a la variable de instancia
    }

    // establece el nombre del Estudiante
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    // recupera el nombre del Estudiante
    public String obtenerNombre() {
        return nombre;
    }

    // establece el promedio del Estudiante
    public void establecerPromedio(double promedio) {
        // valida que promedio sea > 0.0 y <= 100.0; de lo contrario,
        // mantiene el valor actual de la variable de instancia promedio
        if (promedio > 0.0)
            if (promedio <= 100.0)
                this.promedio = promedio; // asigna a la variable de instancia
    }

    // recupera el promedio del Estudiante
    public double obtenerPromedio() {
        return promedio;
    }

    // determina y devuelve la calificación en letras del Estudiante
    public String obtenerCalificacionEstudiante() {
        String calificacionEstudiante = ""; // se inicializa con objeto String vacío
        if (promedio >= 90.0)
            calificacionEstudiante = "A";
        else if (promedio >= 80.0)
            calificacionEstudiante = "B";
        else if (promedio >= 70.0)
            calificacionEstudiante = "C";
        else if (promedio >= 60.0)
            calificacionEstudiante = "D";
        else
            calificacionEstudiante = "F";

        return calificacionEstudiante;
    }
} // fin de la clase Estudiante
