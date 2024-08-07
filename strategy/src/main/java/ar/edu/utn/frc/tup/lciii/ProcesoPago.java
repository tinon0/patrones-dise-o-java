package ar.edu.utn.frc.tup.lciii;

public class ProcesoPago {
    private EstrategiaPago estrategia;
    public ProcesoPago(EstrategiaPago estrategia){
        this.estrategia = estrategia;
    }
    public String procesarPago(){
        return this.estrategia.realizarPago();
    }
    public void cambiarEstrategia(EstrategiaPago nueva){
        this.estrategia = nueva;
    }
}
