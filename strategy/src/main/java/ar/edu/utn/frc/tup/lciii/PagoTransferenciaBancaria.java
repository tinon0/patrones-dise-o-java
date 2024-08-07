package ar.edu.utn.frc.tup.lciii;

public class PagoTransferenciaBancaria implements EstrategiaPago{
    public String tranferencia(){
        return "Transferencia aprobada";
    }

    @Override
    public String realizarPago() {
        return "Transferencia bancaria realizada con exito";
    }
}
