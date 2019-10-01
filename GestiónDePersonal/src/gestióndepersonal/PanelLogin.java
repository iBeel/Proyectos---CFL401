/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestióndepersonal;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CFL 401
 */
public class PanelLogin extends javax.swing.JPanel {

    /**
     * Creates new form panelLogin
     */
    public PanelLogin() {
        initComponents();
        
        DatosDeConexion datosConex = new DatosDeConexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fieldContrasenia = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridLayout(8, 1));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1);

        fieldUsuario.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel1.add(fieldUsuario);

        add(jPanel1);

        jPanel2.setPreferredSize(null);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel2.setText("Contraseña:");
        jPanel2.add(jLabel2);

        fieldContrasenia.setMinimumSize(new java.awt.Dimension(100, 20));
        fieldContrasenia.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel2.add(fieldContrasenia);

        add(jPanel2);

        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        add(btnIngresar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        add(btnCancelar);

        btnConfig.setText("Configuración");
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
        });
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        add(btnConfig);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PJS");
        add(jLabel3);

        labelEstado.setText("Desconectado");
        add(labelEstado);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        
        DatosDeConexion datosConex = new DatosDeConexion();
        GestionDePersonal.getVentanaPrincipal().setVisible(false);
        datosConex.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnConfigMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        
        System.exit(1);
        
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
       
        try {
            String usuario= fieldUsuario.getText();
            String contra= fieldContrasenia.getText();
            
            ResultSet resultado =GestionDePersonal.getConexionDB().consultar("SELECT * FROM accesos WHERE usuario= '"+usuario+"' AND contrasenia='"
                    + contra+"';");
            if (resultado.next()){
                labelEstado.setText("Accediste");
                GestionDePersonal.getVentanaPrincipal().mostrarPanelOpciones();
                
            }
            else
            labelEstado.setText("Error al acceder");
            
        } catch (SQLException ex) {
            System.out.println("No se pudo consultar");
        }
        
        
        
     
        
       
       
       
       
        
        
        
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        
        
        
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    public void cambiarTextoEstado(String texto){
    
    
    GestionDePersonal.getVentanaPrincipal().getComponent(0);
            
    
    
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JTextField fieldContrasenia;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelEstado;
    // End of variables declaration//GEN-END:variables
}
