package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.bebidas.*;
import ar.edu.utn.frc.tup.lciii.decoradores.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    public void testCafe() {
        Bebida bebida = new Cafe();
        assertEquals(3.5, bebida.costo());
        assertEquals("Cafe", bebida.descripcion());
    }

    @Test
    public void testLeche() {
        Bebida bebida = new Leche(new Cafe());
        assertEquals(3.8, bebida.costo());
        assertEquals("Cafe, con Leche", bebida.descripcion());
    }

    @Test
    public void testAzucar() {
        Bebida bebida = new Azucar(new Cafe());
        assertEquals(3.8, bebida.costo());
        assertEquals("Cafe, con Azucar", bebida.descripcion());
    }

    @Test
    public void testCafeLecheAzucar() {
        Bebida bebida = new Azucar(new Leche(new Cafe()));
        assertEquals(4.1, bebida.costo(), 0.01);
        assertEquals("Cafe, con Leche, con Azucar", bebida.descripcion());
    }

    @Test
    public void testCafeDobleLecheEspecias() {
        Bebida bebida = new Leche(new Especias(new Leche(new Cafe())));
        assertEquals(4.6, bebida.costo());
        assertEquals("Cafe, con Leche, con Especias, con Leche", bebida.descripcion());
    }

    @Test
    public void testCafeDobleJarabe() {
        Bebida bebida = new Jarabe(new Jarabe(new Cafe()));
        assertEquals(5.5, bebida.costo());
        assertEquals("Cafe, con Jarabe, con Jarabe", bebida.descripcion());
    }

    @Test
    public void testCafeDobleLecheCrema() {
        Bebida bebida = new Leche(new Crema(new Leche(new Crema(new Cafe()))));
        assertEquals(5.5, bebida.costo());
        assertEquals("Cafe, con Crema, con Leche, con Crema, con Leche", bebida.descripcion());
    }
}