package ar.edu.utn.frc.tup.lciii;

public interface Mediator {
    void registrarUsuario(Usuario usuario);
    void enviarMensaje(String mensaje, Usuario usuario);
}
