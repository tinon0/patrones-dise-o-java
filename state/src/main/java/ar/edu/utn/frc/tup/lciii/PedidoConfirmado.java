package ar.edu.utn.frc.tup.lciii;

public class PedidoConfirmado implements EstadoPedido{
    @Override
    public String confirmar() {
        return "Confirmacion de Pedido";
    }

    @Override
    public String enviar() {
        return "Pedido por enviar";
    }

    @Override
    public String entregar() {
        return "Pedido por entregar";
    }
}
