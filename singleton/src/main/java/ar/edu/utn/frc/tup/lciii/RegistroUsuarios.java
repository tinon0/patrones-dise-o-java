package ar.edu.utn.frc.tup.lciii;

public class RegistroUsuarios {
    public static RegistroUsuarios getInstance(){
        return RegistroUsuariosHolder.INSTANCE;
    }
    public static class RegistroUsuariosHolder{
        private static final RegistroUsuarios INSTANCE = new RegistroUsuarios();
    }
    private RegistroUsuarios(){}
}
