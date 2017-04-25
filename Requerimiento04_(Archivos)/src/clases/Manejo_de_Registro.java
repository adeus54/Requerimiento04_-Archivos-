package clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Manejo_de_Registro {

    FileWriter flwriter;
    private Scanner entrada;

    public void AbrirArchivo() {

        try {
            //Crea el archivo
            flwriter = new FileWriter("Factura.txt");
        } catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } catch (IOException e) {
            System.out.println(e);
        }// fin de catch
    }

    public void Agregar_Registros(String s) {
        try {
            //crea un buffer o flujo intermedio antes de escribir en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            //Aqui va las funciones (buffer.write)

            bfwriter.write(s);

            //cierra el buffer intermedio
            bfwriter.close();
            System.out.println("\nArchivo creado");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
        } // fin de catch
        finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public void leerArchivo(String archivo) {
        try {
            entrada = new Scanner(new File(archivo + ".txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                ArrayList<String> linea_partes = new ArrayList<>(Arrays.asList(linea.split(",")));

                // Lectura del fichero
                System.out.println(linea_partes);
            } // fin de try
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            if (entrada != null) {
                entrada.close(); //cierra el archivo
            }
        }
    }
}
