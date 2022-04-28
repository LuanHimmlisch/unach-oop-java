# Interfaces

Luis Ángel Serrano Catalá | Prof. Ricardo Vegas Morales

Programación Orientada a Objetos, Unidad 4.

LIDTS 2°P, Universidad Autónoma de Chiapas.

---

## Definición

El concepto de "Interfaz de usuario" se refiere a los mecanismos para construir ventanas, botones, menus, etc que permiten crear una interfaz amigable para nuestros programas y no al concepto de "interface" que existe en Java y que se refiere a una especie de clase abstracta pura.

Los mecanismos para crear "interfaces de usuario" en Java están pensados para favorecer la creación de la lógica de negocio separada de la creación de la interfaz de usuario.

## Ejemplo

```java

public class PanelDibujo extends JPanel
{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        final int TIMES = 15;
        final int MODIFIER = 20;
        final int SIZE = TIMES * MODIFIER;

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(0, 0, x * MODIFIER, (TIMES - x) * MODIFIER);
        }

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(SIZE, 0, (TIMES - x) * MODIFIER, (TIMES - x) * MODIFIER);
        }

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(SIZE, SIZE, (TIMES - x) * MODIFIER, x * MODIFIER);
        }

        for (int x = 0; x < TIMES; x++) {
            g.drawLine(0, SIZE, x * MODIFIER, x * MODIFIER);
        }

        final int FONT_SIZE = 32;
        final String TEXT = "Cuadradito gang";

        g.setFont(new Font("Comic Sans MS", Font.PLAIN, FONT_SIZE));
        g.drawString(TEXT, 0, SIZE + FONT_SIZE);
    }
}


```

## Herencia

En la primera línea simplemente importamos el paquete donde está definida la clase JFrame. Un JFrame es la clase que representa al tipo "Ventana". En otras palabras un "JFrame" es una ventana del sistema operativo. Como nuestra clase hereda (extienda) a la clase PanelDibujo, Trigo será por lo tanto también un JFrame es decir una ventana.

El método "paintComponent" es uno heredado de JFrame, que se encarga de dibujar cosas en la pantalla cuando es llamado. Sobreescribimos su funcionamiento para dibujar lo que nosotros queramos.