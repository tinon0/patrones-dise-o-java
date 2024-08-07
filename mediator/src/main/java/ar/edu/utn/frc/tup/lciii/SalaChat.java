package ar.edu.utn.frc.tup.lciii;

import java.util.ArrayList;
import java.util.List;

public class SalaChat implements Mediator{
    private List<Usuario> usuarios;

    public SalaChat() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);
            usuario.setSalaChat(this);
        }
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u != usuario) {
                u.recibirMensaje(mensaje);
            }
        }
    }
}
