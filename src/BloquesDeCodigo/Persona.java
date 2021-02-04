package BloquesDeCodigo;
//Existen bloques de codigo de inicializaicon que se ejecutan antes del constructro de la clase
public class Persona {
    //bloque de inicializacion estatico 
    public final int idPersona;
    private static int contadorPersona;
    
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
    }
    
    {
        System.out.println("Ejecucion de bloque NO estatico o dinamico");
        this.idPersona=Persona.contadorPersona++;
    }
    public Persona(){
        System.out.println("Ejecucion del constrctor");
    }

    public int getIdPersona() {
        return idPersona;
    }
}
