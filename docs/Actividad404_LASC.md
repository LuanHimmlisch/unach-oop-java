# Reutilización de código

Luis Ángel Serrano Catalá | Prof. Ricardo Vegas Morales

Programación Orientada a Objetos, Unidad 4.

LIDTS 2°P, Universidad Autónoma de Chiapas.

--- 

## ¿Qué es?

Uno de los principios más fundamentales de la programación es DRY (*Don't Repeat Yourself*) "No te repitas".

Tu código debe ser tanto eficiente como entendible y gracias a este mantra podemos hacer los dos además de ahorrarnos mucho tiempo.

La "abstracción" juega un papel importante en esto. Abstraer algo es el quitar complicación y naturalmente esto lleva a crear código reutilizable, pues fraccionamos en pequeños sistemas nuestro código.

Y por suerte todos los lenguajes de programación nos dan herramientas de abstracción.

### Variables

El hecho que podamos guardar datos bajo un alias nos ahorra repetirnos en cada línea sobre un dato en especifico, pues podemos hacer referencia a un único punto de memoria donde el dato está guardado y cambiarlo en cualquier momento desde ese único punto.

### Funciones

Además de ahorrarnos escrbir los números de PI una y otra vez también podemos ahorrarnos el tener que hacer los mismos procedimientos u ecuaciones una y otra vez. Potencialmente ahorrandonos cientas de líneas.

### Classes

Si las variables nos evitan repetir datos y las funciones repetir procedimientos las clases nos ahorran el tener que repetir variables y funciones. Y con el polimorfismo podemos modificar únicamente lo que hace falta basado en una clase padre en vez de copiar y pegar todo de nuevo.