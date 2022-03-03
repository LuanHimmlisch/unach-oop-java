package io.gtihub.luanhimmlisch;

import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JPanel;

/**
 * @author Ricardo Vega Morales
 * @author Luis Ángel Serrano Catalá
 */
public class PanelDibujo extends JPanel // JPanel superclase; PanelDibujo subclase
{
    // dibuja una x desde las esquinas del panel

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        final int TIMES = 15;
        final int MODIFIER = 20;
        final int SIZE = TIMES * MODIFIER;

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(0, 0, x * MODIFIER, (TIMES - x) * MODIFIER);
        }

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(SIZE, 0, (TIMES - x) * MODIFIER, (TIMES - x) * MODIFIER);
        }

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(SIZE, SIZE, (TIMES - x) * MODIFIER, x * MODIFIER);
        }

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(0, SIZE, x * MODIFIER, x * MODIFIER);
        }

        final int FONT_SIZE = 72;
        final String TEXT = "Cuadradito chido";

        g.setFont(new Font("Comic Sans MS", Font.PLAIN, FONT_SIZE));
        g.drawString(TEXT, 0, SIZE + FONT_SIZE);
    }
}
