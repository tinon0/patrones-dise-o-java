package ar.edu.utn.frc.tup.lciii;

public class PersonalAlmacen implements Observador{
    private String nombre;
    public PersonalAlmacen(String nom){
        this.nombre = nom;
    }
    @Override
    public String actualizar(String nombre, int stock, float peso) {
        return "Personal de Almacen " + this.nombre + " ha cambiado el producto " + nombre + ". Stock: " + stock + "|Peso: " + peso;
    }
}
