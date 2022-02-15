package io.gtihub.luanhimmlisch;

/**
 * Prueba de setters y getters
 * <p>
 * 09/02/2022 09:30
 * </p>
 * 
 * @author Luis Ángel Serrano Catalá
 * @see https://github.com/LuanHimmlisch/unach-oop-java
 */
public class PruebaCuenta {
    PruebaCuenta() {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.getName(), cuenta1.getSaldo());

        System.out.printf("Saldo de %s: $%.2f%n%n",
                cuenta2.getName(), cuenta2.getSaldo());

        double montoDeposito = Float.parseFloat(App.input("Escriba el monto a depositar para cuenta1: "));

        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
                montoDeposito);
        cuenta1.deposit(montoDeposito);

        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.getName(), cuenta1.getSaldo());

        System.out.printf("Saldo de %s: $%.2f%n%n",
                cuenta2.getName(), cuenta2.getSaldo());

        montoDeposito = Float.parseFloat(App.input("Escriba el monto a depositar para cuenta2: "));

        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
                montoDeposito);
        cuenta2.deposit(montoDeposito);

        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.getName(), cuenta1.getSaldo());

        System.out.printf("Saldo de %s: $%.2f%n%n",
                cuenta2.getName(), cuenta2.getSaldo());
    }
}
