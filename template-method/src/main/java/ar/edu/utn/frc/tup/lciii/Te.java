package ar.edu.utn.frc.tup.lciii;

public class Te extends Bebida{
    @Override
    public void calentarAgua() {
        System.out.println("Calentar agua a 100°");
    }

    @Override
    public void agregarIngredientePrincipal() {
        System.out.println("Agregar saquito de te");
    }

    @Override
    public void agregarExtras() {
        System.out.println("Agregar edulcorante");
    }
}
