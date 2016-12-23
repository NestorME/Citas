
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


 
public class Doctores extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public Doctores() {
        initComponents();
    }
    
void Limpiar(){
         textFieldCod.setText("");
         textFieldNom.setText("");
         textFieldApe.setText("");
         textFieldEspe.setText("");
         textFieldDomi.setText("");
         textFieldTel.setText("");
         jPasswordDoctor.setText("");
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldCod = new java.awt.TextField();
        textFieldNom = new java.awt.TextField();
        textFieldApe = new java.awt.TextField();
        textFieldEspe = new java.awt.TextField();
        textFieldDomi = new java.awt.TextField();
        textFieldTel = new java.awt.TextField();
        buttonEliminar = new java.awt.Button();
        jButtonAgregar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordDoctor = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxDepen = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldCodKeyPressed(evt);
            }
        });
        getContentPane().add(textFieldCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 64, 60, -1));
        getContentPane().add(textFieldNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 102, 113, -1));
        getContentPane().add(textFieldApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 141, 113, -1));

        textFieldEspe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldEspeKeyPressed(evt);
            }
        });
        getContentPane().add(textFieldEspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 180, 113, -1));
        getContentPane().add(textFieldDomi, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 219, 113, -1));

        textFieldTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldTelKeyPressed(evt);
            }
        });
        getContentPane().add(textFieldTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 257, 87, -1));

        buttonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        buttonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminar.setLabel("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 80, 30));

        jButtonAgregar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico_agregar.jpg"))); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jButtonBuscar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_buscar.gif"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, 30));

        jButtonModificar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Especialidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Domicilio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Doctores");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jPasswordDoctor.setText("jPasswordField1");
        jPasswordDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordDoctorMouseClicked(evt);
            }
        });
        getContentPane().add(jPasswordDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dependencia");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jComboBoxDepen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Farmacia" }));
        getContentPane().add(jComboBoxDepen, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 340, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 490));

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
        Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
         }
        try {
            conn = DriverManager.getConnection(url,usuario,contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        }
if(conn != null)
    System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
    
     try {
         stmt = conn.createStatement();
           stmt.executeUpdate("DELETE FROM Doctores WHERE cod_doctor = '"+codigo+"' ");
            
        } catch (SQLException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        
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
        Matcher mat=pat.matcher(textFieldCod.getText());
        if(mat.matches()) {
             } else {
            JOptionPane.showOptionDialog(this, "Ingrese solo numeros ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             }
    }//GEN-LAST:event_textFieldTelKeyPressed

    private void textFieldEspeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldEspeKeyPressed
        char del=127;
        Pattern pat= Pattern.compile("[A-Z]*["+del+"]*");
        Matcher mat=pat.matcher(textFieldEspe.getText());
        if(mat.matches()) {
             } else {
            JOptionPane.showOptionDialog(this, "Ingrese solo mayusculas ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             }
    }//GEN-LAST:event_textFieldEspeKeyPressed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        
         String nombre,codigo, apellido, especi, domi, tel, contra, depen;
      
        tel=textFieldTel.getText();
        codigo=textFieldCod.getText();
        nombre=textFieldNom.getText();
        apellido=textFieldApe.getText();
        especi=textFieldEspe.getText();
        domi=textFieldDomi.getText();
        contra=jPasswordDoctor.getText();
        depen=jComboBoxDepen.getSelectedItem().toString();
         
       if(codigo.equals("")){
          if(tel.equals("")||nombre.equals("")||apellido.equals("")||especi.equals("")||domi.equals("")){
           JOptionPane.showOptionDialog(this, "por favor llene todos los campos ", "Usuario agregado", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
      
          }
          else{
        try{
            String url = "jdbc:mysql://localhost:3306/hospital";
            String usuario = "root";
            String contraseña = "";
         
         try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                conn = DriverManager.getConnection(url,usuario,contraseña);
              if(conn != null)
               System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
                stmt = conn.createStatement();
                stmt = conn.createStatement();
                stmt.executeUpdate("INSERT INTO Doctores VALUES(NULL,'"+nombre+"','"+apellido+"','"+especi+"','"+domi+"','"+tel+"','"+depen+"','"+contra+"')");
               System.out.println("Los datos fueron agregados");
       
                rs=stmt.executeQuery("select cod_doctor from doctores;");
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
             JOptionPane.showOptionDialog(this, "Datos guardados codigo del Doctor "+codigo, "Usuario agregado", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
      
             textFieldNom.setText("");
                textFieldApe.setText("");
                textFieldDomi.setText("");
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
        
        int  tel; 
        String codigo,nombre, apellido, especi, domi;
     
     codigo= textFieldCod.getText();
     
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
        Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
         }
        try {
            conn = DriverManager.getConnection(url,usuario,contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        }
if(conn != null)
    System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
    
     try {
         stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Doctores WHERE cod_doctor= '"+codigo+"' ");
            while(rs.next()){
                nombre= rs.getString(2);
                apellido= rs.getString(3);
                especi= rs.getString(4);
                domi= rs.getString(5);
                
                textFieldNom.setText(nombre);
                textFieldApe.setText(apellido);
                textFieldEspe.setText(especi);
                textFieldDomi.setText(domi);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        
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

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        
        String nombre, apellido, codigo, tel, espe, domi, contra;
        
       codigo=textFieldCod.getText();
       tel= textFieldTel.getText();
       nombre= textFieldNom.getText();
       apellido= textFieldApe.getText();
        espe=textFieldEspe.getText();
       domi= textFieldDomi.getText();
       contra=jPasswordDoctor.getText();
     
       if(codigo.equals("")){
         JOptionPane.showOptionDialog(this, "Ingrese el codigo del paciente ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
         
     }else if(tel.equals("")||nombre.equals("")||apellido.equals("")||espe.equals("")||domi.equals("")){
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
        Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
         }
        try {
            conn = DriverManager.getConnection(url,usuario,contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        }
if(conn != null)
    System.out.println("Se ha establecido una conexion a la base de datos" + "\n" + url);
    
     try {
         stmt = conn.createStatement();
           stmt.executeUpdate("UPDATE  Doctores SET cod_doctor=('"+codigo+"'),nom_doctor=('"+nombre+"'),ape_doctor= ('"+apellido+"'),especialidad= ('"+espe+"'),domicilio=('"+domi+"'),tel=('"+tel+"'),contraseña=('"+contra+"') where cod_doctor='"+codigo+"' ");
            
        } catch (SQLException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        
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

    private void jPasswordDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordDoctorMouseClicked
             jPasswordDoctor.setText("");
    }//GEN-LAST:event_jPasswordDoctorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonEliminar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxDepen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordDoctor;
    private java.awt.TextField textFieldApe;
    private java.awt.TextField textFieldCod;
    private java.awt.TextField textFieldDomi;
    private java.awt.TextField textFieldEspe;
    private java.awt.TextField textFieldNom;
    private java.awt.TextField textFieldTel;
    // End of variables declaration//GEN-END:variables
}
