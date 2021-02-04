package ForEach.Test;

import ForEach.domain.Persona;

public class Test {
    public static void main(String[] args) {
        int edades[]={5,2,3,5,4};
        //creamos una variable en la que ira almacenado cada uno de los elementos por eso debe ser del mismo tipo 
        //que el elemento en cuestion en este caso int
        for(int edad:edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[]={new Persona("Rodrigo"), new Persona("Tania")};
        for(Persona persona:personas){
            System.out.println("persona = " + persona.toString());
        }
    }
    
}
