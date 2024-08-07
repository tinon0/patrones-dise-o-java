# Escenario: Manejo de Solicitudes de Reembolso en una Empresa

## Descripción:

Imagina que trabajas en el departamento de atención al cliente de una empresa de comercio electrónico que vende una variedad de productos. A menudo, los clientes solicitan reembolsos por diversos motivos, como productos defectuosos, envíos incorrectos o insatisfacción con el producto.

## Objetivo:

Implementar el patrón de diseño Chain of Responsibility para manejar las solicitudes de reembolso de manera eficiente y flexible, asegurando que cada solicitud sea procesada por el departamento adecuado en función de su naturaleza.

## Requisitos:

1. Definir una interfaz ManejadorReembolso que declare métodos para manejar solicitudes de reembolso, como manejarReembolso() y establecerSiguienteManejador().
2. Implementar clases concretas que actúen como diferentes departamentos encargados de manejar solicitudes de reembolso, como DepartamentoDevoluciones, DepartamentoAtencionCliente, DepartamentoCalidad, etc.
3. Cada clase concreta de manejo de reembolso debe implementar la interfaz ManejadorReembolso y proporcionar una implementación para manejar las solicitudes de reembolso que estén dentro de su alcance.
4. Las clases concretas de manejo de reembolso deben tener una referencia al siguiente manejador en la cadena.
5. Permitir que los clientes presenten solicitudes de reembolso a través del sistema de la empresa y que el sistema procese automáticamente la solicitud, enviándola al departamento correspondiente en la cadena de responsabilidad.
6. Demostrar el uso del patrón Chain of Responsibility en el sistema de manejo de solicitudes de reembolso mediante ejemplos de procesamiento de diferentes solicitudes de reembolso y seguimiento de la ruta de la cadena de responsabilidad.