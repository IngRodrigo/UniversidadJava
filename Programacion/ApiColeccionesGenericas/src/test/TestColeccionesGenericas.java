/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author Rodrigo-DevCode
 */
public class TestColeccionesGenericas {

    public static void main(String[] args) {

        //Lista guarda el orden en el que se insertaron los elmentos, y es un poco mas lento por eso, tambien permite repetir datos
        //usando el elemnto generico le indicamos que la lista en este caso solo almacenta datos de tipo String
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");

        imprimir(miLista);
        //Set no guarda el orden, es mas rapido, y no permite datos duplicados, simplemente los desecha
        Set<String> miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");

        //  imprimir(miSet);
        //map no hereda de Collection si no de la clase Map
        Map<String, String> miMap = new HashMap();
        miMap.put("1", "Rodrigo");
        miMap.put("2", "Diana");
        miMap.put("3", "Johan");
        miMap.put("4", "Jhoel");

        String nombre = miMap.get("1");
        System.out.println("nombre = " + nombre);
        //imprimir todas las llaves
        imprimir(miMap.keySet());//devuleve un set
        //imprimir todos los valores
        imprimir(miMap.values());//values devuelve una coleccion
    }

    //tambien le indicamos al metodo que imprime una coleccion que la coleccion que recibira es de tipo String
    private static void imprimir(Collection<String> coleccion) {
        /*for (String object : coleccion) {
            System.out.println("object = " + object);
        }*/

        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
