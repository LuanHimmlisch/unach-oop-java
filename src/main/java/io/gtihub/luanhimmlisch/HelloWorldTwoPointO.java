package io.gtihub.luanhimmlisch;

/**
 * Clase con actividades relacionadas al operador módulo
 * <p>
 * 08/02/2022 11:00
 * </p>
 * 
 * @author Luis Ángel Serrano Catalá
 * @see https://github.com/LuanHimmlisch/unach-oop-java
 */
public class HelloWorldTwoPointO {
    HelloWorldTwoPointO() {

        // Escriba una aplicación que lea un entero y que determine e imprima si es
        // impar o par
        int num = Integer.parseInt(App.input("Inserte un número para comprobar si es par o impar"));
        String msg = num % 2 == 0 ? "El número es par" : "El número NO es par";
        App.println(msg);

        App.wait(1000);

        // Escriba una aplicación que lea dos enteros, determine si el primero es un
        // múltiplo del segundo e imprima el resultado.
        int num_one = Integer.parseInt(App.input("Inserte el número uno"));
        int num_two = Integer.parseInt(App.input("Inserte el número dos"));

        msg = num_one % num_two == 0 ? "El número uno es múltipo del dos" : "El número uno NO es múltipo del dos";
        App.println(msg);
    }
}
