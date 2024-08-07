package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void main(){
        SalaChat sala = new SalaChat();

        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Ludmila");

        sala.registrarUsuario(usuario1);
        sala.registrarUsuario(usuario2);

        sala.enviarMensaje("Hola amiga", usuario1);
        usuario1.enviarMensaje("Hola Mundo");
    }
}