# TDD-katas-Java
TDD Katas written in Java

## Why katas?

*Kata* is a Japanese word meaning “form”, and in the martial arts it describes a choreographed pattern of movements used to train yourself to the level of muscle memory.

It has become an important step for newcomers and introduce themselves into the TDD culture, the nature is to practice this skills and keep focused on working with test first.

An important step is that all the katas should be worked incrementally, try to avoid reading all the requirements and work on all one by one.

## Calculadora de cadenas para JAVA
La esencia de este taller consiste en un método que dada una cadena delimitada, devuelve la suma de los valores. Estas son las reglas que debe seguir.

* Una cadena vacía devuelve cero
* Un solo número devuelve el valor
* Dos números, delimitados por comas, devuelven la suma
* Dos números, delimitados por saltos de línea, devuelve la suma
* Tres números, delimitados de cualquier manera, devuelven la suma
* Los números negativos arrojan una excepción
* Los números superiores a 1000 se ignoran
* Se puede definir un solo delimitador de caracteres en la primera línea (p. Ej., // # para un "#" como delimitador)

### Los que faltaban para completar este taller

* Se puede definir un delimitador de varios caracteres en la primera línea (p. Ej., // [###] para "###" como delimitador)
* Se pueden definir muchos delimitadores de uno o varios caracteres (cada uno entre corchetes)

### Captura de funcionamiento

![Funcionamiento](https://github.com/mdyagual/TDD-katas-Java/blob/master/ss/Captura%20de%20funcionamiento%20de%20los%2010%20casos%20de%20prueba.JPG)

## Comentarios adicionales

* Se actualizó la versión de Gradle a la 5.0 para que sea compatible con Java 11
* Se actualizó la librería de Junit a la 5.6.2 para descartar la versión 4.12 donde no se podían usar etiquetas vistas en la versión 5.6.2
* Se agregó código nuevo para el funcionamiento de los últimos dos casos dentro de la misma función add() que posee la clase StringCalculator

Completado con mucho entusiasmo por mdyagual para Sofka U(◕‿◕✿)
