
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


public class Pacientes extends javax.swing.JFrame {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public Pacientes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldCod = new java.awt.TextField();
        textFieldNom = new java.awt.TextField();
        textFieldApe = new java.awt.TextField();
        textFieldSinto = new java.awt.TextField();
        textFieldDomi = new java.awt.TextField();
        textFieldTel = new java.awt.TextField();
        buttonEliminar = new java.awt.Button();
        jButtonAgregar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldCodKeyPressed(evt);
            }
        });
        getContentPane().add(textFieldCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 58, 60, -1));
        getContentPane().add(textFieldNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 97, 106, -1));
        getContentPane().add(textFieldApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 96, -1));
        getContentPane().add(textFieldSinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 192, 106, -1));
        getContentPane().add(textFieldDomi, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 237, 106, -1));

        textFieldTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldTelKeyPressed(evt);
            }
        });
        getContentPane().add(textFieldTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 282, 82, -1));

        buttonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        buttonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminar.setLabel("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 80, 30));

        jButtonAgregar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico_agregar.jpg"))); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));

        jButtonBuscar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_buscar.gif"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 90, 30));

        jButtonModificar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Síntoma");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Domicilio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Pacientes");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo1.jpg"))); // NOI18N
        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 410));

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
     String contraseña = "1234"; 
     
     try {
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (InstantiationException ex) {
        Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
         }
        try {
            conn = DriverManager.getConnection(url,usuario,contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
if(conn != null)
    System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
    
     try {
         stmt = conn.createStatement();
           stmt.executeUpdate("DELETE FROM Pacientes WHERE cod_paciente = '"+codigo+"' ");
            
        } catch (SQLException ex) {
            Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
        
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

    private void textFieldTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldTelKeyPressed
        char del=127;
        Pattern pat= Pattern.compile("\\d*["+del+"]*");
        Matcher mat=pat.matcher(textFieldTel.getText());
        if(mat.matches()) {
             } else {
            JOptionPane.showOptionDialog(this, "Ingrese solo numeros ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             }
    }//GEN-LAST:event_textFieldTelKeyPressed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
       
        String codigo,nombre, tel, apellido, sintoma, domicilio;
      
        codigo=textFieldCod.getText();
        tel=textFieldTel.getText();
        nombre=textFieldNom.getText();
        apellido=textFieldApe.getText();
        sintoma=textFieldSinto.getText();
        domicilio=textFieldDomi.getText();
        
      if(codigo.equals("")){
          if(tel.equals("")||nombre.equals("")||apellido.equals("")||sintoma.equals("")||domicilio.equals("")){
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
        Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
         }
conn = DriverManager.getConnection(url,usuario,contraseña);
if(conn != null)
    System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
stmt = conn.createStatement();
stmt.executeUpdate("INSERT INTO Pacientes VALUES(NULL,'"+nombre+"','"+apellido+"','"+sintoma+"','"+domicilio+"','"+tel+"')");
       System.out.println("Los datos fueron agregados");
         rs=stmt.executeQuery("select cod_paciente from pacientes;");
            while(rs.next()){
                codigo= rs.getString(1);
            }
}
  catch(SQLException e){
      e.printStackTrace();
  }
   finally{
    if(conn != null){
        try{
            JOptionPane.showOptionDialog(this, "Datos guardados codigo del Paciente "+codigo, "Usuario agregado", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
      
            conn.close();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         textFieldCod.setText("");
        textFieldTel.setText("");
        textFieldNom.setText("");
        textFieldApe.setText("");
        textFieldSinto.setText("");
        textFieldDomi.setText("");
    }
        }
          }
      }else{
          JOptionPane.showOptionDialog(this, "El codigo se agrega automaticamete deje el campo vacio", "No agregue codigo", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
      
      }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
       
        String nombre,codigo, tel, apellido, sintoma, domicilio;
      
        codigo=textFieldCod.getText();
        tel=textFieldTel.getText();
        nombre=textFieldNom.getText();
        apellido=textFieldApe.getText();
        sintoma=textFieldSinto.getText();
        domicilio=textFieldDomi.getText();
     if(codigo.equals("")){
         JOptionPane.showOptionDialog(this, "Ingrese el codigo del paciente ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
         
     }else if(tel.equals("")||nombre.equals("")||apellido.equals("")||sintoma.equals("")||domicilio.equals("")){
           JOptionPane.showOptionDialog(this, "por favor llene todos los campos ", "Usuario agregado", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
      
          }
     else{
      String url = "jdbc:mysql://localhost:3306/hospital";
     String usuario = "root";
     String contraseña = ""; 
     
     try {
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (InstantiationException ex) {
        Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
         }
        try {
            conn = DriverManager.getConnection(url,usuario,contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
if(conn != null)
    System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
    
     try {
         stmt = conn.createStatement();
           stmt.executeUpdate("UPDATE  Pacientes SET nom_paciente = ('"+nombre+"'),ape_paciente = ('"+apellido+"'),enfermedad = '"+sintoma+"'),domicilio = ('"+domicilio+"'),tel = ('"+tel+"') where cod_paciente = '"+codigo+"' ");
            
        } catch (SQLException ex) {
            Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_jButtonModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonEliminar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.TextField textFieldApe;
    private java.awt.TextField textFieldCod;
    private java.awt.TextField textFieldDomi;
    private java.awt.TextField textFieldNom;
    private java.awt.TextField textFieldSinto;
    private java.awt.TextField textFieldTel;
    // End of variables declaration//GEN-END:variables
}
