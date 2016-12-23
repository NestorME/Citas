
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GilG
 */
public class Medicamentos extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public Medicamentos() {
        initComponents();
    }
    
     void Limpiar(){
         textFieldCod.setText("");
         textFieldNom.setText("");
         textFieldForm.setText("");
         textFieldDispo.setText("");
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldCod = new java.awt.TextField();
        textFieldNom = new java.awt.TextField();
        textFieldForm = new java.awt.TextField();
        textFieldDispo = new java.awt.TextField();
        buttonEliminar = new java.awt.Button();
        jButtonAgregar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldCodKeyPressed(evt);
            }
        });
        getContentPane().add(textFieldCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 75, 68, -1));
        getContentPane().add(textFieldNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 114, 100, -1));
        getContentPane().add(textFieldForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 156, 108, -1));

        textFieldDispo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldDispoKeyPressed(evt);
            }
        });
        getContentPane().add(textFieldDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 195, 45, -1));

        buttonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        buttonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminar.setLabel("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 70, 30));

        jButtonAgregar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico_agregar.jpg"))); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButtonBuscar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_buscar.gif"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fórmula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Disponibles");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Medicinas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
       
        String codigo; 
        codigo=textFieldCod.getText();
     
        if(codigo.equals("")){
     JOptionPane.showOptionDialog(this, "Ingrese el codigo del paciente ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
         
     }
     else{
     String url = "jdbc:mysql://localhost:3306/hospital";
     String usuario = "root";
     String contraseña = ""; 
     
     try {
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (InstantiationException ex) {
        Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
         }
        try {
            conn = DriverManager.getConnection(url,usuario,contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
if(conn != null)
    System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
    
     try {
         stmt = conn.createStatement();
           stmt.executeUpdate("DELETE FROM Medicamentos WHERE cod_medi = '"+codigo+"' ");
            
        } catch (SQLException ex) {
            Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        
        }
     finally{
    if(conn != null){
        try{
            conn.close();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }
        }
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void textFieldCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCodKeyPressed
        char del=127;
        Pattern pat= Pattern.compile("\\d*["+del+"]*");
        Matcher mat=pat.matcher(textFieldCod.getText());
        if(mat.matches()) {
             } else {
            JOptionPane.showOptionDialog(this, "Ingrese solo numeros ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             }
    }//GEN-LAST:event_textFieldCodKeyPressed

    private void textFieldDispoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldDispoKeyPressed
        char del=127;
        Pattern pat= Pattern.compile("\\d*["+del+"]*");
        Matcher mat=pat.matcher(textFieldDispo.getText());
        if(mat.matches()) {
             } else {
            JOptionPane.showOptionDialog(this, "Ingrese solo numeros ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             }
    }//GEN-LAST:event_textFieldDispoKeyPressed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        
        String codigo,nombre, formula,disponibles;
      
        codigo=textFieldCod.getText();
        disponibles=textFieldDispo.getText();
        nombre=textFieldNom.getText();
        formula=textFieldForm.getText();
        
        if(codigo.equals("")){
           if(disponibles.equals("")||nombre.equals("")||formula.equals("")){
             JOptionPane.showOptionDialog(this, "por favor llene todos los campos ", "Usuario agregado", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
      
           }
          else{
        try{
String url = "jdbc:mysql://localhost:3306/hospital";
String usuario = "root";
String contraseña = "";
         try {
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (InstantiationException | IllegalAccessException ex) {
        Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
         }
conn = DriverManager.getConnection(url,usuario,contraseña);
if(conn != null)
    System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
stmt = conn.createStatement();
stmt.executeUpdate("INSERT INTO Medicamentos VALUES(NULL,'"+nombre+"','"+formula+"','"+disponibles+"')");
       System.out.println("Los datos fueron agregados");
       rs=stmt.executeQuery("select cod_medi from medicamentos;");
            while(rs.next()){
                codigo= rs.getString(1);
            }
            Limpiar();
}
  catch(SQLException e){
      e.printStackTrace();
  }
   finally{
    if(conn != null){
        try{
            JOptionPane.showOptionDialog(this, "Datos guardados codigo del Medicameto "+codigo, "Medicamento agregado", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
      
             textFieldNom.setText("");
                textFieldForm.setText("");
                textFieldDispo.setText("");
            conn.close();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        }
          }
        }else{
        JOptionPane.showOptionDialog(this, "El codigo se agrega automaticamete deje el campo vacio", "No agregue codigo", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
      
        
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        String nombre, formula, codigo, disponibles;
     
     codigo=textFieldCod.getText();
     
     if(codigo.equals("")){
         JOptionPane.showOptionDialog(this, "Ingrese el codigo del paciente ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             
     }else{
     String url = "jdbc:mysql://localhost:3306/hospital";
     String usuario = "root";
     String contraseña = ""; 
     
     try {
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (InstantiationException ex) {
        Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
         }
        try {
            conn = DriverManager.getConnection(url,usuario,contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
if(conn != null)
    System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
    
     try {
         stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Medicamentos WHERE cod_medi= '"+codigo+"' ");
            while(rs.next()){
                nombre= rs.getString(2);
                formula= rs.getString(3);
                disponibles= rs.getString(4);
                
                textFieldNom.setText(nombre);
                textFieldForm.setText(formula);
               // textFieldDispo.setText(disponibles);
                
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        
        }
     finally{
    if(conn != null){
        try{
            conn.close();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }
     }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonEliminar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private java.awt.TextField textFieldCod;
    private java.awt.TextField textFieldDispo;
    private java.awt.TextField textFieldForm;
    private java.awt.TextField textFieldNom;
    // End of variables declaration//GEN-END:variables
}
