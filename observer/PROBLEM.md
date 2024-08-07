# Escenario: Sistema de Notificaciones de Stock

## Descripción:

Imagina que estás desarrollando un sistema de gestión de inventario para una empresa minorista. 
El sistema necesita notificar a los interesados sobre cambios en el stock de ciertos productos 
para garantizar una gestión eficiente del inventario.

## Objetivo:

Implementar el patrón de diseño Observer para permitir que los interesados se registren para recibir 
notificaciones sobre cambios en el stock de productos específicos.

## Requisitos:

1. Crear una clase Producto que represente un producto en el inventario, con atributos como nombre, 
cantidad en stock, etc.
2. Implementar una interfaz Observador que defina un método actualizar() para recibir notificaciones sobre
cambios en el stock de productos.
3. Crear una clase SujetoNotificador que actúe como el sujeto observable y mantenga una lista de observadores 
registrados.
4. Agregar métodos en SujetoNotificador para que los observadores se registren y cancelen su suscripción para 
recibir notificaciones.
5. Implementar un mecanismo en SujetoNotificador para notificar a los observadores registrados sobre cambios 
en el stock de productos.
6. Permitir que los interesados, como el personal de almacén o los gerentes, se registren para recibir 
notificaciones sobre cambios en el stock de productos específicos.
7. Demostrar el uso del patrón Observer en el sistema de gestión de inventario mediante ejemplos de registro
de observadores y recepción de notificaciones sobre cambios en el stock de productos.
