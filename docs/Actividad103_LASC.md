# Conceptos de POO

Luis Ángel Serrano Catalá

Prof. Ricardo Vegas Morales

Programación Orientada a Objetos, Unidad 1.

LIDTS 2°P, Universidad Autónoma de Chiapas.

**Tabla de contenidos:**

- [Conceptos de POO](#conceptos-de-poo)
  - [Creación de programa](#creación-de-programa)
  - [Ejecución de programa](#ejecución-de-programa)
  - [Java Hotspot](#java-hotspot)
  - [Painter](#painter)

---

## Creación de programa

Para crear un programa de Java necesitarás una clase normalmente llamada **App** o **Main** con una función `main` que actuará como punto de entrada, será lo primero que se ejecutará en nuestro programa.

Los IDEs nos ayudan a crear plantillas para no tener que crear una estructura de archivos desde cero o configurar repositorios de librerías.

En mi caso estoy usando [Visual Studio Code](https://github.com/Microsoft/VSCode), un editor de texto hecho para programadores que es altamente configurable.

Para empezar, necesitaremos el intellisense de Java y para esto hay una extensión [junto con varias más](https://github.com/Microsoft/vscode-java-pack) hechas por Microsoft para facilitar el desarrollo en este lenguaje.

![](2022-02-01-22-34-02.png)

Después, abrimos la carpeta donde queremos inicializar el proyecto y con la paleta de comandos (CTRL + Shift + P) ejecutamos la creación.

![](2022-02-01-22-37-10.png)

Nos aseguramos de elegir el manejador de proyecto de nuestra elección, en este caso Maven, y la plantilla con la que queremos partir.

![](2022-02-01-22-45-38.png)

## Ejecución de programa

Para ejecutar un programa debemos compilar los archivos `.java` y ejecutarlos con el comando `java ClassName`. VSCode nos ahorra el proceso pues podemos hacer esto con un simple F5.

![](2022-02-01-22-50-14.png)

## Java Hotspot

Ahora que creamos y ejecutamos un programa debemos hablar de _cómo_ funciona la ejecución en si.

Java Hotspot es la máquina virtual propietaria de Oracle que nos permite correr ejecutables de Java en todos los sistemas.

Debemos pensar que los lenguajes de programación se deben compilar a lenguaje máquina, pero dependiendo el sistema operativo (OS) el código compilado variará pues cada OS tiene sus propias funciones y estructura. Entonces llega Java, un lenguaje que en vez de correr en un sistema operativo corre dentro de otro programa llamado una máquina virtual que _interpreta_ el programa de Java al lenguaje del OS y este a su vez a lenguaje máquina. Podemos pensarlo como un sistema operativo que corre en sistemas operativos, una capa de abstracción más que alenta los programas pero nos ofrece una gran compatibilidad con diversos dispositivos.

## Painter

Mi dibujo original de Creeper. El otro hecho por mi compañera fue una copia y pienso continuar con acción legal.

![](2022-02-01-23-51-03.png)
