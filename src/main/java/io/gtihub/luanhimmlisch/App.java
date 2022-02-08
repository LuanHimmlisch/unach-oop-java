package io.gtihub.luanhimmlisch;

import java.util.Scanner;

/**
 * Clase principal
 * <p>
 * 01/02/2022 09:36
 * </p>
 * 
 * @author Luis Ángel Serrano Catalá
 * @see https://github.com/LuanHimmlisch/unach-oop-java
 */
public class App {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // new Suma();
        // new Comparaciones();
        // new Multiplicacion();

        new Figuras();
        new HelloWorldTwoPointO();
    }

    public static final void clearTerminal() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static final void println(String string) {
        System.out.println(string + "\n\n");
    }

    public static final void println() {
        System.out.println();
    }

    public static final void print(String string) {
        System.out.print(string);
    }

    public static final void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static final String input(String string) {
        App.println(string);
        String num = SCANNER.nextLine();
        App.println();

        return num;
    }
}
