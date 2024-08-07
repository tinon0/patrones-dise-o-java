package ar.edu.utn.frc.tup.lciii;


/**
 * Command Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Invocador mozo = new Invocador();
        Receptor equipoCocina = new Receptor();

        Comando comandoCafe = new ComandoPrepararCafe(equipoCocina);
        Comando comandoEnsalada = new ComandoPrepararEnsalada(equipoCocina);
        Comando comandoPizza = new ComandoPrepararPizza(equipoCocina);
        Comando comandoRefresco = new ComandoPrepararRefresco(equipoCocina);

        mozo.agregarOrden(comandoCafe);
        mozo.agregarOrden(comandoEnsalada);
        mozo.agregarOrden(comandoPizza);
        mozo.agregarOrden(comandoRefresco);

        mozo.ejecutarOrdenes();
    }
}
