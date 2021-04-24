package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dias = " + Dias.LUNES);
        //iniciarDiaSemana(Dias.LUNES);
        System.out.println("El continente seleccionado es: "+Continentes.AFRICA);
        System.out.println("La cantidad de paises de "+Continentes.AFRICA+" es: "+Continentes.AFRICA.getPaises());
    }
    private static void iniciarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Segundo día de la semana");
                break;
            case MARTES:
                System.out.println("Tercer día de la semana");
                break;
        }
    }
}
