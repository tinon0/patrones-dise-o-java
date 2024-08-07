package ar.edu.utn.frc.tup.lciii;

public class Usuario {
    private String nombre;
    private boolean esAutorizado;

    public Usuario(String nombre, boolean esAutorizado) {
        this.nombre = nombre;
        this.esAutorizado = esAutorizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsAutorizado() {
        return esAutorizado;
    }

    public void setEsAutorizado(boolean esAutorizado) {
        this.esAutorizado = esAutorizado;
    }
}
