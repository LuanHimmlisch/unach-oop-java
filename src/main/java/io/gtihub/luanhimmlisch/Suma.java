package io.gtihub.luanhimmlisch;

import java.util.Scanner;

/**
 * Clase innecesariamente abstracta para sumas por los loles
 * <p>01/02/2022 10:15</p>
 * @author Luis Ángel Serrano Catalá
 */
public class Suma {
    Scanner scanner = new Scanner(System.in);
    private float num_one = 0f;
    private float num_two = 0f;
    private float sum = 0f;

    Suma() {}

    public void setNumOne(float num_one){
        this.num_one = num_one;
    }

    public void setNumTwo(float num_two){
        this.num_two = num_two;
    }

    public void setSum() {
        this.sum = num_one + num_two;
    }

    public float getSum(){
        return this.sum;
    }
}
