/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Datos.*;
import domain.*;
import java.util.List;

/**
 *
 * @author Rodrigo-DevCode
 */
public class TestFundamentos {

    public static void main(String[] args) {
        //UsuarioDAO.insertar(new Usuario("Rodrigo", "rodev"));

        //UsuarioDAO.actualizar(new Usuario(3,"Jhoel", "jdev"));
        
      //  UsuarioDAO.eliminar(new Usuario(1));
       // PersonaDAO.eliminar(new Persona(2));
        List<Usuario> lista = UsuarioDAO.seleccionar();
        lista.forEach(usuario -> {
            System.out.println(usuario.toString());
        });
    }
}
