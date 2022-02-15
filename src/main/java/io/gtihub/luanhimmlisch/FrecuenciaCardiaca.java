package io.gtihub.luanhimmlisch;

/**
 * Determina la frecuencia cardiaca de un usuario
 * <p>
 * 15/02/2022 09:20
 * </p>
 * 
 * @author Luis Ángel Serrano Catalá
 * @see https://github.com/LuanHimmlisch/unach-oop-java
 */
public class FrecuenciaCardiaca {
    private int age;
    private String name;
    private String lastname;
    private int max = 0;
    // private int year;
    // private int month;
    // private int day;

    FrecuenciaCardiaca(int age, String name, String lastname) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
        // this.year = year;
        // this.month = month;
        // this.day = day;
    }

    public String getName() {
        return this.name + " " + this.lastname;
    }

    public int getMax() {
        if (this.max == 0) {
            this.max = 220 - this.age;
        }

        return this.max;
    }

    public float[] getRange() {
        return new float[] {
                this.max * 0.5f,
                this.max * 0.8f
        };
    }
}
