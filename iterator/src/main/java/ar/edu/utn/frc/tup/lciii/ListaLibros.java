package ar.edu.utn.frc.tup.lciii;

import java.util.ArrayList;
import java.util.List;
import lombok.*;
@Getter
public class ListaLibros implements Iterable <Libro>{
    private List<Libro> listaLibros;

    public ListaLibros(){
        this.listaLibros = new ArrayList<>();
    }
    public void agregarLibro(Libro libro){
        listaLibros.add(libro);
    }
    @Override
    public Iterator<Libro> iterator() {
        return new IteradorListaLibros(listaLibros);
    }
}
