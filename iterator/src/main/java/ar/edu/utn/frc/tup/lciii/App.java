package ar.edu.utn.frc.tup.lciii;

import java.math.BigDecimal;

/**
 * Iterator Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        ListaLibros listaLibros = new ListaLibros();
        listaLibros.agregarLibro(new Libro("Harry Potter", "JK Rowling", "Fantasia"));
        listaLibros.agregarLibro(new Libro("Mi libro", "Dross", "Terror"));
        listaLibros.agregarLibro(new Libro("Wigetta", "Samuen de Luque", "Youtuber"));

        Iterator<Libro> iterator = listaLibros.iterator();

        while(iterator.hasNext()){
            Libro libro = iterator.next();
            System.out.println("TITULO: " + libro.getTitulo());
        }
    }
}
