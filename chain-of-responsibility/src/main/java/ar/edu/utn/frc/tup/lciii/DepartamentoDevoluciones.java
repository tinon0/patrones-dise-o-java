package ar.edu.utn.frc.tup.lciii;

public class DepartamentoDevoluciones implements ManejadorReembolso{
    private ManejadorReembolso siguiente;
    @Override
    public void manejarReembolso(Reembolso reembolso) {
        if (reembolso.getDetalles().equals("Devoluciones")){
            System.out.println("Reembolso ID: " + reembolso.getId() + " procesado por Devoluciones");
        }
        else {
            pasarSiguiente(reembolso);
        }
    }

    @Override
    public void establecerSiguienteManejador(ManejadorReembolso proximo) {
        this.siguiente = proximo;
    }

    @Override
    public void pasarSiguiente(Reembolso reembolso) {
        if (siguiente != null){
            siguiente.manejarReembolso(reembolso);
        }
    }
}
