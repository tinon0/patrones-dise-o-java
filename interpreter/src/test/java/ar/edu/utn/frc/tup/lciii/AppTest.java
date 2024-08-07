package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void sumas(){
        Expresion aux1 = new Parser().parser("2 2 +");
        Expresion aux2 = new Parser().parser("2 2 3 + +");
        Expresion aux3 = new Parser().parser("2 2 3 +");
        assertEquals("4", aux1.toString());
        assertEquals("7", aux2.toString());
        assertEquals("5", aux3.toString());
    }
    @Test
    void restas(){
        Expresion aux1 = new Parser().parser("2 2 -");
        Expresion aux2 = new Parser().parser("2 2 3 + -");
        Expresion aux3 = new Parser().parser("8 2 -");
        assertEquals("0", aux1.toString());
        assertEquals("3", aux2.toString());
        assertEquals("-6", aux3.toString());
    }
    @Test
    void multiplicaciones(){
        Expresion aux1 = new Parser().parser("2 3 *");
        Expresion aux2 = new Parser().parser("2 2 3 + *");
        Expresion aux3 = new Parser().parser("2 8 2 - *");
        assertEquals("6", aux1.toString());
        assertEquals("10", aux2.toString());
        assertEquals("-12", aux3.toString());
    }
    @Test
    void divisiones(){
        Expresion aux1 = new Parser().parser("2 2 /");
        Expresion aux2 = new Parser().parser("2 2 2 + /");
        Expresion aux3 = new Parser().parser("0 2 /");
        assertEquals("1", aux1.toString());
        assertEquals("2", aux2.toString());
        assertThrows(ArithmeticException.class, aux3::toString);
    }
}