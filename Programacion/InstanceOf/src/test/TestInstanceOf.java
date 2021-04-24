package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado1= new Empleado("Juan", 2000);
        Empleado empleado2=new Empleado("Juan", 2000);
        
        if(empleado1==empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienen diferente referencia en memoria");
        }
        
        //equals devuelve true o false
        if(empleado1.equals(empleado2)){
            System.out.println("Son objetos iguales en contenido");
        }else{
            System.out.println("Son objetos diferentes en contenidi");
        }
        
        //hascode devuelve un numero entero por cada objeto, mediante un calculo interrno, para que sea lo mas diferente posibe a otro
        if(empleado1.hashCode()==empleado2.hashCode()){
            System.out.println("Los objetos son iguales");
        }else{
            System.out.println("Los objetos son distintos");
        }
        //la regla es que si equals devuelve true por consiguiente una comparacon con hash debe devolver true tambien
    }

}
