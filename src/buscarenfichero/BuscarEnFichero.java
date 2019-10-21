/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarenfichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matt Workstation
 */
public class BuscarEnFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        if (args.length < 2) {
            System.out.println("No has pasado el fichero o las palabras a buscar.");
        }else{
            try {
                int aux = 0;
                for (int i = 1; i < args.length; i++) {
                    System.out.println("____________________________________________________________");
                    aux = 0;
                    FileWriter fichero = null;
                    PrintWriter pw = null;
                    BufferedReader fbr = new BufferedReader(new FileReader(args[0]));
                    String linea = fbr.readLine();
                    fichero = new FileWriter("./Prueba.txt");
                    pw = new PrintWriter(fichero);      
                    while(linea != null){
                        if (linea.indexOf(args[i]) > -1) {
                            System.out.println(linea);
                            pw.println("La palabra " + args[i] + " esta en la linea: " + aux
                                + " Columna: " + linea.indexOf(args[i]));
                            System.out.println("La palabra " + args[i] + " esta en la linea: " + aux
                                + " Columna: " + linea.indexOf(args[i]));
                        }
                        linea = fbr.readLine();
                        aux++;
                    }
                    fichero.close();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BuscarEnFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
