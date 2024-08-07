package ar.edu.utn.frc.tup.lciii;

/**
 * Prototype Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        RegistroPrototipos registro = new RegistroPrototipos();
        Documento clonado = registro.solicitar("Contrato A");

        System.out.println(clonado.clonar());
        System.out.println(clonado.anadir("Hola Mundo!"));
    }
}
