package test;

import genericos.ClaseGenerica;

/**
 *
 * @author Rodrigo-DevCode
 */
public class TestGeneric {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objeto1=new ClaseGenerica(15);
        objeto1.obtenerTipo();
        ClaseGenerica<String> objeto2=new ClaseGenerica("Parametro String");
        objeto2.obtenerTipo();
    }
}
