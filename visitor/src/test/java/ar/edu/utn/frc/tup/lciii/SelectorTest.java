package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SelectorTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @Test
    void documentoEstadistica(){
        provideInput("1\n");
        Selector selector = new Selector(new Scanner(System.in));
        String resultado = selector.selectorDocumento(1);
        assertEquals("Estadisticas de un Documento de Texto", resultado);
    }
    @Test
    void documentoComplejidad(){
        provideInput("2\n");
        Selector selector = new Selector(new Scanner(System.in));
        String resultado = selector.selectorDocumento(1);
        assertEquals("Complejidad de un Documento de Texto", resultado);
    }
    @Test
    void documentoPalabras(){
        provideInput("3\n");
        Selector selector = new Selector(new Scanner(System.in));
        String resultado = selector.selectorDocumento(1);
        assertEquals("Palabras claves de un Documento de Texto", resultado);
    }
    @Test
    void hojaEstadisticas(){
        provideInput("1\n");
        Selector selector = new Selector(new Scanner(System.in));
        String resultado = selector.selectorDocumento(2);
        assertEquals("Estadisticas de una Hoja de Calculo", resultado);
    }
    @Test
    void hojaComplejidad(){
        provideInput("2\n");
        Selector selector = new Selector(new Scanner(System.in));
        String resultado = selector.selectorDocumento(2);
        assertEquals("Complejidad de una Hoja de Calculo", resultado);
    }
    @Test
    void hojaPalabras(){
        provideInput("3\n");
        Selector selector = new Selector(new Scanner(System.in));
        String resultado = selector.selectorDocumento(2);
        assertEquals("Palabras claves de una Hoja de Calculo", resultado);
    }
    @Test
    void presentacionEstadisticas(){
        provideInput("1\n");
        Selector selector = new Selector(new Scanner(System.in));
        String resultado = selector.selectorDocumento(3);
        assertEquals("Estadisticas de una Presentacion", resultado);
    }
    @Test
    void presentacionComplejidad(){
        provideInput("2\n");
        Selector selector = new Selector(new Scanner(System.in));
        String resultado = selector.selectorDocumento(3);
        assertEquals("Complejidad de una Presentacion", resultado);
    }
    @Test
    void presentacionPalabras(){
        provideInput("3\n");
        Selector selector = new Selector(new Scanner(System.in));
        String resultado = selector.selectorDocumento(3);
        assertEquals("Palabras claves de una Presentacion", resultado);
    }
}