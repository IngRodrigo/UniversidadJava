package domain;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura a ordenador");
    
    private final String descripcion;
    
    TipoEscritura(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
