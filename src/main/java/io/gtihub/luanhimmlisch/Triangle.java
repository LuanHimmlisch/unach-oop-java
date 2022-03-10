package io.gtihub.luanhimmlisch;

public class Triangle {
    public static void main(String[] args) {
        final int TIMES = 10;

        System.out.println("\n\n(a)\n");

        for (int i = 0; i < TIMES; i++) {
            drawChars('*', i);
        }

        System.out.println("\n\n(b)\n");

        for (int i = TIMES; i > 0; i--) {
            drawChars('*', i);
        }

        System.out.println("\n\n(c)\n");

        for (int i = TIMES; i > 0; i--) {
            drawChars('*', i, TIMES - i);
        }

        System.out.println("\n\n(d)\n");

        for (int i = 0; i < TIMES; i++) {
            drawChars('*', i, TIMES - i);
        }

    }

    private static String repeatChars(char character, int times) {
        String string = "";
        for (int i = 0; i < times; i++) {
            string += character;
        }
        return string;
    }

    public static void drawChars(char character, int times) {
        String string = repeatChars(character, times);
        System.out.println(string);
    }

    public static void drawChars(char character, int times, int padding) {
        String string = "";

        for (int i = 0; i < padding; i++) {
            string += " ";
        }

        string += repeatChars(character, times);
        System.out.println(string);
    }
}
