package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    /* Here you will write your test */
    @Test
    void main(){
        ComponenteArchivo archivo1 = new Archivo("csgo.exe");
        ComponenteArchivo archivo2 = new Archivo("foto.jpeg");

        ComponenteArchivo carpeta = new Carpeta("carpeta");
        carpeta.agregar(archivo1);
        carpeta.agregar(archivo2);

        ((Archivo) archivo1).leer();
        ((Archivo) archivo2).leer();
        ((Archivo) archivo2).eliminar();
        ((Archivo) archivo2).agregar(archivo2);


        ((Carpeta) carpeta).listarContenido();

        carpeta.eliminar(archivo2);

        ((Carpeta) carpeta).listarContenido();
    }
}