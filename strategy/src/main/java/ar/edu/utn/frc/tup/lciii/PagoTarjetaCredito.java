package ar.edu.utn.frc.tup.lciii;

public class PagoTarjetaCredito implements EstrategiaPago{
    public String verificacionTarjeta(){
        return "Tarjeta de Credito verificada";
    }

    @Override
    public String realizarPago() {
        return "Credito realizado con exito";
    }
}
