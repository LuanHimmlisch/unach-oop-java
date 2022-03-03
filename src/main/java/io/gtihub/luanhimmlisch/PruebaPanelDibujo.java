package io.gtihub.luanhimmlisch;

import javax.swing.JFrame;

/**
 * @author Ricardo Vega Morales
 */
public class PruebaPanelDibujo {
    public static void main(String[] args) {
        PanelDibujo panel = new PanelDibujo();
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel);
        aplicacion.setSize(500, 500);
        aplicacion.setVisible(true);
    }
}