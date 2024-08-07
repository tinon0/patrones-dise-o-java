# Escenario: Sistema de Reservas de Vuelos

## Descripción:

Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea que opera vuelos nacionales e internacionales. El sistema debe permitir a los usuarios buscar vuelos disponibles, realizar reservas, gestionar pagos y obtener confirmaciones de reserva de manera eficiente.

## Objetivo:

Implementar el patrón de diseño Facade para proporcionar una interfaz unificada y simplificada para que los usuarios interactúen con el sistema de reservas de vuelos, ocultando la complejidad interna del sistema y facilitando su uso.

## Requisitos:

1. Definir una clase SistemaReservasVuelosFacade que actúe como la fachada del sistema de reservas de vuelos y proporcione métodos simples y claros para realizar operaciones comunes, como buscarVuelosDisponibles(), realizarReserva(), realizarPago(), obtenerConfirmacionReserva(), etc.
2. Implementar clases internas que manejen la lógica compleja de búsqueda de vuelos, gestión de reservas, procesamiento de pagos, etc., pero que sean invocadas de manera transparente a través de los métodos de la fachada.
3. Permitir que los usuarios utilicen la fachada SistemaReservasVuelosFacade para buscar vuelos disponibles, realizar reservas, realizar pagos y obtener confirmaciones de reserva con una sola interfaz unificada y simplificada.
4. Ocultar la complejidad interna del sistema de reservas de vuelos a los usuarios, de modo que puedan realizar todas las operaciones necesarias sin necesidad de comprender los detalles de implementación.
5. Demostrar el uso del patrón Facade en el sistema de reservas de vuelos mediante ejemplos de búsqueda y reserva de vuelos, procesamiento de pagos y obtención de confirmaciones de reserva utilizando la fachada SistemaReservasVuelosFacade.