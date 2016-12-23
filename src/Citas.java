
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class Citas extends javax.swing.JFrame {

    int pa,me;
    boolean ban=true;
    
    public Citas() {
        initComponents();
        nombrePac();
        nombreDoc();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button4 = new java.awt.Button();
        textField1 = new java.awt.TextField();
        button5 = new java.awt.Button();
        button3 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        label1 = new java.awt.Label();
        button10 = new java.awt.Button();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        textField7 = new java.awt.TextField();
        textField8 = new java.awt.TextField();
        textField9 = new java.awt.TextField();
        textField10 = new java.awt.TextField();
        label6 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        label7 = new java.awt.Label();
        button11 = new java.awt.Button();
        textField11 = new java.awt.TextField();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        choice1 = new javax.swing.JComboBox<>();
        choice2 = new javax.swing.JComboBox<>();
        button16 = new java.awt.Button();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 827, 226));

        button1.setLabel("consultar medico");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 10, 141, -1));

        button2.setLabel("Mostras todos los medicamentos");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 231, -1));

        button4.setLabel("consultar todas las  citas");
        button4.setName(""); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 400, 230, 41));

        textField1.setForeground(new java.awt.Color(102, 102, 102));
        textField1.setText("Ingrese Nombre");
        textField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField1MouseClicked(evt);
            }
        });
        getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 14, 137, -1));

        button5.setLabel("Mostrar todos los medicos");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        getContentPane().add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 231, -1));

        button3.setLabel("Mostrar todo el personal");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 231, -1));

        button6.setLabel("Mostrar todos los pacientes");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        getContentPane().add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 231, -1));

        button7.setLabel("consultar personal");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        getContentPane().add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 141, -1));

        button8.setLabel("consultar paciente");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        getContentPane().add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 141, -1));

        button9.setLabel("consultar medicamento");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        getContentPane().add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 141, -1));

        textField2.setForeground(new java.awt.Color(102, 102, 102));
        textField2.setText("Ingrese Codigo");
        textField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField2MouseClicked(evt);
            }
        });
        textField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField2KeyPressed(evt);
            }
        });
        getContentPane().add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 130, -1));

        textField3.setForeground(new java.awt.Color(102, 102, 102));
        textField3.setText("Ingrese Nombre");
        textField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField3MouseClicked(evt);
            }
        });
        getContentPane().add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 137, -1));

        textField4.setForeground(new java.awt.Color(102, 102, 102));
        textField4.setText("Ingrese Nombre");
        textField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField4MouseClicked(evt);
            }
        });
        getContentPane().add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 137, -1));

        label1.setBackground(new java.awt.Color(0, 204, 204));
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Fecha");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 489, -1, -1));

        button10.setBackground(new java.awt.Color(51, 255, 153));
        button10.setForeground(new java.awt.Color(255, 255, 255));
        button10.setLabel("Agregar cita");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        getContentPane().add(button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 477, 154, 32));

        label2.setBackground(new java.awt.Color(102, 204, 255));
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("ó");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        label3.setBackground(new java.awt.Color(102, 204, 255));
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("ó");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 52, -1, -1));

        label4.setBackground(new java.awt.Color(102, 204, 255));
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("ó");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 96, -1, -1));

        label5.setBackground(new java.awt.Color(102, 204, 255));
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("ó");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 134, -1, -1));

        textField7.setForeground(new java.awt.Color(102, 102, 102));
        textField7.setText("Ingrese Codigo");
        textField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField7MouseClicked(evt);
            }
        });
        textField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField7KeyPressed(evt);
            }
        });
        getContentPane().add(textField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 14, 130, -1));

        textField8.setForeground(new java.awt.Color(102, 102, 102));
        textField8.setText("Ingrese Codigo");
        textField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField8MouseClicked(evt);
            }
        });
        textField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField8KeyPressed(evt);
            }
        });
        getContentPane().add(textField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 130, -1));

        textField9.setForeground(new java.awt.Color(102, 102, 102));
        textField9.setText("Ingrese Codigo");
        textField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField9MouseClicked(evt);
            }
        });
        textField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField9KeyPressed(evt);
            }
        });
        getContentPane().add(textField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 130, -1));

        textField10.setForeground(new java.awt.Color(102, 102, 102));
        textField10.setText("Ingrese Nombre");
        textField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField10MouseClicked(evt);
            }
        });
        getContentPane().add(textField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 137, -1));

        label6.setBackground(new java.awt.Color(102, 255, 255));
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Hora");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 489, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " ", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 489, 47, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        label7.setBackground(new java.awt.Color(0, 204, 255));
        label7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText(":");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 10, 30));

        button11.setLabel("Limpiar citas de ayer ");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });
        getContentPane().add(button11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 150, 40));

        textField11.setForeground(new java.awt.Color(102, 102, 102));
        textField11.setText("Ingrese Numero de Cita");
        textField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField11MouseClicked(evt);
            }
        });
        textField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField11KeyPressed(evt);
            }
        });
        getContentPane().add(textField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, 150, -1));

        button12.setLabel("Buscar");
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });
        getContentPane().add(button12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 401, 84, -1));

        button13.setLabel("Consultar Citas");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });
        getContentPane().add(button13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        button14.setLabel("Consultar Citas");
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });
        getContentPane().add(button14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        button15.setBackground(new java.awt.Color(255, 0, 0));
        button15.setForeground(new java.awt.Color(255, 255, 255));
        button15.setLabel("Salir");
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });
        getContentPane().add(button15, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 474, 150, 30));

        getContentPane().add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 210, -1));

        getContentPane().add(choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 180, -1));

        button16.setLabel("Consultar citas de hoy");
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });
        getContentPane().add(button16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 140, 40));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 200, -1));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 890, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Doctores");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i < cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    }//GEN-LAST:event_button5ActionPerformed

    private void textField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField2KeyPressed
        
         char del=127;
        Pattern pat= Pattern.compile("\\d*["+del+"]*");
        Matcher mat=pat.matcher(textField2.getText());
        if(mat.matches()) {
            ban=true;
             } else if(ban==true) {
            JOptionPane.showOptionDialog(this, "Ingrese solo numeros ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             ban=false;
             }
    }//GEN-LAST:event_textField2KeyPressed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Medicamentos");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Personal");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    }//GEN-LAST:event_button3ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Pacientes");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    }//GEN-LAST:event_button6ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String nombre=textField1.getText();
        String codigo=textField7.getText();
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
        if(nombre.equals("Ingrese Nombre")&&codigo.equals("Ingrese Codigo")){
      JOptionPane.showOptionDialog(this, "llene un espacio ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             
    }
        else if(codigo.equals("Ingrese Codigo")||codigo.equals("")){
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Doctores where nom_doctor=('"+nombre+"')");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i < cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
 
} catch (Exception ex) {
 ex.printStackTrace();
}
    }
    else{ 
        try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Doctores where cod_doctor=('"+codigo+"')");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i < cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}

}
        textField7.setText("Ingrese Codigo");
        textField1.setText("Ingrese Nombre");
    }//GEN-LAST:event_button1ActionPerformed

    private void textField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseClicked
        textField1.setText("");
    }//GEN-LAST:event_textField1MouseClicked

    private void textField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField2MouseClicked
       textField2.setText("");
    }//GEN-LAST:event_textField2MouseClicked

    private void textField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField3MouseClicked
        textField3.setText("");
    }//GEN-LAST:event_textField3MouseClicked

    private void textField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField4MouseClicked
        textField4.setText("");
    }//GEN-LAST:event_textField4MouseClicked

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        String codigo=textField2.getText();
        String nombre=textField10.getText();
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
       
        if(nombre.equals("")||nombre.equals("Ingrese Nombre")&&codigo.equals("")||codigo.equals("Ingrese Codigo")){
      JOptionPane.showOptionDialog(this, "llene un espacio ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             
    }
       else if(nombre.equals("Ingrese Nombre")|| nombre.equals("")){
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Medicamentos where cod_medi=('"+codigo+"')");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
        }else{
            try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Medicamentos where nom_medi=('"+nombre+"')");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
        
        }
        textField2.setText("Ingrese Codigo");
        textField10.setText("Ingrese Nombre");
    }//GEN-LAST:event_button9ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        String nombre=textField3.getText();
        String codigo=textField8.getText();
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
        if(nombre.equals("")||nombre.equals("Ingrese Nombre")&&codigo.equals("")||codigo.equals("Ingrese Codigo")){
      JOptionPane.showOptionDialog(this, "llene un espacio ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             
    }else if(codigo.equals("Ingrese Codigo")||codigo.equals("")){
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Personal where nom_personal=('"+nombre+"')");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
        }else{
            try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Personal where cod_personal=('"+codigo+"')");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
        }
        textField8.setText("Ingrese Codigo");
        textField3.setText("Ingrese Nombre");
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        String nombre=textField4.getText();
        String codigo=textField9.getText();
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
        if(nombre.equals("")||nombre.equals("Ingrese Nombre")&&codigo.equals("")||codigo.equals("Ingrese Codigo")){
      JOptionPane.showOptionDialog(this, "llene un espacio ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             
    }
      else if(codigo.equals("Ingrese Codigo")||codigo.equals("")){
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Pacientes where nom_paciente=('"+nombre+"')");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
        }else{
            try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Pacientes where cod_paciente=('"+codigo+"')");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (int i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 while (rs.next()) {
  Object[] fila = new Object[cantidadColumnas];
  for (int i = 0; i < cantidadColumnas; i++) {
    fila[i]=rs.getObject(i+1);
  }
  modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
        }
        textField9.setText("Ingrese Codigo");
        textField4.setText("Ingrese Nombre");
    }//GEN-LAST:event_button8ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        String nombrePa;
        String nombreDoc; 
        boolean ban1=true,ban2=true;
        int i=0;
        Connection con=null;
        Statement stmt=null;
         Statement stmt1=null;
          Statement stmt2=null;
        ResultSet rs=null;
        ResultSet rs1=null;
        ResultSet rs2=null;
        
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Citas");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 Object[] fila = new Object[cantidadColumnas];
 
 while (rs.next()) {
     
    fila[0]=rs.getObject(0+1);
    nombrePa=rs.getString(1+1);
    nombreDoc=rs.getString(2+1);
    fila[3]=rs.getObject(3+1);
    fila[4]=rs.getObject(4+1);
    stmt1=con.createStatement();
            rs1=stmt1.executeQuery("select nom_paciente from Pacientes where cod_paciente='"+nombrePa+"'");
            while (rs1.next()) {
    fila[1]=rs1.getObject(0+1);
    }
            stmt2=con.createStatement();
            rs2=stmt2.executeQuery("select nom_doctor from Doctores where cod_doctor='"+nombreDoc+"'");
             while (rs2.next()) {
    fila[2]=rs2.getObject(0+1); 
             }
    modelo.addRow(fila);

 }           
  
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    }//GEN-LAST:event_button4ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
         String codigoDoc="0",codigoCon="0"; 
        boolean bandera1=false, bandera2=false, bandera3=false;
        String sistema;
        String nombrePa=(String)choice1.getSelectedItem();
        String nomp="";
        String nombreDoc=(String)choice2.getSelectedItem();
        String nomd="";
         String fecha,horario="",M_V="";
       
        fecha = fechaMySQL(jDateChooser1,bandera2);
        
        int dia,mes,annio,hora, minutos,AM_PM;
        Object e = jComboBox1.getSelectedItem();
        String hr = String.valueOf(e);
        int horaS=Integer.parseInt(hr);
        Object e1 = jComboBox2.getSelectedItem();
        String min = String.valueOf(e1);
        int minS=Integer.parseInt(min);
        Object e2 = jComboBox3.getSelectedItem();
        String M_T = String.valueOf(e2);
         
         
         
        
            Calendar c1 = Calendar.getInstance();
        dia = c1.get(Calendar.DAY_OF_MONTH);
        mes = c1.get(Calendar.MONTH)+1;
        annio = c1.get(Calendar.YEAR);
        hora =c1.get(Calendar.HOUR);
        minutos = c1.get(Calendar.MINUTE);
        AM_PM = c1.get(Calendar.AM_PM);
   
    
    if (AM_PM==0){
         M_V="AM";
         }else if(AM_PM==1){
         M_V="PM";
         }
     
    if(mes<=9&&dia<=9){
           sistema=annio+"/0"+mes+"/0"+dia;
    }else if(dia<=9){
           sistema=annio+"/"+mes+"/0"+dia;
    }else if(mes<=9){
           sistema=annio+"/0"+mes+"/"+dia;
    }else{
           sistema=annio+"/"+mes+"/"+dia;
    }
    if(fecha!=null){
    if(fecha.compareTo(sistema)==0){
       if(M_V.equals(M_T)){
           if(horaS==hora){
               if(minutos<minS){
                   bandera3=true;
               }
            }else if(horaS>hora){
             bandera3=true;
           }  
       }else if(M_V.equals("AM")&&M_T.equals("PM")){
           bandera3=true;
       }else if(M_V.equals("PM")){
           bandera3=true;
       }
    }else {
    bandera3=true;
    }
    if(minS<=9){
    horario=(horaS+":0"+minS+" "+M_T);}
    else{
        horario=(horaS+":"+minS+" "+M_T);}
     }else{
        JOptionPane.showOptionDialog(this, "Ingrese una fecha", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             
    }
    
    
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
         
     try {

 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select cod_doctor from doctores where nom_doctor='"+nombreDoc+"'");
          

 while (rs.next()) {
  codigoDoc = rs.getString("cod_doctor");
  
  
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    try {

 
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 
 stmt=con.createStatement();
            rs=stmt.executeQuery("select cod_doctor from citas where fecha='"+fecha+"'&& hora_cita='"+horario+"'");
          

 while (rs.next()) {
  codigoCon = rs.getString("cod_doctor");
  
  
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
       
     System.out.println(codigoDoc);
      System.out.println(codigoCon);
   
  if(fecha!=null){ 
   if(codigoDoc.compareTo(codigoCon)!=0){
    if(fecha.compareTo(sistema)>=0&&bandera3==true) {
        
     try {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");

 stmt=con.createStatement();
            rs=stmt.executeQuery("select nom_paciente from Pacientes where nom_paciente=('"+nombrePa+"')");
            while(rs.next()){
               nomp=rs.getString(1);
             }
          
            if(nomp.equals(nombrePa)){    
              stmt=con.createStatement();
            rs=stmt.executeQuery("select cod_paciente from Pacientes where nom_paciente=('"+nombrePa+"')");
             while(rs.next()){
            nombrePa=rs.getString(1);
             }
          pa=Integer.parseInt(nombrePa);
          bandera1=true;
          }else{
          JOptionPane.showOptionDialog(this, "Paciente no existe", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             
          }
          
          
     
} catch (Exception ex) {
 ex.printStackTrace();
}
    
     if(bandera1==true){
      try {
 //Para establecer el modelo al JTable
         
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select nom_doctor from Doctores where nom_doctor=('"+nombreDoc+"')");
          while(rs.next()){
               nomd=rs.getString(1);
             }
          
            if(nomd.equals(nombreDoc)){  
              stmt=con.createStatement();
            rs=stmt.executeQuery("select cod_doctor from Doctores where nom_doctor=('"+nombreDoc+"')");
             while(rs.next()){
            nombreDoc=rs.getString(1);
             bandera2=true;
             }
          me=Integer.parseInt(nombreDoc);
          }else{
          JOptionPane.showOptionDialog(this, "Doctor no existe", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             
          }
          
         
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
     }
     if (bandera2==true){
         
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            } catch (SQLException ex) {
                Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt = con.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.executeUpdate("INSERT INTO Citas VALUES(NULL,'"+pa+"','"+me+"','"+fecha+"','"+horario+"')");
                
                rs.close();
               con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
            }
       System.out.println("Los datos fueron agregados");
       choice1.setSelectedIndex(0);
     choice2.setSelectedIndex(0);
     jComboBox1.setSelectedIndex(0);
     jComboBox2.setSelectedIndex(0);
     jComboBox3.setSelectedIndex(0);
      
     }
    }else{
        JOptionPane.showOptionDialog(this, "La fecha o la hora es incorrecta", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
           
    }
    }else{
            JOptionPane.showOptionDialog(this, "Ese horario ya esta ocupado", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
        
    }
   
    }
    }//GEN-LAST:event_button10ActionPerformed

    private void textField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField7MouseClicked
        textField7.setText("");
    }//GEN-LAST:event_textField7MouseClicked

    private void textField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField7KeyPressed
        
         char del=127;
        Pattern pat= Pattern.compile("\\d*["+del+"]*");
        Matcher mat=pat.matcher(textField7.getText());
        if(mat.matches()) {
            ban=true;
             } else if(ban==true) {
            JOptionPane.showOptionDialog(this, "Ingrese solo numeros ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             ban=false;
             }
       
    }//GEN-LAST:event_textField7KeyPressed

    private void textField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField8MouseClicked
        textField8.setText("");
    }//GEN-LAST:event_textField8MouseClicked

    private void textField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField8KeyPressed
       
         char del=127;
        Pattern pat= Pattern.compile("\\d*["+del+"]*");
        Matcher mat=pat.matcher(textField8.getText());
        if(mat.matches()) {
            ban=true;
             } else if(ban==true) {
            JOptionPane.showOptionDialog(this, "Ingrese solo numeros ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             ban=false;
             }
    
    }//GEN-LAST:event_textField8KeyPressed

    private void textField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField9MouseClicked
        textField9.setText("");
    }//GEN-LAST:event_textField9MouseClicked

    private void textField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField9KeyPressed
        
         char del=127;
        Pattern pat= Pattern.compile("\\d*["+del+"]*");
        Matcher mat=pat.matcher(textField9.getText());
        if(mat.matches()) {
            ban=true;
             } else if(ban==true) {
            JOptionPane.showOptionDialog(this, "Ingrese solo numeros ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             ban=false;
             }
    
    }//GEN-LAST:event_textField9KeyPressed

    private void textField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField10MouseClicked
        textField10.setText("");
    }//GEN-LAST:event_textField10MouseClicked

    private void textField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField11MouseClicked
        textField11.setText("");
    }//GEN-LAST:event_textField11MouseClicked

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        String nombrePa;
        String nombreDoc; 
        String NumeroCita=textField11.getText();
        int i=0;
        Connection con=null;
        Statement stmt=null;
         Statement stmt1=null;
          Statement stmt2=null;
        ResultSet rs=null;
        ResultSet rs1=null;
        ResultSet rs2=null;
        
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Citas where numCita='"+NumeroCita+"' ");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 Object[] fila = new Object[cantidadColumnas];
 
 while (rs.next()) {
     
    fila[0]=rs.getObject(0+1);
    nombrePa=rs.getString(1+1);
    nombreDoc=rs.getString(2+1);
    fila[3]=rs.getObject(3+1);
    fila[4]=rs.getObject(4+1);
    stmt1=con.createStatement();
            rs1=stmt1.executeQuery("select nom_paciente from Pacientes where cod_paciente='"+nombrePa+"'");
            while (rs1.next()) {
    fila[1]=rs1.getObject(0+1);
    }
            stmt2=con.createStatement();
            rs2=stmt2.executeQuery("select nom_doctor from Doctores where cod_doctor='"+nombreDoc+"'");
             while (rs2.next()) {
    fila[2]=rs2.getObject(0+1); 
             }
    modelo.addRow(fila);

 }
           
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    }//GEN-LAST:event_button12ActionPerformed

    private void textField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField11KeyPressed

         char del=127;
        Pattern pat= Pattern.compile("\\d*["+del+"]*");
        Matcher mat=pat.matcher(textField11.getText());
        if(mat.matches()) {
               ban=true;
             } else if(ban==true) {
            JOptionPane.showOptionDialog(this, "Ingrese solo numeros ", "Precaucion", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
             ban=false;
             }
    }//GEN-LAST:event_textField11KeyPressed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
         Connection con=null;
        Statement stmt=null;
        
        try{
            String url="jdbc:mysql://localhost:3306/hospital";
            String usuario="root";
            String contraseña="";
            try {
                
              Class.forName("com.mysql.jdbc.Driver").newInstance();
                
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
            }
            con=DriverManager.getConnection(url,usuario,contraseña);
            if(con !=  null)
                System.out.println("se ha establecido conexion a la base de datos"+"\n"+url);
            
            stmt=con.createStatement();
            stmt.executeUpdate("delete from citas where fecha<(SELECT date_add(NOW(), INTERVAL -1 DAY))");
            
            System.out.println("los valores han sido modificados"+"\n");
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
        if (con != null){
            try{
              con.close();
              stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
     
        
    
          
          
 
    }//GEN-LAST:event_button11ActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        this.dispose();
    }//GEN-LAST:event_button15ActionPerformed

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
         String nombrePa;
        String nombreDoc; 
        boolean ban1=true,ban2=true;
        int i=0;
        Connection con=null;
        Statement stmt=null;
         Statement stmt1=null;
          Statement stmt2=null;
        ResultSet rs=null;
        ResultSet rs1=null;
        ResultSet rs2=null;
        
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Citas where fecha<=sysdate();");
          
 //Obteniendo la informacion de las columnas que estan siendo consultadas
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 Object[] fila = new Object[cantidadColumnas];
 
 while (rs.next()) {
     
    fila[0]=rs.getObject(0+1);
    nombrePa=rs.getString(1+1);
    nombreDoc=rs.getString(2+1);
    fila[3]=rs.getObject(3+1);
    fila[4]=rs.getObject(4+1);
    stmt1=con.createStatement();
            rs1=stmt1.executeQuery("select nom_paciente from Pacientes where cod_paciente='"+nombrePa+"'");
            while (rs1.next()) {
    fila[1]=rs1.getObject(0+1);
    }
            stmt2=con.createStatement();
            rs2=stmt2.executeQuery("select nom_doctor from Doctores where cod_doctor='"+nombreDoc+"'");
             while (rs2.next()) {
    fila[2]=rs2.getObject(0+1); 
             }
    modelo.addRow(fila);

 }
 
           
      
    
             
  
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    }//GEN-LAST:event_button16ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
         String nombreDoc=textField1.getText();
         String codigoDoc=textField7.getText(); 
          String nombrePa;
         boolean ban1=true,ban2=true;
         int i=0;
         Connection con=null;
         Statement stmt=null;
         Statement stmt1=null;
         Statement stmt2=null;
         ResultSet rs=null;
         ResultSet rs1=null;
         ResultSet rs2=null;
     if(nombreDoc.equals("")||nombreDoc.equals("Ingrese Nombre")){   
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Citas where cod_doctor='"+codigoDoc+"'");
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 Object[] fila = new Object[cantidadColumnas];
 
 while (rs.next()) {
     
    fila[0]=rs.getObject(0+1);
    nombrePa=rs.getString(1+1);
    nombreDoc=rs.getString(2+1);
    fila[3]=rs.getObject(3+1);
    fila[4]=rs.getObject(4+1);
    stmt1=con.createStatement();
            rs1=stmt1.executeQuery("select nom_paciente from Pacientes where cod_paciente='"+nombrePa+"'");
            while (rs1.next()) {
    fila[1]=rs1.getObject(0+1);
    }
            stmt2=con.createStatement();
            rs2=stmt2.executeQuery("select nom_doctor from Doctores where cod_doctor='"+nombreDoc+"'");
             while (rs2.next()) {
    fila[2]=rs2.getObject(0+1); 
             }
    modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
     textField1.setText("Ingrese Nombre");
     textField7.setText("Ingrese Codigo");
     }else{
         try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
  stmt=con.createStatement();
            rs=stmt.executeQuery("select cod_doctor from Doctores where nom_doctor='"+nombreDoc+"'");
 
 while (rs.next()) {
     
    codigoDoc=rs.getString(1);
 }
 
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Citas where cod_doctor='"+codigoDoc+"'");
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 Object[] fila = new Object[cantidadColumnas];
 
 while (rs.next()) {
     
    fila[0]=rs.getObject(0+1);
    nombrePa=rs.getString(1+1);
    nombreDoc=rs.getString(2+1);
    fila[3]=rs.getObject(3+1);
    fila[4]=rs.getObject(4+1);
    stmt1=con.createStatement();
            rs1=stmt1.executeQuery("select nom_paciente from Pacientes where cod_paciente='"+nombrePa+"'");
            while (rs1.next()) {
    fila[1]=rs1.getObject(0+1);
    }
            stmt2=con.createStatement();
            rs2=stmt2.executeQuery("select nom_doctor from Doctores where cod_doctor='"+nombreDoc+"'");
             while (rs2.next()) {
    fila[2]=rs2.getObject(0+1); 
             }
    modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
     textField1.setText("Ingrese Nombre");
     textField7.setText("Ingrese Codigo");
     }
    }//GEN-LAST:event_button13ActionPerformed

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
        String nombrePa=textField4.getText();
         String codigoPa=textField9.getText(); 
          String nombreDoc;
         boolean ban1=true,ban2=true;
         int i=0;
         Connection con=null;
         Statement stmt=null;
         Statement stmt1=null;
         Statement stmt2=null;
         ResultSet rs=null;
         ResultSet rs1=null;
         ResultSet rs2=null;
     if(nombrePa.equals("")||nombrePa.equals("Ingrese Nombre")){   
     try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Citas where cod_doctor='"+codigoPa+"'");
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 Object[] fila = new Object[cantidadColumnas];
 
 while (rs.next()) {
     
    fila[0]=rs.getObject(0+1);
    nombrePa=rs.getString(1+1);
    nombreDoc=rs.getString(2+1);
    fila[3]=rs.getObject(3+1);
    fila[4]=rs.getObject(4+1);
    stmt1=con.createStatement();
            rs1=stmt1.executeQuery("select nom_paciente from Pacientes where cod_paciente='"+nombrePa+"'");
            while (rs1.next()) {
    fila[1]=rs1.getObject(0+1);
    }
            stmt2=con.createStatement();
            rs2=stmt2.executeQuery("select nom_doctor from Doctores where cod_doctor='"+nombreDoc+"'");
             while (rs2.next()) {
    fila[2]=rs2.getObject(0+1); 
             }
    modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
     textField4.setText("Ingrese Nombre");
     textField9.setText("Ingrese Codigo");
     }else{
         try {
 //Para establecer el modelo al JTable
         DefaultTableModel modelo = new DefaultTableModel();
         this.jTable1.setModel(modelo);
 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
  stmt=con.createStatement();
            rs=stmt.executeQuery("select cod_paciente from Pacientes where nom_paciente='"+nombrePa+"'");
 
 while (rs.next()) {
    codigoPa=rs.getString(1);
 }

 stmt=con.createStatement();
            rs=stmt.executeQuery("select * from Citas where cod_paciente='"+codigoPa+"'");
 ResultSetMetaData rsMd = rs.getMetaData();
 //La cantidad de columnas que tiene la consulta
 int cantidadColumnas = rsMd.getColumnCount();
 //Establecer como cabezeras el nombre de las colimnas
 for (i = 1; i <= cantidadColumnas; i++) {
  modelo.addColumn(rsMd.getColumnLabel(i));
 }
 //Creando las filas para el JTable
 Object[] fila = new Object[cantidadColumnas];
 
 while (rs.next()) {
     
    fila[0]=rs.getObject(0+1);
    nombrePa=rs.getString(1+1);
    nombreDoc=rs.getString(2+1);
    fila[3]=rs.getObject(3+1);
    fila[4]=rs.getObject(4+1);
    stmt1=con.createStatement();
            rs1=stmt1.executeQuery("select nom_paciente from Pacientes where cod_paciente='"+nombrePa+"'");
            while (rs1.next()) {
    fila[1]=rs1.getObject(0+1);
    }
            stmt2=con.createStatement();
            rs2=stmt2.executeQuery("select nom_doctor from Doctores where cod_doctor='"+nombreDoc+"'");
             while (rs2.next()) {
    fila[2]=rs2.getObject(0+1); 
             }
    modelo.addRow(fila);
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
     textField4.setText("Ingrese Nombre");
     textField9.setText("Ingrese Codigo");
     }
    }//GEN-LAST:event_button14ActionPerformed

    public static String fechaMySQL(JDateChooser miJDate,boolean ban ){
        

if(miJDate.getDate() != null){
    DecimalFormat sdf = new DecimalFormat("00");
int anio = miJDate.getCalendar().get(Calendar. YEAR);
int mes = miJDate.getCalendar().get(Calendar. MONTH) + 1;
int dia = miJDate.getCalendar().get(Calendar. DAY_OF_MONTH);

return anio+"/"+sdf.format(mes)+"/"+sdf.format(dia);
}else
    return null;
} 
    public void nombrePac(){
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
       choice1.addItem("Nombre Paciente");
     try {

 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select nom_paciente from pacientes");
          

 while (rs.next()) {
  String tmpStrObtenido = rs.getString("nom_paciente");
  choice1.addItem(tmpStrObtenido);
  
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    
    }
    public void nombreDoc(){
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
       choice2.addItem("Nombre Doctor");
     try {

 //Para conectarnos a nuestra base de datos
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
 //Para ejecutar la consulta
 //Ejecutamos la consulta que escribimos en la caja de texto
 //y los datos lo almacenamos en un ResultSet
 stmt=con.createStatement();
            rs=stmt.executeQuery("select nom_doctor from doctores");
          

 while (rs.next()) {
  String tmpStrObtenido = rs.getString("nom_doctor");
  choice2.addItem(tmpStrObtenido);
  
 }
 rs.close();
 con.close();
} catch (Exception ex) {
 ex.printStackTrace();
}
    
    }
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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private javax.swing.JComboBox<String> choice1;
    private javax.swing.JComboBox<String> choice2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.TextField textField1;
    private java.awt.TextField textField10;
    private java.awt.TextField textField11;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    private java.awt.TextField textField9;
    // End of variables declaration//GEN-END:variables
}
