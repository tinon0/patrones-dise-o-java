# Escenario: Sistema de Gestión de Biblioteca

## Descripción:

Imagina que estás desarrollando un sistema de gestión de biblioteca en Java para una 
institución educativa. El sistema debe permitir a los usuarios (estudiantes y personal) 
buscar libros por diferentes criterios, como título, autor, género, etc. Además, 
se requiere que los usuarios puedan recorrer la lista de libros de manera eficiente 
sin exponer la estructura interna de la colección.

## Objetivo:

Implementar el patrón de diseño Iterator para permitir el recorrido de la lista de 
libros de manera eficiente y sin exponer la estructura interna de la colección.

## Requisitos:

1. Crear una interfaz Iterator que defina métodos como hasNext() para verificar si hay 
más elementos y next() para obtener el siguiente elemento de la colección.
2. Implementar una clase Libro que represente un libro con atributos como título, autor,
género, etc.
3. Crear una clase ListaLibros que contenga una colección de objetos Libro y que implemente 
la interfaz Iterable, proporcionando un método para obtener un iterador sobre la colección
de libros.
4. Implementar una clase IteradorListaLibros que implemente la interfaz Iterator y que permita
recorrer la lista de libros de manera eficiente sin exponer la estructura interna de la 
colección.
5. Demostrar el uso del patrón Iterator en el sistema de gestión de biblioteca mediante 
ejemplos de búsqueda y recorrido de la lista de libros en diferentes escenarios, como 
búsqueda por título, autor o género.
