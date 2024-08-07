package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    /* Here you will write your test */
    @Test
    void buscarVuelo(){
        String mensaje = new SistemaReservasVuelosFacade().buscarVuelosDisponibles("Ciudad A", "Ciudad B", "11/11/2026");
        String respuesta = "Buscando vuelos disponibles desde Ciudad A a Ciudad B para la fecha 11/11/2026" + System.lineSeparator() + "Se encontraron vuelos disponibles.";
        assertEquals(respuesta, mensaje);
    }
    @Test
    void confirmacionReserva(){
        String mensaje = new SistemaReservasVuelosFacade().obtenerConfirmacionReserva("AASS12");
        String respuesta = "Obteniendo confirmación de reserva para el código AASS12" + System.lineSeparator() + "Confirmación de reserva obtenida.";
        assertEquals(respuesta, mensaje);
    }
    @Test
    void pago(){
        String mensaje = new SistemaReservasVuelosFacade().realizarPago(1000);
        String respuesta = "El Pago de $1000.0 se ha realizado";
        assertEquals(respuesta, mensaje);
    }
    @Test
    void codigoReserva(){
        String mensaje = new SistemaReservasVuelosFacade().realizarReserva("CDF1", 3);
        String respuesta = "Realizando reserva para el vuelo CDF1 para 3 pasajeros." + System.lineSeparator() + "Reserva realizada exitosamente.";
        assertEquals(respuesta, mensaje);
    }
}