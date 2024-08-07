package ar.edu.utn.frc.tup.lciii;


public class Gerente implements Observador{
    private String nombre;
    public Gerente(String nom){
        this.nombre = nom;
    }
    @Override
    public String actualizar(String nombre, int stock, float peso) {
        return "Gerente " + this.nombre + " ha cambiado el producto " + nombre + ". Stock: " + stock + "|Peso: " + peso;
    }
}
