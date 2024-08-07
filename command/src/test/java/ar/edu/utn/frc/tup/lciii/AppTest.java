package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void invocador(){
        Invocador mozo = new Invocador();
        Receptor equipoCocina = new Receptor();
        Comando comandoCafe = new ComandoPrepararCafe(equipoCocina);

        assertTrue(mozo.getOrdenesLista().isEmpty());

        mozo.agregarOrden(comandoCafe);

        assertFalse(mozo.getOrdenesLista().isEmpty());

        mozo.ejecutarOrdenes();

        assertEquals(0, mozo.getOrdenesLista().size());
    }
    @Test
    void cafe(){
        Invocador mozo = new Invocador();
        Receptor equipoCocina = new Receptor();

        Comando comandoCafe = new ComandoPrepararCafe(equipoCocina);

        String resultado = "Preparar cafe";
        assertEquals(resultado, comandoCafe.ejecutar());
    }
    @Test
    void ensalada(){
        Invocador mozo = new Invocador();
        Receptor equipoCocina = new Receptor();

        Comando comandoEnsalada = new ComandoPrepararEnsalada(equipoCocina);

        String resultado = "Preparar ensalada";
        assertEquals(resultado, comandoEnsalada.ejecutar());
    }
    @Test
    void refresco(){
        Invocador mozo = new Invocador();
        Receptor equipoCocina = new Receptor();

        Comando comandoRefresco = new ComandoPrepararRefresco(equipoCocina);

        String resultado = "Preparar refresco";
        assertEquals(resultado, comandoRefresco.ejecutar());
    }
    @Test
    void pizza(){
        Invocador mozo = new Invocador();
        Receptor equipoCocina = new Receptor();

        Comando comandoPizza = new ComandoPrepararPizza(equipoCocina);

        String resultado = "Preparar pizza";
        assertEquals(resultado, comandoPizza.ejecutar());
    }
}