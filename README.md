Tarea 10 TÉCNICAS DE COMUNICACIÓN
Link a mi repositorio: 

Realizado por: Pedro Alonso Tapia Lobo

Ejercicio 1:
Enunciado: 
Sea la función convertirTemperatura() que convierte una temperatura dada en grados Celsius a Fahrenheit o viceversa, dependiendo del argumento que se pase. Esta función lanza una excepción si se intenta convertir una temperatura por debajo del cero absoluto (-273.15°C o -459.67°F). No se le pide que escriba esta función, se asume que ya existe.

Escribir un algoritmo que convierta la temperatura introducida por el usuario.

Visualización y entrada (ejecución normal):


Introducir la temperatura en Celsius: 25
25°C = 77°F
Visualización y entrada (ejecución no normal):


Introducir la temperatura en Celsius: -274
La temperatura está por debajo del cero absoluto.
Explicación: 

En este ejercicio se implementan dos clases, Menu y ConvertidorTemperatura

La clase ConvertidorTemperatura tiene los métodos para la conversion de temperatura, mientras que en la clase Menu, se le pide al usuario que indique la operación a realizar





Ejercicio 2:
Enunciado:
El objetivo es crear un sistema de control de stock que gestione libros en una librería, permitiendo agregar, eliminar, y consultar libros.

Este sistema maneja la cantidad de libros como enteros. Con el tipo int, los valores deben estar entre -2.147.483.648 y 2.147.483.647. Si un libro se vende muy bien y se intenta añadir un stock que supera la capacidad máxima de un int, habrá un "desbordamiento". Desafortunadamente, esto no causa un error ni una excepción directamente.

a. Creación de una clase ExcepcionStockDesbordado Esta clase se utiliza para representar una excepción controlada cuando el stock de un libro excede la capacidad máxima permitida. El mensaje asociado es "El stock del libro excede la capacidad de este sistema".

b. Creación de la clase de utilidad Libro Esta clase contiene métodos para añadir al stock, quitar del stock y consultar el stock de un libro. Todos toman enteros como argumentos y devuelven un entero.

Los métodos de añadir y quitar del stock generan excepciones del tipo ExcepcionStockDesbordado, en caso de que el stock provoque un desbordamiento de la capacidad de un entero de tipo int.

c. Creación del sistema de control de stock El programa debe manejar las excepciones causadas por la entrada incorrecta de un número entero, desbordamiento de stock durante una operación o intento de reducir el stock por debajo de cero.

Ejemplo de la ejecución esperada:


Introducir el ISBN del libro:

1234567890

ISBN 1234567890

¿Acción? (añadir, quitar, consultar, salir)

añadir

Introducir cantidad a añadir:

999999999

El stock del libro excede la capacidad de este sistema.

ISBN 1234567890

¿Acción? (añadir, quitar, consultar, salir)

consultar

Stock actual: 0

¿Acción? (añadir, quitar, consultar, salir)

salir
Estos ejemplos mantienen el enfoque en la programación y el manejo de errores, pero aplican los conceptos a escenarios distintos a los originales.
Explicación:
Para este ejercicio, se crea un menu interactivo que permite al usuario agregar, eliminar y comprobar el stock de una libreria.

La clase libro contiene los métodos para la agregación y eliminación de los libros de la libreria.

La clase Menu implementa el menú que se muestra en la clase SistemaDeControlDeStock


