# Escenario: Editor de Documentos con Funcionalidad de Deshacer

## Descripción:

Imagina que estás desarrollando un editor de documentos para una aplicación de procesamiento de texto. 
Los usuarios pueden escribir y editar documentos, y necesitan la capacidad de deshacer y rehacer acciones 
para revertir cambios no deseados.

## Objetivo:

Implementar el patrón de diseño Memento para permitir que los usuarios deshagan y rehagan acciones en el 
editor de documentos.

## Requisitos:

1. Crear una clase Documento que represente un documento en el editor, con métodos para escribir texto, 
deshacer la última acción y rehacer la última acción.
2. Implementar una clase Memento que almacene el estado de un documento en un momento dado.
3. Agregar métodos en la clase Documento para crear un memento que represente su estado actual, y para restaurar 
el estado de un documento a partir de un memento dado.
4. Permitir que los usuarios escriban texto en el documento y realicen operaciones de deshacer y rehacer para 
revertir y volver a aplicar los cambios.
5. Demostrar el uso del patrón Memento en el editor de documentos mediante ejemplos de escritura de texto, 
deshacer y rehacer acciones.
