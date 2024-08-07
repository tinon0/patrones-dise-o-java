package ar.edu.utn.frc.tup.lciii;

public class Archivo implements ComponenteArchivo{
    private String nombre;
    public Archivo(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void agregar(ComponenteArchivo componente) {
        System.out.println("No se puede agregar a un archivo.");
    }

    @Override
    public void eliminar(ComponenteArchivo componente) {
        System.out.println("No se puede eliminar de un archivo.");
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }
    public void leer() {
        System.out.println("Leyendo archivo: " + nombre);
    }
    public void escribir() {
        System.out.println("Escribiendo archivo: " + nombre);
    }
    public void eliminar() {
        System.out.println("Eliminando archivo: " + nombre);
    }
}
