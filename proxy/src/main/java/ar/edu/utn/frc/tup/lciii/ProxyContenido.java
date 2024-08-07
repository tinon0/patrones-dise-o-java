package ar.edu.utn.frc.tup.lciii;

public class ProxyContenido {
    private ContenidoReal contenido;

    public ProxyContenido(){
        this.contenido = new ContenidoReal();
    }

    public String autorizacion(Usuario usuario){
        if(usuario.isEsAutorizado()){
            return contenido.acceder();
        }
        else {
            return "Acceso restringido";
        }
    }
}
