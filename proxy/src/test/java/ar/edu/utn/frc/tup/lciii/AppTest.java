package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void accesoConcebido(){
        Usuario a = new Usuario("Jorge", true);
        ProxyContenido proxy = new ProxyContenido();
        assertEquals("Accediendo al contenido", proxy.autorizacion(a));
    }
    @Test
    void accesoDenegado(){
        Usuario a = new Usuario("Jorge", false);
        ProxyContenido proxy = new ProxyContenido();
        assertEquals("Acceso restringido", proxy.autorizacion(a));
    }
}