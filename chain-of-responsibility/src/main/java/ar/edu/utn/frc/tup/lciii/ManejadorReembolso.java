package ar.edu.utn.frc.tup.lciii;

public interface ManejadorReembolso {
    void manejarReembolso(Reembolso reembolso);
    void establecerSiguienteManejador(ManejadorReembolso siguiente);
    void pasarSiguiente(Reembolso reembolso);
}
