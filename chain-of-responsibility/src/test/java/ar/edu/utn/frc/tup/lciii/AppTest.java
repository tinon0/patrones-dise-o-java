package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    /* Here you will write your test */
    @Test
    void main(){
        ManejadorReembolso calidad = new DepartamentoCalidad();
        ManejadorReembolso devoluciones = new DepartamentoDevoluciones();
        ManejadorReembolso atencionCliente = new DepartamentoAtencionCliente();

        calidad.establecerSiguienteManejador(devoluciones);
        devoluciones.establecerSiguienteManejador(atencionCliente);
        atencionCliente.establecerSiguienteManejador(calidad);

        Reembolso reembolso1 = new Reembolso(1, "Devoluciones");
        Reembolso reembolso2 = new Reembolso(2, "Calidad");
        Reembolso reembolso3 = new Reembolso(3, "Atencion al Cliente");

        calidad.manejarReembolso(reembolso1);
        calidad.manejarReembolso(reembolso2);
        calidad.manejarReembolso(reembolso3);
    }
}