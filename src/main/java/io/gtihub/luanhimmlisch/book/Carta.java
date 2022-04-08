package io.gtihub.luanhimmlisch.book;

public class Carta {
    private final String cara; // cara de la carta ("As", "Dos", ...)
    private final String palo; // palo de la carta ("Corazones", "Diamantes", ...)
    // el constructor de dos argumentos inicializa la cara y el palo de la carta

    public Carta(String caraCarta, String paloCarta) {
        this.cara = caraCarta; // inicializa la cara de la carta
        this.palo = paloCarta; // inicializa el palo de la carta
    }

    // devuelve representación String de Carta
    public String toString() {
        return cara + " de " + palo;
    }
} // fin de la clase Carta