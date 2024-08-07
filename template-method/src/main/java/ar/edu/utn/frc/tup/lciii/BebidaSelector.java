package ar.edu.utn.frc.tup.lciii;

public class BebidaSelector {
    public void seleccionarOpcion(int opcion){
        switch (opcion){
            case 1:
                Bebida cafe = new Cafe();
                cafe.preparar();
                break;
            case 2:
                Bebida te = new Te();
                te.preparar();
                break;
            case 3:
                Bebida chocolatada = new ChocolateCaliente();
                chocolatada.preparar();
                break;
            default:
                throw new IllegalArgumentException("Opcion incorrecta");
        }
    }
}
