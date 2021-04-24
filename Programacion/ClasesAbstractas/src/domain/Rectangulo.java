/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Rodrigo-DevCode
 */
public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String figura) {
        super(figura);
    }

    @Override
    public void dibujar() {
        //getClass es un metodo de la calse objeto, para poder llamar o otros metodos por ejemplo el simple nombre de a clase
         System.out.println("Estamos dibujando un: "+this.getClass().getSimpleName());
    }
    
}
