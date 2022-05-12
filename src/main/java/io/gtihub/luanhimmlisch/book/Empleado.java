package io.gtihub.luanhimmlisch.book;

public class Empleado {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;
    // constructor para inicializar nombre, fecha de nacimiento y fecha de
    // contratación

    public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento,
            Fecha fechaDeContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaDeNacimiento;
        this.fechaContratacion = fechaDeContratacion;
    }

    // convierte Empleado a formato String
    public String toString() {
        return String.format("%s, %s Contratado: %s Cumpleanios: %s",
                apellido, nombre, fechaContratacion, fechaNacimiento);
    }
} // fin de la clase Empleado