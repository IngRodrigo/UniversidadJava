package enumeraciones;

public enum Continentes {
    AFRICA(55),
    EUROPA(56),
    ASIA(40),
    AMERICA(12),
    OCEANIA(20);
    

    private final int paises;
    //agragamos un constructor para pasarle mas parametros, en este caso la cantidad de paises por continente
    Continentes(int paises){
        this.paises=paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
