package ar.edu.utn.frc.tup.lciii;


/**
 * Facade Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        SistemaReservasVuelosFacade sistema = new SistemaReservasVuelosFacade();

        System.out.println(sistema.buscarVuelosDisponibles("Cordoba", "Ushuaia", "12/06/2025"));
        System.out.println();
        System.out.println(sistema.realizarReserva("USHUAIA 2025", 2));
        System.out.println();
        System.out.println(sistema.realizarPago(2500.00));
        System.out.println();
        System.out.println(sistema.obtenerConfirmacionReserva("4J5SFPP-31"));
    }
}
