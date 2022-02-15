package io.gtihub.luanhimmlisch;

/**
 * Clase para ver cómo funcionan los setters y getters
 * <p>
 * 09/02/2022 09:30
 * </p>
 * 
 * @author Luis Ángel Serrano Catalá
 * @see https://github.com/LuanHimmlisch/unach-oop-java
 */
public class Cuenta {
    private String name;
    private double saldo;

    public Cuenta(String name, double saldo) {
        this.name = name;

        if (saldo > 0.0)
            this.saldo = saldo;
    }

    public void deposit(double ammount) {
        if (ammount > 0.0)
            saldo = saldo + ammount;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}