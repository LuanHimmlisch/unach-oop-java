package io.gtihub.luanhimmlisch;

import java.util.Scanner; // el programa utiliza la clase Scanner

/**
 * Clase que imprime los casos válidos
 * <p>03/02/2022 10:00</p>
 * @author Ricardo Vegas Morales 
 * @author Luis Ángel Serrano Catalá
 */
public class Comparaciones {
    
    Comparaciones() 
    {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1; // primer número a comparar
        int numero2; // segundo número a comparar

        System.out.println("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario
        
        System.out.println("Escriba el segundo entero: "); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario

        if (numero1 == numero2)
            System.out.printf("%d == %d%n", numero1, numero2);

        if (numero1 != numero2)
            System.out.printf("%d != %d%n", numero1, numero2);

        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);
        
        if (numero1 > numero2)
            System.out.printf("%d > %d%n", numero1, numero2);

        if (numero1 <= numero2)
            System.out.printf("%d <= %d%n", numero1, numero2);

        if (numero1 >= numero2)
            System.out.printf("%d >= %d%n", numero1, numero2);
    }
    
}