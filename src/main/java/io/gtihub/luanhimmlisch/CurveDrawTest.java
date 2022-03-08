package io.gtihub.luanhimmlisch;

import javax.swing.JFrame;

public class CurveDrawTest {
    public static void main(String[] args) {
        CurveDraw panel = new CurveDraw();
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        frame.setSize(768, 768);
        frame.setVisible(true);
    }
}
