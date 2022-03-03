package io.gtihub.luanhimmlisch;

import javax.swing.JFrame;

/**
 * @author Ricardo Vega Morales
 */
public class PruebaPanelDibujo {
    public static void main(String[] args) {
        // crea un panel que contiene nuestro dibujo
        PanelDibujo panel = new PanelDibujo();

        // crea un nuevo marco para contener el panel
        JFrame aplicacion = new JFrame();

        // establece el marco para salir cuando se cierre
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel); // agrega el panel al marco
        aplicacion.setSize(250, 250); // establece el tamaño del marco
        aplicacion.setVisible(true); // hace que el marco sea visible
    }
} // fin de la clase PruebaPanelDibujo