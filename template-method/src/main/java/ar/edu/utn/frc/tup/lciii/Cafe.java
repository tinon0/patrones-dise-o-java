package ar.edu.utn.frc.tup.lciii;

public class Cafe extends Bebida {
    @Override
    public void calentarAgua() {
        System.out.println("Caliento agua a 90°");
    }

    @Override
    public void agregarIngredientePrincipal() {
        System.out.println("Agregar cafe");
    }

    @Override
    public void agregarExtras() {
        System.out.println("Agregar azucar");
    }
}
