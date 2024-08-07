package ar.edu.utn.frc.tup.lciii;

public class UnidadMilitarConcreta implements UnidadMilitar{
    private String tipo;
    private int posX;
    private int posY;
    private int salud;
    public UnidadMilitarConcreta(String tipo, int posX, int posY, int salud) {
        this.tipo = tipo;
        this.posX = posX;
        this.posY = posY;
        this.salud = salud;
    }
    @Override
    public void mover(int x, int y) {
        this.posX = x;
        this.posY = y;
        System.out.println(tipo + " se movió a la posición (" + x + ", " + y + ")");
    }
    @Override
    public String atacar() {
        return tipo + " atacó al enemigo";
    }
    @Override
    public String defender() {
        return tipo + " se puso en defensiva";
    }
}
