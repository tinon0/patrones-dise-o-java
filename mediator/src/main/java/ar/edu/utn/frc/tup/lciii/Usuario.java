package ar.edu.utn.frc.tup.lciii;

import lombok.Setter;
@Setter
public class Usuario {
    private String nombre;
    private Mediator salaChat;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void enviarMensaje(String mensaje) {
        salaChat.enviarMensaje(mensaje, this);
    }

    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + " ha recibido: " + mensaje);
    }
}
