/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Datos.Conexion;

/**
 *
 * @author Rodrigo-DevCode
 */
public class Test {
    public static void main(String[] args) {
        try {
            Conexion.getConexion();
            System.out.println("Conectado");
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
