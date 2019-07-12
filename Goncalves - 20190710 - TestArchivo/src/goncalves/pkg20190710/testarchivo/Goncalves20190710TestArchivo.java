/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goncalves.pkg20190710.testarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CFL 401
 */
public class Goncalves20190710TestArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //escribirArchivoTexto();
        //leerArchivoTexto();
        ventanaLogin ventana = new ventanaLogin();
        
        ventana.setVisible(true);
        
        
        
        
    }
    
    private static void escribirArchivoTexto(){
        
        FileWriter file = null;
        PrintWriter escritor = null;
        
        try {
            file = new FileWriter ("user.txt", true); //Si hay un false el archivo se reinicia, si hay un true, continua desde antes.
            escritor = new PrintWriter(file); //El file entre paréntesis es el file de la segunda palabra de la primera línea.
            escritor.println(""); //Texto a agregar.
            escritor.flush(); //Para la información del buffer al archivo. El buffer almacena archivos pequeños.
            escritor.close(); //Cerrar el archivo.
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        
        
        }
      //escritor.print(JOptionPane.showInputDialog(null, "Escribi algo"); (Pedir por ventana).
    
        }
    
    
    private static void leerArchivoTexto(){
    
    FileReader file = null;
    BufferedReader lector = null;
    
    try{
    
    file = new FileReader("user.txt");
    lector = new BufferedReader(file);
    String texto = lector.readLine();
   
    while(texto!=null){
    
    System.out.println(texto.split(";;;")[1]); //El split separa un array. Los ; son el valor usado para separar. Los espacios también cuentan. Porque el programa va a buscar algo que no existe.
    
    texto = lector.readLine(); //Pasa a la siguiente línea. 
    
    
    
    
    
    }
    
    lector.close();
    
    }
    
   
    
    
    
    
    catch (IOException ex) {
           System.out.println(ex.getMessage());
           
        
        
        }
    
    
    
    }
    }
        
 
    
    
    

