package ar.edu.utn.frc.tup.lciii;

public class SistemaReservasVuelosFacade {
    public String buscarVuelosDisponibles(String origen, String destino, String fecha){
        return BuscadorVuelos.buscarVuelosDisponibles(origen, destino, fecha);
    }
    public String realizarReserva(String vuelo, int numPasajeros){
        return GestionReservas.realizarReserva(vuelo, numPasajeros);
    }
    public String realizarPago(double monto){
        return ProcesadorPagos.realizarPago(monto);
    }
    public String obtenerConfirmacionReserva(String codigoReserva){
        return GestionReservas.obtenerConfirmacionReserva(codigoReserva);
    }
}
