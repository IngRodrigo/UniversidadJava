package manejoarchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo-DevCode
 */
public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Archivo Creado");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
//esta opion reemplaza el contenido del archivo cada vez que lo llamamos

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.print(contenido);
            salida.close();
            System.out.println("Archivo escrito");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //esta opcion no reemplaza el contenido lo anexa o hace append
    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Archivo anexado");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //leer el archivo
    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String salida = entrada.readLine();
            while (salida != null) {
                System.out.println(salida);
                salida = entrada.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
