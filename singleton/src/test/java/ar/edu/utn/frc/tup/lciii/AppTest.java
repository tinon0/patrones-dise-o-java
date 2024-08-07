package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void main(){
        RegistroUsuarios ejemplo1 = RegistroUsuarios.getInstance();
        RegistroUsuarios ejemplo2 = RegistroUsuarios.getInstance();
        boolean respuesta = ejemplo2 == ejemplo1;
        assertTrue(respuesta);
    }
}