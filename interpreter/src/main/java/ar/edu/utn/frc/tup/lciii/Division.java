package ar.edu.utn.frc.tup.lciii;

public class Division extends Expresion{
    private Expresion a;
    private Expresion b;
    public Division(Expresion a, Expresion b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public int interpret() {
        int resultado = 0;
//        try {
//            resultado = a.interpret() / b.interpret();
//        }catch (ArithmeticException ex){
//            System.out.println(ex);
//        }
        resultado = a.interpret() / b.interpret();
        return resultado;
    }

    @Override
    public String toString() {
        return String.valueOf(interpret());
    }
}
