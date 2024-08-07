# Escenario: Sistema de Pago en una Plataforma de Comercio Electrónico

## Descripción:

Imagina que estás desarrollando el sistema de pago para una plataforma de comercio electrónico que 
vende una variedad de productos, desde ropa hasta electrónicos. El sistema de pago debe ser flexible y 
permitir a los usuarios seleccionar diferentes métodos de pago según sus preferencias y necesidades.

## Objetivo:

Implementar el patrón de diseño Strategy para gestionar diferentes estrategias de pago en el sistema 
de la plataforma de comercio electrónico.

## Requisitos:

1. Crear una interfaz EstrategiaPago que defina un método realizarPago() para procesar el pago.
2. Implementar clases concretas que representen diferentes estrategias de pago, como PagoTarjetaCredito, 
PagoPayPal y PagoTransferenciaBancaria.
3. Agregar métodos en las clases concretas para implementar la lógica específica de cada método de pago, 
como la verificación de la tarjeta de crédito, la autenticación de PayPal o la transferencia bancaria.
4. Implementar una clase ProcesadorPago que contenga una referencia a la estrategia de pago seleccionada y 
métodos para cambiar la estrategia de pago según sea necesario.
5. Permitir que los usuarios seleccionen el método de pago deseado durante el proceso de compra y que el 
sistema procese automáticamente el pago utilizando la estrategia de pago seleccionada.
6. Demostrar el uso del patrón Strategy en el sistema de pago mediante ejemplos de selección y procesamiento 
de diferentes métodos de pago durante el proceso de compra en la plataforma de comercio electrónico.