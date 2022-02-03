package io.gtihub.luanhimmlisch;

import java.util.Scanner;

/**
 * Clase multiplica tres números
 * <p>03/02/2022 10:20</p>
 * @author Luis Ángel Serrano Catalá
 */
public class Multiplicacion {
    private static Scanner scanner = new Scanner(System.in);
    private int num_1;
    private int num_2;
    private int num_3;
    private int resultado;

    Multiplicacion(){
        System.out.println("Inserte número 1");
        num_1 = scanner.nextInt();

        System.out.println("Inserte número 2");
        num_2 = scanner.nextInt();

        System.out.println("Inserte número 3");
        num_3 = scanner.nextInt();

        resultado = num_1 * num_2 * num_3;

        System.out.println("Resultado: "  + resultado);
    }
}
