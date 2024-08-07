package ar.edu.utn.frc.tup.lciii;

public class PedidoEntregado implements EstadoPedido{
    @Override
    public String confirmar() {
        return "Confirmacion Pedido Entregado";
    }

    @Override
    public String enviar() {
        return "Pedido ya enviado";
    }

    @Override
    public String entregar() {
        return "Pedido Entregado!";
    }
}
