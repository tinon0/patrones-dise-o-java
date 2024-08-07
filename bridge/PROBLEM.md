# Escenario: Sistema de Entretenimiento Multimedia

## Descripción:

Imagina que estás desarrollando un sistema de entretenimiento multimedia que puede reproducir diferentes tipos de contenido, como música, videos y juegos, en diferentes dispositivos, como teléfonos inteligentes, tabletas y televisores inteligentes. Cada tipo de contenido requiere un tratamiento específico, y los dispositivos tienen diferentes capacidades de reproducción.

## Objetivo:

Implementar el patrón de diseño Bridge para separar la abstracción de los dispositivos de la implementación de los contenidos, permitiendo que los dos puedan variar independientemente.

## Requisitos:

1. Definir una interfaz ReproductorMultimedia que declare métodos para reproducir contenido, como reproducir(), pausar(), detener(), etc.
2. Implementar clases concretas que representen diferentes tipos de reproductores multimedia, como ReproductorMusica, ReproductorVideo y ReproductorJuegos.
3. Definir una interfaz PlataformaDispositivo que declare métodos para controlar el dispositivo de reproducción, como encender(), apagar(), subirVolumen(), bajarVolumen(), etc.
4. Implementar clases concretas que representen diferentes dispositivos de reproducción, como TelefonoInteligente, Tableta y TelevisorInteligente.
5. Crear una clase AbstraccionReproductor que contenga una referencia a un objeto de tipo PlataformaDispositivo y métodos para controlar la reproducción de contenido en el dispositivo.
6. Implementar clases concretas que extiendan AbstraccionReproductor para representar diferentes tipos de abstracciones de reproductores multimedia, como AbstraccionMusica, AbstraccionVideo y AbstraccionJuegos.
7. Permitir que los usuarios reproduzcan diferentes tipos de contenido en diferentes dispositivos a través del sistema de entretenimiento multimedia y que el sistema procese automáticamente la reproducción utilizando las abstracciones de reproductores multimedia adecuadas y los dispositivos de reproducción correspondientes.
8. Demostrar el uso del patrón Bridge en el sistema de entretenimiento multimedia mediante ejemplos de reproducción de diferentes tipos de contenido en diferentes dispositivos utilizando las abstracciones de reproductores multimedia y los dispositivos de reproducción adecuados.