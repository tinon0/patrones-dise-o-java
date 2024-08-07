package ar.edu.utn.frc.tup.lciii;

public class AdaptadorPayPal implements PasarelaPago {
    @Override
    public String iniciarPago() {
        return "Pago por PayPal iniciado";
    }

    @Override
    public String procesarPago() {
        return "Pago por PayPal procesandose";
    }

    @Override
    public String confirmarPago() {
        return "Pago por PayPal confirmado!";
    }
}