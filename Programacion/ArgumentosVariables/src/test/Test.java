package test;

///Tema: vargrgs o varios argumentos
public class Test {
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4);
        imprimirNumeros(5,8,7);
        variosParametros("Rodrigo", 1,2,3,4,5,6,7,8,9,10);
    }
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            System.out.println("numero = " + numero);
            
        }
    }
    //Varios parametros sin especificar la cantidad
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero = " + numeros[i]);
        }
    }

}

