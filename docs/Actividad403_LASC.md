# Variables polimórficas

Luis Ángel Serrano Catalá | Prof. Ricardo Vegas Morales

Programación Orientada a Objetos, Unidad 4.

LIDTS 2°P, Universidad Autónoma de Chiapas.

---

## Definición

Son aquellas variables que pueden tomar distintas formas, que pueden contener muchos otros tipos de datos.

## Usos y aplicaciones

El polimorfismo en general nos sirve para abstraer el procesamiento de datos a una sola interfaz y hacer nuestro código más claro, robusto y fácil de comprender.


### Ejemplo

```java
// Main.java
for (Elemento elemento : elementos){
    console.log(elemento.unTipo);
    console.log(elemento.otroTipo);
}

// Elemento.java
class Elemento () {
    public int unTipo = 20;
    public String otroTipo = "ostias soy una cadena!";
}
```