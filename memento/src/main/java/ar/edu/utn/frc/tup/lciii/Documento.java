package ar.edu.utn.frc.tup.lciii;

import lombok.Getter;

@Getter
public class Documento {
    private String texto;
     public void escribir(String texto){
         this.texto = texto;
     }
     public Memento guardar(){
         return new Memento(this.texto);
     }
     public void restaurar(Memento memento){
         this.texto = memento.devolverTextoGuardado();
     }

     public static class Memento{
         private final String texto;
         private Memento(String textoAGuardad){
             this.texto = textoAGuardad;
         }
         private String devolverTextoGuardado(){
             return texto;
         }
     }
}
