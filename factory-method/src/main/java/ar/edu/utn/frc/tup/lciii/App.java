package ar.edu.utn.frc.tup.lciii;


import ar.edu.utn.frc.tup.lciii.fabricas.FabricaCoches;
import ar.edu.utn.frc.tup.lciii.fabricas.FabricaJuguetes;
import ar.edu.utn.frc.tup.lciii.fabricas.FabricaPeluches;
import ar.edu.utn.frc.tup.lciii.juguetes.Coche;
import ar.edu.utn.frc.tup.lciii.juguetes.Juguete;
import ar.edu.utn.frc.tup.lciii.juguetes.Peluche;

/**
 * Factory Method Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        FabricaJuguetes fabricaCoches = new FabricaCoches();
        FabricaJuguetes fabricaPeluches = new FabricaPeluches();

        Juguete coche = fabricaCoches.crearJuguete();
        Juguete peluche = fabricaPeluches.crearJuguete();

        System.out.println(((Coche)coche).empaquetar());
        System.out.println(((Peluche)peluche).empaquetar());
    }
}
