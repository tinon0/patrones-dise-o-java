package ar.edu.utn.frc.tup.lciii;

import java.util.*;

public class IteradorListaLibros implements Iterator<Libro>{
    private List<Libro> libroList;
    private int posicion;
    public IteradorListaLibros(List<Libro> libros){
        this.libroList = libros;
        this.posicion = 0;
    }
    @Override
    public boolean hasNext() {
        return posicion < libroList.size();
    }

    @Override
    public Libro next() {
        return libroList.get(posicion++);
    }
}
