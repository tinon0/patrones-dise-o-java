package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Pedido pedido = new Pedido(new PedidoConfirmado());

        System.out.println(pedido.confirmarPedido());
        System.out.println(pedido.enviarPedido());
        System.out.println(pedido.entregarEnvio());
        System.out.println();

        pedido.estadoActual(new PedidoEnviado());

        System.out.println(pedido.confirmarPedido());
        System.out.println(pedido.enviarPedido());
        System.out.println(pedido.entregarEnvio());
        System.out.println();

        pedido.estadoActual(new PedidoEntregado());

        System.out.println(pedido.confirmarPedido());
        System.out.println(pedido.enviarPedido());
        System.out.println(pedido.entregarEnvio());
        System.out.println();
    }
}
