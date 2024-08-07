package ar.edu.utn.frc.tup.lciii;

import java.util.Stack;

public class Parser {
    public Expresion parser(String operacion){

        Stack<Expresion> stack = new Stack<>();
        String[] signos = operacion.split(" ");

        for(String signo : signos){
            
            if (esOperador(signo)){
                Expresion a = stack.pop();
                Expresion b = stack.pop();
                Expresion nuevaExpresion = null;
                switch (signo){
                    case "+":
                        nuevaExpresion = new Suma(a,b);
                        break;
                    case "-":
                        nuevaExpresion = new Resta(a,b);
                        break;
                    case "*":
                        nuevaExpresion = new Multiplicacion(a,b);
                        break;
                    case "/":
                        nuevaExpresion = new Division(a,b);
                        break;
                }
                stack.push(nuevaExpresion);
            }

            else {
                int numero = Integer.parseInt(signo);
                stack.push(new Numero(numero));
            }
        }

        return stack.pop();
    }
    public boolean esOperador(String signo){
        return signo.equals("+") || signo.equals("-") || signo.equals("*") || signo.equals("/");
    }
}