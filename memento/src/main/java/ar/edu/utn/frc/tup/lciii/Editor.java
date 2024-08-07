package ar.edu.utn.frc.tup.lciii;

import java.util.Stack;

public class Editor {
    private Stack<Documento.Memento> estado;
    private Documento documento;

    public Editor(){
        estado = new Stack<>();
        documento = new Documento();
    }

    public void escribir(String texto){
        estado.add(documento.guardar());
        documento.escribir(texto);
    }
    public String mostrar(){
        return documento.getTexto();
    }
    public void deshacer(){
        documento.restaurar(estado.pop());
    }
}
