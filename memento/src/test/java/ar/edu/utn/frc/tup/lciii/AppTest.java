package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void main(){
        Editor editor = new Editor();

        editor.escribir("Hola");
        editor.escribir("Hola como");
        editor.escribir("Hola como estas");
        editor.escribir("Hola como estas vecino?");

        editor.deshacer();
        assertEquals("Hola como estas", editor.mostrar());
    }
}