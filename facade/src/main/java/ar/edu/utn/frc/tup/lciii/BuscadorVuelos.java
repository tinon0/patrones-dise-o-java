package ar.edu.utn.frc.tup.lciii;

public class BuscadorVuelos {
    public static String buscarVuelosDisponibles(String origen, String destino, String fecha) {
        return "Buscando vuelos disponibles desde " + origen + " a " + destino + " para la fecha " + fecha + System.lineSeparator() + "Se encontraron vuelos disponibles.";
    }
}
