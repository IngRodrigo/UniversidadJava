package test;

import domain.*;

public class TestClaseObect {

    public static void main(String[] args) {
        Empleado empleado= new Escritor("Juan", 2000, TipoEscritura.CLASICO);
        
        //convertir de una clase padre a una clase hija downcasting
        Escritor escritor=(Escritor)empleado;
        escritor.getNombre();
        //convertir de una clase hija a un padre upcasting
        Empleado nuevoEmpleado=escritor;
        nuevoEmpleado.getSueldo();
    }

}
