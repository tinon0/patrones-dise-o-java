package ar.edu.utn.frc.tup.lciii;

public class Pedido {
    private EstadoPedido estado;
    public Pedido(EstadoPedido estado){
        this.estado = estado;
    }
    public void estadoActual(EstadoPedido estado){
        this.estado = estado;
    }
    public String confirmarPedido(){
        return estado.confirmar();
    }
    public String enviarPedido(){
        return estado.enviar();
    }
    public String entregarEnvio(){
        return  estado.entregar();
    }
}
