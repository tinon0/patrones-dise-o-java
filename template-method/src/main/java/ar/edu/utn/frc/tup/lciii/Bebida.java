package ar.edu.utn.frc.tup.lciii;

public abstract class Bebida {
    public void preparar(){
        calentarAgua();
        agregarIngredientePrincipal();
        agregarExtras();
    }
    public abstract void calentarAgua();
    public abstract void agregarIngredientePrincipal();
    public abstract void agregarExtras();
}
