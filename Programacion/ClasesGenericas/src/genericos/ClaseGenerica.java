package genericos;

//<T> quiere decir que recibirar un objeto pero es generico, es decir no sabemos de que tipo sera
public class ClaseGenerica <T>{
    
    private T objeto;
    public ClaseGenerica(T objeto){
        this.objeto=objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo de elemento obtenido es:" + this.objeto.getClass().getSimpleName());
    }
    
}
