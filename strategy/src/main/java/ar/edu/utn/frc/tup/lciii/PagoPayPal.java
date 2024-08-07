package ar.edu.utn.frc.tup.lciii;

public class PagoPayPal implements EstrategiaPago{
    public String autentificacionCuenta(){
        return "Cuenta de PayPal verificada";
    }

    @Override
    public String realizarPago() {
        return "Pago de PayPal exitosamente realizado";
    }
}
