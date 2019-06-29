/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goncalves.proyecto.lunes;

/**
 *
 * @author CFL 401
 */
public class Lunes {

    
     
     public static VentanaLogin ventanaLogin = null;
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ventanaLogin = new VentanaLogin();
        
        ventanaLogin = new VentanaLogin();
        
        
        iniciar();
        
        
        
        
       
        
        
    
        
        
    }
    
    public static void iniciar(){
    
    ventanaLogin.setVisible(true);
        
                                }
  public static void mostrar(){
      
       PersonaCorta per1 = new PersonaCorta(23,"Gomez","Juan"); //Si no se ingresa un parámetro no anda porque no tiene un constructor genérico
        
       PersonaCorta per2 = new PersonaCorta(24,"Gomez","Agustin");

       PersonaCorta per3 = new PersonaCorta(100,"Gomez","Lilian");
        
       System.out.println(per1.getNombre());
        
       per3.setNombre("Yuya");
       
       System.out.println(per1.getNombre()); //Al ser estático, al modificar el nombre, todos pasan a sufrir dicha modificacion.
        
      
      
  }

}