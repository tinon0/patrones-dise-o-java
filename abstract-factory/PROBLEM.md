# Escenario: Fabricación de Vehículos

## Descripción:

Imagina que estás trabajando en una fábrica de automóviles que produce diferentes tipos de vehículos, 
como coches eléctricos, coches de gasolina y bicicletas. Cada tipo de vehículo tiene sus propias 
características y componentes específicos.

## Objetivo:
Implementar el patrón de diseño Abstract Factory para permitir la creación de diferentes tipos de 
vehículos de manera flexible y modular.

## Requisitos:

1. Definir una interfaz FabricaVehiculos que declare métodos abstractos para la creación de diferentes componentes de vehículos, como crearMotor(), crearCarroceria(), crearRuedas(), etc.
2. Implementar clases concretas que representen diferentes fábricas de vehículos, como FabricaCochesElectricos, FabricaCochesGasolina y FabricaBicicletas.
3. Cada clase concreta de fábrica debe implementar los métodos abstractos de la interfaz FabricaVehiculos para crear componentes específicos de vehículos según el tipo de fábrica.
4. Definir interfaces para cada tipo de componente de vehículo, como Motor, Carroceria y Ruedas, con clases concretas que implementen estas interfaces para representar los componentes reales.
5. Permitir que los clientes soliciten la creación de diferentes tipos de vehículos a través del sistema de la fábrica y que el sistema procese automáticamente la creación de los componentes de vehículos utilizando la fábrica adecuada.
6. Demostrar el uso del patrón Abstract Factory en el sistema de fabricación de vehículos mediante ejemplos de creación de diferentes tipos de vehículos utilizando diferentes fábricas de vehículos.