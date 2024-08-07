# Escenario: Preparación de Bebidas en una Cafetería

## Descripción:

Imagina que estás desarrollando un sistema para una cafetería que ofrece una variedad de bebidas, 
como café, té y chocolate caliente. Cada tipo de bebida requiere un proceso de preparación diferente, 
pero el flujo general de preparación es similar para todas ellas.

## Objetivo:

Implementar el patrón de diseño Template Method para definir el flujo general de preparación de 
bebidas y permitir que las bebidas individuales personalicen pasos específicos según sea necesario.

## Requisitos:

1. Crear una clase abstracta Bebida que defina el método preparar() como un template method para el proceso 
de preparación.
2. Implementar métodos abstractos en la clase Bebida para representar pasos específicos del proceso de 
preparación, como calentarAgua(), agregarIngredientePrincipal(), agregarExtras(), etc.
3. Definir el flujo general de preparación de bebidas en el método preparar(), utilizando los métodos 
abstractos para representar pasos específicos.
4. Crear clases concretas que extiendan Bebida para representar diferentes tipos de bebidas, como Cafe, 
Te y ChocolateCaliente.
5. Implementar métodos concretos en las clases específicas para personalizar los pasos del proceso de 
preparación según el tipo de bebida.
6. Permitir que los clientes soliciten la preparación de diferentes tipos de bebidas a través del sistema 
de la cafetería, y que el sistema procese automáticamente la preparación de la bebida seleccionada.
7. Demostrar el uso del patrón Template Method en el sistema de preparación de bebidas mediante ejemplos 
de preparación de diferentes tipos de bebidas y personalización de pasos específicos según sea necesario.