package ar.edu.utn.frc.tup.lciii;

public class PedidoEnviado implements EstadoPedido{
    @Override
    public String confirmar() {
        return "Confirmacion Pedido Enviado";
    }

    @Override
    public String enviar() {
        return "Pedido ya enviado";
    }

    @Override
    public String entregar() {
        return "Pedido por entregar";
    }
}
