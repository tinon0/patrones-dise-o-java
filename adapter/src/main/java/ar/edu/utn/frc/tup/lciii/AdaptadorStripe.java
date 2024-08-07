package ar.edu.utn.frc.tup.lciii;

public class AdaptadorStripe implements PasarelaPago {

    @Override
    public String iniciarPago() {
        return "Pago por Stripe iniciado";
    }

    @Override
    public String procesarPago() {
        return "Pago por Stripe procesandose";
    }

    @Override
    public String confirmarPago() {
        return "Pago por Stripe confirmado!";
    }
}
