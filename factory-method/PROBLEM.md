# Escenario: Fabricación de Productos en una Fábrica de Juguetes

## Descripción:

Imagina que estás trabajando en una fábrica de juguetes que produce una variedad de productos, como muñecas, coches, peluches y bloques de construcción. Cada tipo de juguete tiene su propio proceso de fabricación y requiere herramientas y materiales específicos.

## Objetivo:

Implementar el patrón de diseño Factory Method para permitir la creación de diferentes tipos de juguetes de manera flexible y modular, proporcionando así un enfoque escalable para la fabricación de productos en la fábrica de juguetes.

## Requisitos:

1. Definir una interfaz Juguete que declare métodos comunes para todos los tipos de juguetes, como empaquetar(), etiquetar(), enviar(), etc.
2. Implementar clases concretas que representen diferentes tipos de juguetes, como Muñeca, Coche, Peluche y BloquesConstruccion, cada una implementando la interfaz Juguete.
3. Definir una clase abstracta FabricaJuguetes que contenga un método abstracto crearJuguete() para crear nuevos juguetes.
4. Implementar clases concretas que extiendan FabricaJuguetes para cada tipo de juguete, como FabricaMuñecas, FabricaCoches, FabricaPeluches y FabricaBloquesConstruccion.
5. Cada clase concreta de fábrica debe implementar el método crearJuguete() para crear instancias del tipo específico de juguete correspondiente.
6. Permitir que la fábrica de juguetes cree diferentes tipos de juguetes mediante la invocación del método crearJuguete() de la fábrica correspondiente.
7. Demostrar el uso del patrón Factory Method en la fábrica de juguetes mediante ejemplos de creación de diferentes tipos de juguetes utilizando diferentes fábricas de juguetes.