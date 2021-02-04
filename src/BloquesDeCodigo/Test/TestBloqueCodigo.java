package BloquesDeCodigo.Test;

import BloquesDeCodigo.Persona;

public class TestBloqueCodigo {
    public static void main(String[] args) {
        
        //El contexto estatico solo se ejecuta una vez porque esta relacionado con la clase
        Persona persona1=new Persona();
        System.out.println("persona1 = " + persona1.getIdPersona());
        
        Persona persona2=new Persona();
        System.out.println("persona2 = " + persona2.getIdPersona());
    }
    
}
