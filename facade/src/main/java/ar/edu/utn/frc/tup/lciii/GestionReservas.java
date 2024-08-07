package ar.edu.utn.frc.tup.lciii;

public class GestionReservas {
    public static String realizarReserva(String vuelo, int numPasajeros) {
        return "Realizando reserva para el vuelo " + vuelo + " para " + numPasajeros + " pasajeros." + System.lineSeparator() + "Reserva realizada exitosamente.";
    }

    public static String obtenerConfirmacionReserva(String codigoReserva) {
        return "Obteniendo confirmación de reserva para el código " + codigoReserva + System.lineSeparator() + "Confirmación de reserva obtenida.";
    }
}
