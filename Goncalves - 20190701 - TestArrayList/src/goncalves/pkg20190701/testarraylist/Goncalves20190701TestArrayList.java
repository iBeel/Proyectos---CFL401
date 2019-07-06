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
        /*ArrayList elem = new ArrayList();
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
        
        JOptionPane.showMessageDialog(null,elem2); */
     
     Persona per1 = new Persona ("José Luis",45);
     
     Persona per2 = new Persona("Marta", 53);
    
     Mascota perro1 = new Mascota ("Simón",4,2);
     
     Mascota gato1 = new Mascota ("Michi",4,1);
     
     Mascota loro = new Mascota("Verde",2,2);
     
     per1.agregarMascota(perro1);
    
     per2.agregarMascota(gato1);
     
     per1.agregarMascota(loro);
     
    //Aumentar la edad del gato.
     
     System.out.println( gato1.getEdad());
     
     //int edg = gato1.getEdad();
     
     //System.out.println(edg);
     
     //gato1.setEdad(edg);
     
     gato1.setEdad(gato1.getEdad() + 1);
     
     System.out.println( gato1.getEdad());
     
     System.out.println(per1.cantMascotas());
     
     
    }
    
    
      
      
   
        
 }
 


 



        
        
        
        
        
        
        


