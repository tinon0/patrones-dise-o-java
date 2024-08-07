package ar.edu.utn.frc.tup.lciii;

public interface ComponenteArchivo {
    void agregar(ComponenteArchivo componente);
    void eliminar(ComponenteArchivo componente);
    String obtenerNombre();
}
