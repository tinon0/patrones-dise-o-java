# Escenario: Registro de Usuarios en una Aplicación

## Descripción:

Imagina que estás desarrollando una aplicación para una empresa que necesita gestionar 
el registro de usuarios. La aplicación debe garantizar que solo exista una instancia única 
de la clase encargada del registro de usuarios en todo el sistema, para evitar inconsistencias 
y problemas de concurrencia.

## Objetivo:
Implementar el patrón de diseño Singleton para garantizar que solo exista una instancia de 
la clase encargada del registro de usuarios en toda la aplicación.

## Requisitos:

1. Crear una clase RegistroUsuarios que sea responsable de gestionar el registro de usuarios en 
la aplicación.
2. Garantizar que la clase RegistroUsuarios tenga un único punto de acceso global para obtener 
la instancia de la clase (método estático getInstance()).
3. Asegurarse de que la instancia de RegistroUsuarios sea creada solo la primera vez que se 
solicite y que todas las solicitudes posteriores devuelvan la misma instancia creada 
anteriormente.
4. Demostrar el uso del patrón Singleton en la aplicación mediante la creación de múltiples 
instancias de RegistroUsuarios y mostrar que todas ellas son iguales (es decir, apuntan 
a la misma instancia en memoria).

## Tips:

Usar como registro la escritura de los usuarios en un archivo de texto...
