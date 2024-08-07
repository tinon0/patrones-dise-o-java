# Escenario: Construcción de Orden de Compra en un Sistema de Comercio Electrónico

## Descripción:

Imagina que estás desarrollando un sistema de comercio electrónico para una tienda en línea que vende una amplia variedad de productos, desde electrónicos hasta ropa y accesorios. El sistema debe permitir a los usuarios crear y personalizar sus órdenes de compra de manera flexible y eficiente.

## Objetivo:

Implementar el patrón de diseño Builder para permitir que los usuarios construyan órdenes de compra personalizadas paso a paso, especificando diferentes atributos y opciones para cada producto en la orden.

## Requisitos:

1. Crear una clase OrdenCompra que actúe como el producto final a construir.
2. Definir una interfaz ConstructorOrden que declare métodos para construir diferentes partes de la orden de compra, como construirCliente(), construirProductos(), construirEnvio(), etc.
3. Implementar clases concretas que actúen como constructores de órdenes de compra, como ConstructorBasico, ConstructorPremium, ConstructorPersonalizado, etc.
4. Cada constructor concreto debe implementar la interfaz ConstructorOrden y proporcionar métodos para construir diferentes partes de la orden de compra según el tipo de constructor.
5. Permitir que los usuarios utilicen los constructores de órdenes de compra para especificar diferentes atributos y opciones para cada producto en la orden, como cantidad, talla, color, etc.
6. Demostrar el uso del patrón Builder en el sistema de comercio electrónico mediante ejemplos de construcción de órdenes de compra personalizadas utilizando diferentes constructores de órdenes de compra.