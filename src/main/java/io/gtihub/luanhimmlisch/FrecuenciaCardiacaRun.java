package io.gtihub.luanhimmlisch;

public class FrecuenciaCardiacaRun {
    FrecuenciaCardiacaRun() {
        FrecuenciaCardiaca frecuenciaCardiaca = new FrecuenciaCardiaca(Integer.parseInt(App.input("Inserta edad: ")),
                App.input("Inserta nombre: "), App.input("Inserta apellido: "));

        int frecuenciaMax = frecuenciaCardiaca.getMax();
        float[] frecuencias = frecuenciaCardiaca.getRange();
        float frecuenciaAverage = (frecuencias[0] + frecuencias[1]) / 2;

        App.clearTerminal();
        App.println("|=== Usuario " + frecuenciaCardiaca.getName() + " ===|");

        App.println("Frecuencia máxima: " + frecuenciaMax);
        App.println("Frecuencia promedio: " + frecuenciaAverage);
        App.println("Rango de frecuencias: " + frecuencias[0] + " - " + frecuencias[1]);
    }
}
