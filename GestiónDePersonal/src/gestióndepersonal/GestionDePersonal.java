/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestióndepersonal;

import gestión.de.personal.CargaUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author CFL 401
 */
public class GestionDePersonal {
     
     private static MenuPrincipal menuPrincipal;
     private static CargaUsuario cargarUsuario;
     private static GenerarTablas generarTablas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        menuPrincipal = new MenuPrincipal();
        cargarUsuario = new CargaUsuario();
        generarTablas = new GenerarTablas();
        
        menuPrincipal.setVisible(true);
        
        
        
    }
    
    
    public static void cambiarVentana (String nombre){
    
    switch(nombre){
    
        case "menu":  ocultarVentana();
                      menuPrincipal.setVisible(true);
        
        
                       break;
                     
        case "cargarU": ocultarVentana();
                        cargarUsuario.setVisible(true);
       
        
                        break;
                     
        case "generarTabla":  ocultarVentana();
                              generarTablas.setVisible(true);
        
        
                         break;
                     
        default: JOptionPane.showMessageDialog(null,"No se encontró la opción");
                     
        
    
    
    }
    
   
    
    
    }
    
    public static void ocultarVentana(){
     
        menuPrincipal.setVisible(false);
        cargarUsuario.setVisible(false);
        generarTablas.setVisible(false);
      
    }
    
}
