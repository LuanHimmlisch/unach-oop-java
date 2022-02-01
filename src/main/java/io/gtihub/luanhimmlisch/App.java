package io.gtihub.luanhimmlisch;

import java.util.Scanner;

/**
 * Clase principal
 * <p>01/02/2022 09:36</p>
 * @author Luis Ángel Serrano Catalá
 */
public class App 
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        final String WENAS = "Buen día señores.\n\nEl día de hoy vamos a hablar de saltos de línea, estos se pueden lograr con '\\n'.\n\nFin...\n\n\n";
        System.out.println(WENAS);
        
        Suma();
    }
    
    static void Suma(){
        Suma suma = new Suma();
    
        System.out.println("Inserta número uno:");
        suma.setNumOne(scanner.nextFloat());
    
        System.out.println("Inserta número dos:");
        suma.setNumTwo(scanner.nextFloat());
    
        suma.setSum();
        System.out.println(suma.getSum());
    }
}
