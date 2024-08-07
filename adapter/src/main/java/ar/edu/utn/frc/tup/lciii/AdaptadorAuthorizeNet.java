package ar.edu.utn.frc.tup.lciii;

public class AdaptadorAuthorizeNet implements PasarelaPago{

    @Override
    public String iniciarPago() {
        return "Pago por AuthorizeNet iniciado";
    }

    @Override
    public String procesarPago() {
        return "Pago por AuthorizeNet procesandose";
    }

    @Override
    public String confirmarPago() {
        return "Pago por AuthorizeNet confirmado!";
    }
}
