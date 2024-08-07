package ar.edu.utn.frc.tup.lciii;


/**
 * Singleton Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        RegistroUsuarios registro1 = RegistroUsuarios.getInstance();
        RegistroUsuarios registro2 = RegistroUsuarios.getInstance();

        if(registro2 == registro2){
            System.out.println("Apuntan a la misma direccion de memoria");
        }
        else {
            System.out.println("Algo salio mal");
        }
    }
}
