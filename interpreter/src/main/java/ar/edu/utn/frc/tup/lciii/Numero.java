package ar.edu.utn.frc.tup.lciii;

public class Numero extends Expresion{
    private int a;

    public Numero(int a) {
        this.a = a;
    }

    @Override
    public int interpret() {
        return a;
    }

    @Override
    public String toString() {
        return String.valueOf(a);
    }
}
