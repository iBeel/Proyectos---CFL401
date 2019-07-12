/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author CFL 401
 */
public class Pup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        escribirArchivoTexto();
        leerArchivoTexto();

    }
    
     private static void escribirArchivoTexto(){
        
        FileWriter file = null;
        PrintWriter escritor = null;
        
        try {
            file = new FileWriter ("lala.txt", false);
            escritor = new PrintWriter(file);
            escritor.println(JOptionPane.showInputDialog(null, "Ingrese su nombre"));
            escritor.flush(); 
            escritor.close(); 
}
        catch (IOException ex) {
           
            
            System.out.println(ex.getMessage());
        
        
        }
        
     }
     
     
     private static void leerArchivoTexto(){
    
    FileReader file = null;
    BufferedReader lector = null;
    
    try {
    
    file = new FileReader("Lala.txt");
    lector = new BufferedReader(file);
    String texto = lector.readLine();
   
    while(texto!=null){
    
    JOptionPane.showMessageDialog(null, "Su nombre es "+ texto);
    //System.out.println(texto);
    texto = lector.readLine(); //Pasa a la siguiente línea. 
    
    
    
    }
     lector.close();
    }
    catch (IOException ex) {
           System.out.println(ex.getMessage());
           
        
        
        }
    
    
   
     
     }
     
}
     
