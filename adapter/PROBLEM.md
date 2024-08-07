# Escenario: Integración de Sistemas de Pago

## Descripción:

Imagina que estás trabajando en una empresa que desarrolla un nuevo sistema de gestión de pagos en línea para minoristas. Este sistema debe integrarse con diferentes pasarelas de pago que ya están en uso por los minoristas. Sin embargo, cada pasarela de pago tiene su propia interfaz y protocolo de comunicación.

## Objetivo:

Implementar el patrón de diseño Adapter para permitir que el sistema de gestión de pagos se integre fácilmente con diferentes pasarelas de pago, independientemente de sus interfaces y protocolos de comunicación específicos.

## Requisitos:

1. Definir una interfaz común PasarelaPago que declare métodos estándar para procesar pagos, como iniciarPago(), procesarPago(), confirmarPago(), etc.
2. Implementar adaptadores concretos para cada pasarela de pago existente, como AdaptadorPayPal, AdaptadorStripe, AdaptadorAuthorizeNet, etc.
3. Cada adaptador concreto debe implementar la interfaz PasarelaPago y adaptar los métodos específicos de la pasarela de pago correspondiente a los métodos estándar de la interfaz PasarelaPago.
4. Permitir que el sistema de gestión de pagos utilice los adaptadores para comunicarse con las diferentes pasarelas de pago de manera uniforme, independientemente de sus interfaces subyacentes.
5. Demostrar el uso del patrón Adapter en el sistema de gestión de pagos mediante ejemplos de procesamiento de pagos utilizando diferentes pasarelas de pago y adaptadores correspondientes.