/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import manejoarchivos.ManejoArchivos;

/**
 *
 * @author Rodrigo-DevCode
 */
public class TestManejoArchivos {

    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        ManejoArchivos.crearArchivo(nombreArchivo);
        ManejoArchivos.anexarArchivo(nombreArchivo, "Hola desde Java");
        ManejoArchivos.anexarArchivo(nombreArchivo, "Adios desde java");
        ManejoArchivos.leerArchivo(nombreArchivo);
    }

}
