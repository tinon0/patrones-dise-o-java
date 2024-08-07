package ar.edu.utn.frc.tup.lciii;


/**
 * Chain Of Responsibility Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        ManejadorReembolso calidad = new DepartamentoCalidad();
        ManejadorReembolso devoluciones = new DepartamentoDevoluciones();
        ManejadorReembolso atencionCliente = new DepartamentoAtencionCliente();

        calidad.establecerSiguienteManejador(devoluciones);
        devoluciones.establecerSiguienteManejador(atencionCliente);

        Reembolso reembolso1 = new Reembolso(1, "Devoluciones");
        Reembolso reembolso2 = new Reembolso(2, "Calidad");
        Reembolso reembolso3 = new Reembolso(3, "Atencion al Cliente");

        calidad.manejarReembolso(reembolso1);
        calidad.manejarReembolso(reembolso2);
        calidad.manejarReembolso(reembolso3);
    }
}
