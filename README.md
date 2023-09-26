# EjerciciosProgra1-2ndoA

**Ejercicios Programacion I** 

## [Ejercicio 1](Ejercicio1/)

- **Escribir un programa en Java que dados dos números los almacene en sendas variables y muestre:**
    - Su suma
    - Su producto
    - El resultado de comparar si el primero es mayor que el segundo
    - El resultado de comparar si son iguales
    - El resultado de evaluar si son pares
    - El resultado de evaluar si son divisibles
    - Si el valor del primero está comprendido en el intervalo [1,10]
    - Si ambos lo están
    - Incrementa el primero con el valor del segundo y muestra el valor obtenido

## [Ejercicio 2](Ejercicio2/)

- **Escribir un programa en Java que dados tres números determine:**
    - Si pueden ser las longitudes de los lados de un triángulo
    - En caso de ser así, qué tipo de triángulo es (equilátero, isósceles o escaleno)

## [Ejercicio 3](Ejercicio3/)

- **El término n de la serie de Fibonacci se define:**
    - ![image](https://github.com/rubencerroo/EjerciciosProgra1-2ndoA/assets/119308526/c2bcca5d-061d-419a-9f8c-52eb73c97714)

    - Calcular la sucesión de términos de 0 a un n dado

## [Ejercicio 4](Ejercicio4/)

- **Escribir fragmento de código en Java que dada la altura de un triángulo lo dibuje con * de la forma:**
    - 1: ![image](https://github.com/rubencerroo/EjerciciosProgra1-2ndoA/assets/119308526/cf262e78-abc8-4304-ad39-ea6a49353d54)
    - 2: ![image](https://github.com/rubencerroo/EjerciciosProgra1-2ndoA/assets/119308526/d33d4316-123d-471e-b980-a22165e16dbe)
    - 3: ![image](https://github.com/rubencerroo/EjerciciosProgra1-2ndoA/assets/119308526/f4c30479-f590-424b-8767-defce9d27e45)
    - 4: ![image](https://github.com/rubencerroo/EjerciciosProgra1-2ndoA/assets/119308526/53442dc8-5ab5-4677-8a10-398ab4159f79)

## [Ejercicio 5](Ejercicio5/)

- **Multiplicación Rusa**

    - Dados n y m
    - Dividir repetidamente n entre 2 y multiplicar m por 2
    - Sumar las columnas de productos correspondientes a valores impares de la columna de divisiones
    - Repetir hasta que la división sea 0. La suma es el producto de n y m

## [Ejercicio 6](Ejercicio6/)

- **Calcular el mayor término de la sucesión de Fibonacci menor que un valor dado. Indicar cuál es su orden en la serie.**

## [Ejercicio 7](Ejercicio7/)

- **Calcular el mayor número cuyo factorial es menor que un valor dado.**

## [Padron De Habitantes](Padron/)

Este proyecto Java se enfoca en la gestión de un padrón de habitantes utilizando clases y objetos. A lo largo de varios ejercicios, hemos desarrollado una aplicación que permite crear, listar y almacenar habitantes en un archivo CSV.

## Contenido

1. [Estructura del Proyecto](#estructura-del-proyecto)
2. [Cómo Funciona](#cómo-funciona)
3. [Instrucciones de Ejecución](#instrucciones-de-ejecución)

## Estructura del Proyecto

El proyecto se organiza en tres paquetes principales:

- **dominio:** Contiene las clases `Habitante` y `OficinaPadron` y `Comprobacion`, que modelan a los habitantes y gestionan el padrón.
- **interfaz:** Contiene la clase `InterfazUsuario`, que proporciona una interfaz de texto para interactuar con la aplicación.
- **aplicacion:** Contiene la clase `Principal`, que actúa como punto de entrada para ejecutar la aplicación.

## Cómo Funciona

### Clase Habitante

La clase `Habitante` representa a un habitante con tres atributos: `nombre`, `apellido1`, y `apellido2`. Los atributos son privados para mantener la encapsulación, y se proporcionan métodos públicos para establecer y obtener los valores de estos atributos.

### Clase OficinaPadron

La clase `OficinaPadron` encapsula un ArrayList de habitantes y proporciona métodos para añadir, obtener y calcular el número de habitantes en el padrón. También se incluye la funcionalidad para cargar los datos desde un archivo CSV y volcar los datos al mismo archivo.

### Clase InterfazUsuario

La clase `InterfazUsuario` ofrece una interfaz de texto simple para interactuar con el padrón de habitantes. Permite mostrar la lista de habitantes y añadir nuevos habitantes.

## Instrucciones de Ejecución

Para ejecutar la aplicación desde la línea de comandos en Linux, sigue estos pasos:

1. Sitúate en el directorio raíz del proyecto.

2. Crea un directorio `bin` si aún no existe:
   ```console
   mkdir bin
   ```

3. Compila el proyecto utilizando el siguiente comando (asegúrate de que estás en el directorio raíz del proyecto):
   ```console
   find . -name *.java | xargs javac -cp bin -d bin
   ```

4. Para mostrar la lista de habitantes, utiliza el siguiente comando:
   ```console
   java -cp bin aplicacion.Principal mostrar
   ```

6. Para añadir un habitante nuevo, utiliza el siguiente comando (reemplaza los valores con los datos del habitante):
    ```console
    java -cp bin aplicacion.Principal anadir Nombre Apellido1 Apellido2
    ```
7. Para mostrar la lista actualizada de habitantes después de añadir uno nuevo, ejecuta nuevamente el comando del paso 4.

## ¡Listo! Ahora puedes gestionar el padrón de habitantes de forma sencilla utilizando esta aplicación.

---

## [MIT License](LICENSE)

**Copyright (c) 2023 rubencerroo**

**Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:**

**The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.**

**THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.**
