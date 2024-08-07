# Escenario: Sistema de Cafetería con Opciones de Personalización

## Descripción:

Imagina que estás desarrollando un sistema para una cafetería que ofrece una variedad de bebidas, como café, té y chocolate caliente, así como opciones de personalización, como agregar leche, crema, azúcar, jarabes y especias. El sistema debe permitir a los clientes personalizar sus bebidas de acuerdo a sus preferencias individuales.

## Objetivo:

Implementar el patrón de diseño Decorator para permitir la personalización dinámica de bebidas en la cafetería, donde cada adición o modificación de ingredientes se refleje en el precio y la descripción de la bebida.

## Requisitos:

1. Definir una interfaz Bebida que declare un método costo() para calcular el costo de la bebida y un método descripcion() para obtener la descripción de la bebida.
2. Implementar clases concretas que representen diferentes tipos de bebidas, como Cafe, Te, ChocolateCaliente, etc. Cada clase debe implementar la interfaz Bebida.
3. Definir una clase abstracta DecoradorBebida que implemente la interfaz Bebida y contenga una referencia a un objeto Bebida base.
4. Implementar clases concretas de decoradores para cada opción de personalización, como Leche, Crema, Azucar, Jarabe, Especias, etc. Cada decorador debe extender DecoradorBebida y sobrescribir los métodos costo() y descripcion() para agregar el costo y la descripción de la opción de personalización.
5. Permitir que los clientes elijan una bebida base (por ejemplo, café) y agreguen opciones de personalización (por ejemplo, leche, azúcar, jarabe de vainilla) de manera dinámica.
6. Calcular el costo total de la bebida incluyendo todas las opciones de personalización, y mostrar una descripción completa de la bebida con todas las modificaciones aplicadas.
7. Demostrar el uso del patrón Decorator en el sistema de cafetería mediante ejemplos de personalización dinámica de bebidas y cálculo correcto del costo total y descripción de la bebida modificada.