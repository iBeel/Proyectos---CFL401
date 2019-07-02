/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goncalves.pkg20190701.testarraylist;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CFL 401
 */
public class Goncalves20190701TestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList elem = new ArrayList();
         ArrayList mascotas = new ArrayList();
        //Scanner teclado = new Scanner(System.in);
        
        ArrayList <Integer> elem2 = new ArrayList();
        
        elem.add("Perro");
        elem.add(4);
        elem.add(7);
        boolean bandera = true;
        
        
        
        while(bandera){
        
            
      try{
          
      
      int num = Integer.valueOf(JOptionPane.showInputDialog("Ingrese un número"));
      
       if (num<0){
        
            bandera = false;
        
      } 
      
      else {
          
          elem2.add(num);
          
          
          
      }
      }
      
      catch(Exception e) {
      
       JOptionPane.showMessageDialog(null,"Datos Inválitos"); 

      }
      
      
     
          
          
          
          
      }                    
        
        JOptionPane.showMessageDialog(null,elem2); 
      }
    
    
      
      
   
        
 }
 


 



        
        
        
        
        
        
        


