package ar.edu.utn.frc.tup.lciii;

import java.util.HashMap;
import java.util.Map;

public class RegistroPrototipos {
    private Map<String, Documento> registroPrototipos = new HashMap<>();

    public RegistroPrototipos(){
        registroPrototipos.put("Reporte A", new Reporte());
        registroPrototipos.put("Contrato A", new Contrato());
        registroPrototipos.put("Formulario A", new Formulario());
    }
    public Documento solicitar(String nombre){
        try{
            return registroPrototipos.get(nombre);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}