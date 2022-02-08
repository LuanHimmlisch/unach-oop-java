package io.gtihub.luanhimmlisch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Muestra figuras ascii
 * <p>
 * 04/02/2022 18:40
 * </p>
 * 
 * @author Luis Ángel Serrano Catalá
 * @see https://github.com/LuanHimmlisch/unach-oop-java
 */
public class Figuras {
    static final Scanner SCANNER = new Scanner(System.in);

    Figuras() {
        Integer figure = 5, length = 0;

        do {
            App.clearTerminal();
            App.println("Elige la figura a imprimir:\n\n1. Cuadrado\n2. Circulo\n3. Flecha\n4. Diamante\n5. Salir");
            figure = SCANNER.nextInt();

            if (figure < 5) {
                App.println("Inserta tamaño:");
                length = SCANNER.nextInt();
            }

            App.clearTerminal();

            switch (figure) {
                case 1:
                    rectangle(length, length);
                    break;
                case 2:
                    circle(length);
                    break;
                case 3:
                    arrow(length);
                    break;
                case 4:
                    diamond(length);
                    break;
            }

            if (figure < 5)
                App.wait(2000);

        } while (figure != 5);

        App.println("I'll be back...");
    }

    private static final void rectangle(int width, int height) {
        String rectangle = "";

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {

                if (y == 0 || x == 0 || (y + 1) == height || (x + 1) == width)
                    rectangle += '*';
                else
                    rectangle += ' ';

                rectangle += (y + 1) == height ? "\n" : "";
            }
        }

        App.print(rectangle);
    }

    private static final void circle(int radius) {
        final int diametro = radius * 2 + 1;

        char[][] chars = new char[diametro][diametro];

        Arrays.stream(chars).forEach(a -> Arrays.fill(a, ' '));

        for (int i = 0; i < 36; i++) {
            final float angle = (float) Math.toRadians(i * 10);

            final float[] points = circleToPoint(new float[] { radius, radius }, radius, angle);
            final int pointX = Math.round(points[0]);
            final int pointY = Math.round(points[1]);

            chars[pointX][pointY] = '*';
        }

        for (int x = 0; x < chars.length; x++) {
            for (int y = 0; y < chars[x].length; y++) {
                App.print(chars[x][y] + " ");
            }
            App.println();
        }
    }

    private static final void arrow(int length) {
        String arrow = "";

        arrow += "   *\n";
        arrow += "  ***\n";
        arrow += " *****\n";

        for (int i = 0; i < length; i++) {
            arrow += "   *\n";
        }

        App.print(arrow);
    }

    private static final void diamond(int magnitude) {
        String diamond = "";
        final int length = magnitude * 2 - 1;

        for (int i = 0; i < length; i++) {

            // Outer spaces
            int spaces = Math.abs(magnitude - (i + 1));
            char[] chars = new char[spaces];
            Arrays.fill(chars, ' ');

            diamond += new String(chars);

            // Inner spaces
            spaces = Math.abs((magnitude - spaces) * 2 - 3);
            chars = new char[spaces];
            Arrays.fill(chars, ' ');

            diamond += (i == 0 || i + 1 == length) ? "*\n" : "*" + (new String(chars)) + "*\n";

        }

        App.print(diamond);
    }

    private static final float[] circleToPoint(float[] center, float radius, float angle) {
        double x = center[0] + radius * Math.cos(angle);
        double y = center[1] + radius * Math.sin(angle);

        return new float[] { (float) x, (float) y };
    }

}
