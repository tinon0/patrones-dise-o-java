# Escenario: Sistema de Gestión de Órdenes en un Restaurante

## Descripción:

Imagina que estás desarrollando un sistema de gestión de órdenes para un restaurante que ofrece una variedad de platos y bebidas. El restaurante tiene un equipo de cocina y un equipo de camareros que toman las órdenes de los clientes y las envían a la cocina para su preparación.

## Objetivo:

Implementar el patrón de diseño Command para permitir que los camareros envíen órdenes de manera flexible y eficiente a la cocina, y que el equipo de cocina pueda prepararlas y servirlas según sea necesario.

## Requisitos:

1. Definir una interfaz Comando que declare un método ejecutar() para ejecutar una acción específica, como prepararPlato(), prepararBebida(), etc.
2. Implementar clases concretas que actúen como diferentes comandos para preparar platos y bebidas, como ComandoPrepararPizza, ComandoPrepararEnsalada, ComandoPrepararCafe, ComandoPrepararRefresco, etc.
3. Cada clase concreta de comando debe implementar la interfaz Comando y proporcionar una implementación para ejecutar la acción específica de preparación.
4. Definir una clase Invocador que actúe como el camarero y contenga una lista de comandos pendientes para ejecutar.
5. Permitir que el camarero agregue comandos a la lista de órdenes pendientes y que invoque los comandos para enviar las órdenes a la cocina.
6. Definir una clase Receptor que actúe como el equipo de cocina y que contenga métodos para ejecutar las acciones específicas de preparación de platos y bebidas.
7. Permitir que el equipo de cocina reciba los comandos de preparación y ejecute las acciones correspondientes para preparar y servir los platos y bebidas.
8. Demostrar el uso del patrón Command en el sistema de gestión de órdenes del restaurante mediante ejemplos de envío de órdenes desde los camareros a la cocina y preparación de platos y bebidas por parte del equipo de cocina.