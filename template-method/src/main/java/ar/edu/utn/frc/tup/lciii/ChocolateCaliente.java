package ar.edu.utn.frc.tup.lciii;

public class ChocolateCaliente extends Bebida{
    @Override
    public void calentarAgua() {
        System.out.println("Calentar a 65°");
    }

    @Override
    public void agregarIngredientePrincipal() {
        System.out.println("Agregar chocolatada");
    }

    @Override
    public void agregarExtras() {
        System.out.println("Agregar canela");
    }
}
