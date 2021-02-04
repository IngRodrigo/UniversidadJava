
package ForEach.domain;

public class Persona {
    private String nombre;

    public Persona(String persona){
        this.nombre=persona;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
}
