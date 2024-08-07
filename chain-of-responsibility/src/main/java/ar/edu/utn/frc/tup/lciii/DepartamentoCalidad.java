package ar.edu.utn.frc.tup.lciii;

public class DepartamentoCalidad implements ManejadorReembolso{
    private ManejadorReembolso siguiente;
    @Override
    public void manejarReembolso(Reembolso reembolso) {
        if (reembolso.getDetalles().equals("Calidad")){
            System.out.println("Reembolso ID: " + reembolso.getId() + " procesado por Calidad");
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
