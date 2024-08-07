package ar.edu.utn.frc.tup.lciii;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements ComponenteArchivo{
    private String nombre;
    private List<ComponenteArchivo> archivos = new ArrayList<>();
    public Carpeta(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void agregar(ComponenteArchivo componente) {
        archivos.add(componente);
    }
    @Override
    public void eliminar(ComponenteArchivo componente) {
        archivos.remove(componente);
    }
    @Override
    public String obtenerNombre() {
        return nombre;
    }
    public void listarContenido() {
        System.out.println("Contenido de la carpeta '" + nombre + "':");
        for (ComponenteArchivo componente : archivos) {
            System.out.println(componente.obtenerNombre());
        }
    }

}
