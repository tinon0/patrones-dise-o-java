# Escenario: Sistema de Clonación de Documentos

## Descripción:

Imagina que estás desarrollando un sistema de gestión de documentos para una empresa que maneja una gran 
cantidad de documentos estándar, como contratos, formularios y reportes. El sistema necesita permitir a 
los usuarios clonar documentos existentes para crear nuevas versiones modificadas.

## Objetivo:

Implementar el patrón de diseño Prototype para permitir que los usuarios clonen documentos existentes y 
creen nuevas versiones modificadas de los mismos.

## Requisitos:

1. Crear una interfaz Documento que defina un método clonar() para clonar el documento.
2. Implementar clases concretas que implementen la interfaz Documento para representar diferentes tipos de 
documentos, como Contrato, Formulario y Reporte.
3. Agregar métodos en las clases concretas para personalizar y modificar los documentos clonados según sea necesario.
4. Implementar un registro de prototipos que almacene instancias predefinidas de cada tipo de documento 
como prototipos.
5. Permitir que los usuarios soliciten la clonación de un documento existente a partir del registro de prototipos.
6. Demostrar el uso del patrón Prototype en el sistema de gestión de documentos mediante ejemplos de 
clonación de diferentes tipos de documentos y modificación de las versiones clonadas.
