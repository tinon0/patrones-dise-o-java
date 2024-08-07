package ar.edu.utn.frc.tup.lciii;


/**
 * Observer Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Producto producto = new Producto("Shampoo", 2, 0.4f);
        SujetoNotificador notificador = new SujetoNotificador();

        Gerente gerente = new Gerente("Julian");
        PersonalAlmacen personalAlmacen = new PersonalAlmacen("Geronimo");

        notificador.anadirOberver(gerente);
        notificador.anadirOberver(personalAlmacen);

        producto.setCantStock(7);
        System.out.println(notificador.notificarOberver(producto));
    }
}
