
/**
 *
 * @author GilG
 */
public class Menu extends javax.swing.JFrame {

    //Aqui se ponen los derechos de cada Usuario
    public Menu() {
        initComponents();
        if(Logeo.depen.equals("Doctor")){
            jButtonCitas.setEnabled(true);
            jButtonPacientes.setEnabled(true);
            jButtonMedicinas.setEnabled(false);
            jButtonDoctores.setEnabled(false);
            jButtonPersonal.setEnabled(false);
            jButtonAlma.setEnabled(false);
        }
        else if(Logeo.depen.equals("Farmacia")){
            jButtonCitas.setEnabled(false);
            jButtonPacientes.setEnabled(false);
            jButtonMedicinas.setEnabled(true);
            jButtonDoctores.setEnabled(false);
            jButtonPersonal.setEnabled(false);
            jButtonAlma.setEnabled(true);
        }
        else if (Logeo.depen.equals("root")){
            jButtonCitas.setEnabled(true);
            jButtonPacientes.setEnabled(true);
            jButtonMedicinas.setEnabled(true);
            jButtonDoctores.setEnabled(true);
            jButtonPersonal.setEnabled(true);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCitas = new javax.swing.JButton();
        jButtonPacientes = new javax.swing.JButton();
        jButtonMedicinas = new javax.swing.JButton();
        jButtonDoctores = new javax.swing.JButton();
        jButtonPersonal = new javax.swing.JButton();
        jButtonAlma = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCitas.setBackground(new java.awt.Color(0, 204, 153));
        jButtonCitas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCitas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCitas.setText("Citas");
        jButtonCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCitasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 70));

        jButtonPacientes.setBackground(new java.awt.Color(0, 204, 153));
        jButtonPacientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPacientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPacientes.setText("Pacientes");
        jButtonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 70));

        jButtonMedicinas.setBackground(new java.awt.Color(0, 204, 153));
        jButtonMedicinas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonMedicinas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMedicinas.setText("Medicinas");
        jButtonMedicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicinasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMedicinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 70));

        jButtonDoctores.setBackground(new java.awt.Color(0, 204, 153));
        jButtonDoctores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDoctores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDoctores.setText("Doctores");
        jButtonDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoctoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 130, 70));

        jButtonPersonal.setBackground(new java.awt.Color(0, 204, 153));
        jButtonPersonal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPersonal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPersonal.setText("Personal");
        jButtonPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, 70));

        jButtonAlma.setBackground(new java.awt.Color(0, 204, 153));
        jButtonAlma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAlma.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlma.setText("Almacen");
        jButtonAlma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlmaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 130, 70));

        jButtonSalir.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCitasActionPerformed
        new Citas().setVisible(true);
    }//GEN-LAST:event_jButtonCitasActionPerformed

    private void jButtonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacientesActionPerformed
        new Pacientes().setVisible(true);
    }//GEN-LAST:event_jButtonPacientesActionPerformed

    private void jButtonMedicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicinasActionPerformed
        new Medicamentos().setVisible(true);
    }//GEN-LAST:event_jButtonMedicinasActionPerformed

    private void jButtonDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoctoresActionPerformed
        new Doctores().setVisible(true);
    }//GEN-LAST:event_jButtonDoctoresActionPerformed

    private void jButtonPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPersonalActionPerformed
       new Personal().setVisible(true);
    }//GEN-LAST:event_jButtonPersonalActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
        new Logeo().setVisible(true);
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlmaActionPerformed
        new Almacen().setVisible(true);
    }//GEN-LAST:event_jButtonAlmaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlma;
    private javax.swing.JButton jButtonCitas;
    private javax.swing.JButton jButtonDoctores;
    private javax.swing.JButton jButtonMedicinas;
    private javax.swing.JButton jButtonPacientes;
    private javax.swing.JButton jButtonPersonal;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
