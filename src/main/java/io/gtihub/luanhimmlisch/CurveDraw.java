package io.gtihub.luanhimmlisch;

import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JPanel;

/**
 * Dibujar una curvita
 * <p>
 * 08/03/2022 09:10
 * </p>
 * 
 * @author Luis Ángel Serrano Catalá
 */
public class CurveDraw extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        final int TIMES = 20;
        final int MODIFIER = 15;
        final int SIZE = TIMES * MODIFIER;

        for (int x = 0; x < TIMES; x++) {
            g.drawLine((TIMES - x) * MODIFIER, 0, 0, x * MODIFIER);
        }

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(x * MODIFIER, SIZE, SIZE, (TIMES - x) * MODIFIER);
        }

        for (int x = 0; x < TIMES; x++) {
            g.drawLine((TIMES - x) * MODIFIER, SIZE, 0, SIZE - x * MODIFIER);
        }

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(x * MODIFIER, 0, SIZE, SIZE - (TIMES - x) * MODIFIER);
        }

        final int FONT_SIZE = 32;
        final String TEXT = "Curvita gang";

        g.setFont(new Font("Comic Sans MS", Font.PLAIN, FONT_SIZE));
        g.drawString(TEXT, 0, SIZE + FONT_SIZE);
    }
}
