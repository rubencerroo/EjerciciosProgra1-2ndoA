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
4. [Diagrama UML](#diagrama-uml)

## Estructura del Proyecto

El proyecto se organiza en tres paquetes principales:

- **dominio:** Contiene las clases `Habitante` y `OficinaPadron` y `Comprobacion`, que modelan a los habitantes y gestionan el padrón.
- **interfaz:** Contiene la clase `InterfazUsuario`, que proporciona una interfaz de texto para interactuar con la aplicación.
- **aplicacion:** Contiene la clase `Principal`, que actúa como punto de entrada para ejecutar la aplicación.

## Cómo Funciona

### [Clase Habitante](Padron/src/dominio/Habitante.java)

La clase `Habitante` representa a un habitante con tres atributos: `nombre`, `apellido1`, y `apellido2`. Los atributos son privados para mantener la encapsulación, y se proporcionan métodos públicos para establecer y obtener los valores de estos atributos.

### [Clase OficinaPadron](Padron/src/dominio/OficinaPadron.java)

La clase `OficinaPadron` encapsula un ArrayList de habitantes y proporciona métodos para añadir, obtener y calcular el número de habitantes en el padrón. También se incluye la funcionalidad para cargar los datos desde un archivo DAT serializado y volcar los datos al mismo archivo.

### [Clase InterfazUsuario](Padron/src/Interfaz/InterfazUsuario.java)

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

4. Para iniciar el programa, utiliza el siguiente comando:
   ```console
   java -cp bin aplicacion.Principal
   ```
## Diagrama UML
![PadronUML](https://github.com/rubencerroo/EjerciciosProgra1-2ndoA/assets/119308526/55aea918-c877-4db1-a6fc-fb43b7ca7160)


## [Ejercicio 21](Ejercicio21/)

Este proyecto de Java se centra en la gestión de localidades, municipios y provincias, utilizando colecciones de objetos. El proyecto está organizado en paquetes y consta de varias clases que interactúan entre sí.

## Contenido

1. [Estructura del Proyecto](#estructura-del-proyecto-21)
2. [Cómo Funciona](#cómo-funciona-21)
3. [Instrucciones de Ejecución](#instrucciones-de-ejecución-21)
4. [Diagrama UML](#diagrama-uml-21)

## Estructura del Proyecto 21

El proyecto se divide en dos paquetes principales:

- **`aplicacion`:** Este paquete contiene la clase `Principal`, que sirve como punto de entrada del programa. Aquí se crea una instancia de `Localidad` y se realizan operaciones iniciales.

- **`dominio`:** En este paquete se encuentran las clases que representan los conceptos de dominio del proyecto, es decir, `Localidad`, `Municipio` y `Provincia`. Cada una de estas clases tiene atributos y métodos que permiten gestionar la información de las localidades, municipios y provincias.

## Funcionamiento del Proyecto 21

El proyecto se inicia desde la clase `Principal`. A continuación, se describe cómo funciona:

1. **Creación de una Localidad**: Se crea una instancia de la clase `Localidad` en la clase `Principal`. Esta localidad tiene un nombre y un número de habitantes que se establecen mediante los métodos `setNombre` y `setNumeroDeHabitantes`. Luego, se muestra la localidad por pantalla utilizando el método `toString`.

2. **Municipio y Provincia**: Las clases `Municipio` y `Provincia` se utilizan como agregaciones para gestionar múltiples localidades, municipios y provincias. Los municipios pueden contener una o más localidades, y las provincias pueden contener uno o más municipios. Se pueden agregar localidades a un municipio y municipios a una provincia mediante los métodos correspondientes, como `agregarLocalidad` y `agregarMunicipio`.

3. **Conteo de Habitantes**: Tanto en la clase `Municipio` como en la clase `Provincia`, se han implementado métodos para contar el número total de habitantes. En la clase `Municipio`, el método `contarHabitantes` suma los habitantes de todas las localidades que pertenecen al municipio. En la clase `Provincia`, el método `contarHabitantes` suma los habitantes de todos los municipios que pertenecen a la provincia.

4. **Representación de Datos**: Se han reescrito los métodos `toString` en las clases `Localidad`, `Municipio` y `Provincia` para proporcionar representaciones legibles por humanos de estos objetos. Esto facilita la visualización de la información por pantalla.

## Instrucciones de Ejecución 21

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

4. Para iniciar el programa, utiliza el siguiente comando:
   ```console
   java -cp bin .\aplicacion\Principal.java
   ```

## Diagrama UML 21
![Ejercicio21UML](https://github.com/rubencerroo/EjerciciosProgra1-2ndoA/assets/119308526/ad90643c-7fad-4dc0-825a-c93936f39b1b)


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
