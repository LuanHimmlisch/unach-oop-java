# Excepciones

Luis Ángel Serrano Catalá | Prof. Ricardo Vegas Morales

Programación Orientada a Objetos, Unidad 5.

LIDTS 2°P, Universidad Autónoma de Chiapas.

--- 

## ¿Qué son las excepciones?

La ejecución de excepciones nos sirve para marcar procesos anomalos (excepcionales) que no tuvieron que haber pasado en el código. Java incluye un conjunto de excepciones que se ejecutan y podemos ejecutar y extender para mayor personalización.

### Tipos de excepciones

| Tipo | Descripción |
|------|-------------|
|FileNotFoundException|Lanza una excepción cuando el fichero no se encuentra.|
|ClassNotFoundException|Lanza una excepción cuando el fichero no se encuentra.|
|EOFException|Lanza una excepción cuando llega al final del fichero.|
|ArrayIndexOutOfBoundsException|Lanza una excepción cuando se accede a una posición de un array que no exista.|
|NumberFormatException|Lanza una excepción cuando se procesa un numero pero este es un dato alfanumérico.|
|NullPointerException|Lanza una excepción cuando intentando acceder a un miembro de un objeto para el que todavía no hemos reservado memoria.|
|IOException|Generaliza muchas excepciones anteriores. La ventaja es que no necesitamos controlar cada una de las excepciones.|
|Exception|Es la clase padre de IOException y de otras clases. Tiene la misma ventaja que IOException.|