package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void main(){
        ListaLibros listaLibros = new ListaLibros();
        Libro libro = new Libro("Harry Potter", "JK Rowling", "Fantasia");
        listaLibros.agregarLibro(libro);

        Iterator<Libro> iterator = listaLibros.iterator();

        assertTrue(iterator.hasNext());
        assertEquals(libro, iterator.next());

        ListaLibros listaLibros2 = new ListaLibros();
        Iterator<Libro> iterator2 = listaLibros2.iterator();

        assertFalse(iterator2.hasNext());

        assertEquals("Harry Potter", libro.getTitulo());
        assertEquals("JK Rowling", libro.getAutor());
        assertEquals("Fantasia", libro.getGenero());

    }
}