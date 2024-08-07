package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void pedidoConfirmacion(){
        Pedido pedido = new Pedido(new PedidoConfirmado());
        String respuesta = pedido.confirmarPedido() + "\n" + pedido.enviarPedido() + "\n" + pedido.entregarEnvio();
        assertEquals("Confirmacion de Pedido\n" +
                "Pedido por enviar\n" +
                "Pedido por entregar", respuesta);
    }
    @Test
    void pedidoEnvio(){
        Pedido pedido = new Pedido(new PedidoEnviado());
        String respuesta = pedido.confirmarPedido() + "\n" + pedido.enviarPedido() + "\n" + pedido.entregarEnvio();
        assertEquals("Confirmacion Pedido Enviado\n" +
                "Pedido ya enviado\n" +
                "Pedido por entregar", respuesta);
    }
    @Test
    void pedidoEntrega(){
        Pedido pedido = new Pedido(new PedidoEntregado());
        String respuesta = pedido.confirmarPedido() + "\n" + pedido.enviarPedido() + "\n" + pedido.entregarEnvio();
        assertEquals("Confirmacion Pedido Entregado\n" +
                "Pedido ya enviado\n" +
                "Pedido Entregado!", respuesta);
    }

}