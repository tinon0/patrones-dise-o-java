package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        ComponenteArchivo archivo1 = new Archivo("csgo.exe");
        ComponenteArchivo archivo2 = new Archivo("foto.jpeg");

        ComponenteArchivo carpeta = new Carpeta("carpeta");
        carpeta.agregar(archivo1);
        carpeta.agregar(archivo2);

        ((Archivo) archivo1).leer();
        ((Archivo) archivo2).leer();

        ((Carpeta) carpeta).listarContenido();

        carpeta.eliminar(archivo2);

        ((Carpeta) carpeta).listarContenido();
    }
}
