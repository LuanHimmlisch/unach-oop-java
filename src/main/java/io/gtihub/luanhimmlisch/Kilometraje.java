package io.gtihub.luanhimmlisch;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para registrar viajes y calcular el uso de litros por kilometro
 * <p>
 * 17/03/2022 10:30
 * </p>
 * 
 * @author Luis Ángel Serrano Catalá
 * @see https://github.com/LuanHimmlisch/unach-oop-java
 */
public class Kilometraje {
    public static void main(String[] args) {
        int option = 0;
        List<Float> kilometers = new ArrayList<Float>();
        List<Float> gas = new ArrayList<Float>();

        do {
            option = Integer.parseInt(
                    App.input("1. Registrar viajes\n2. Mostrar total\n3. Borrar datos\n0. Salir del programa\n\n"));

            switch (option) {
                case 1:
                    final int SIZE = Integer.parseInt(App.input("¿Cuántos viajes desear introducir? "));
                    int total_index = kilometers.size();

                    for (int i = 0; i < SIZE; i++) {
                        total_index++;
                        kilometers.add(
                                Float.parseFloat(App.input("Insertar kilometros de viaje #" + total_index + " : ")));
                        gas.add(Float
                                .parseFloat(
                                        App.input("Insertar gasolina utilizada de viaje #" + total_index
                                                + " : ")));
                    }

                    break;
                case 2:
                    float total_kilometers = 0;
                    float total_gas = 0;

                    for (int i = 0; i < kilometers.size(); i++) {
                        final float KILOMETER = kilometers.get(i);
                        final float GAS = gas.get(i);

                        total_kilometers += KILOMETER;
                        total_gas += GAS;

                        App.println("=== VIAJE #" + (i + 1) + "===\nKilometros: " + KILOMETER + "\nGasolina: " + GAS
                                + "\nKilometros por litro: " + (KILOMETER / GAS));
                    }

                    App.println("=== TOTAL ===" + "\nKilometros: " + total_kilometers + "\nGasolina: " + total_gas
                            + "\nKilometros por litro: " + (total_kilometers / total_gas));

                    break;
                case 3:
                    if (!App.input("¿Seguro quieres borrar todos los datos? (s/n) ").equals("s")) {
                        App.println("Eliminación de datos cancelado");
                        break;
                    }

                    kilometers.clear();
                    gas.clear();

                    App.println("Datos eliminados exitosamente");

                    break;
                case 0:
                    App.println("Saliendo del programa");
                    break;

                default:
                    App.println("Selecciona una opción valida");
                    break;
            }

        } while (option != 0);
    }
}
