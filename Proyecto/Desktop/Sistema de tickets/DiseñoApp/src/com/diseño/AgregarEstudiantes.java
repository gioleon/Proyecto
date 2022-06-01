
package com.diseño;

import javax.swing.JComboBox;


public class AgregarEstudiantes extends javax.swing.JFrame {

    public AgregarEstudiantes() {
        initComponents();
        AgregarEstudiantes.agregarFacultad(comboFacultad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboFacultad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboPrograma = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btAgregarEstudiante = new javax.swing.JButton();
        btregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, -1));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel2.setText("Identificación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        txtIdentificacion.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        txtIdentificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdentificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 370, -1));

        txtApellido.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 170, -1));

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel6.setText("Facultad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 170, -1));

        txtContrasena.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 170, -1));

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        comboFacultad.setBackground(new java.awt.Color(47, 38, 127));
        comboFacultad.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        comboFacultad.setForeground(new java.awt.Color(255, 255, 255));
        comboFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFacultadActionPerformed(evt);
            }
        });
        getContentPane().add(comboFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 430, 30));

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel8.setText("Correo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        comboPrograma.setBackground(new java.awt.Color(47, 38, 127));
        comboPrograma.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        comboPrograma.setForeground(new java.awt.Color(255, 255, 255));
        comboPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProgramaActionPerformed(evt);
            }
        });
        getContentPane().add(comboPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 430, 30));

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel10.setText("Programa");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        btAgregarEstudiante.setBackground(new java.awt.Color(191, 13, 13));
        btAgregarEstudiante.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        btAgregarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btAgregarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-estudiante.png"))); // NOI18N
        btAgregarEstudiante.setText("Agregar Estudiante");
        btAgregarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarEstudianteMouseClicked(evt);
            }
        });
        btAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 210, 60));

        btregresar.setBackground(new java.awt.Color(191, 13, 13));
        btregresar.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        btregresar.setForeground(new java.awt.Color(255, 255, 255));
        btregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        btregresar.setText("Regresar al menú");
        btregresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresarMouseClicked(evt);
            }
        });
        btregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 210, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-estudiante_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed

    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed

    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed

    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void comboFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFacultadActionPerformed
         
    }//GEN-LAST:event_comboFacultadActionPerformed

    private void comboProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProgramaActionPerformed

    }//GEN-LAST:event_comboProgramaActionPerformed

    private void btAgregarEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarEstudianteMouseClicked

    }//GEN-LAST:event_btAgregarEstudianteMouseClicked

    private void btAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarEstudianteActionPerformed

    }//GEN-LAST:event_btAgregarEstudianteActionPerformed

    private void btregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresarMouseClicked

    }//GEN-LAST:event_btregresarMouseClicked

    private void btregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresarActionPerformed
        MenuAdmin admin1 = new MenuAdmin();
        admin1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btregresarActionPerformed
    static void agregarFacultad (JComboBox comboFacultad){
        comboFacultad.addItem("ciencias ecocomicas, administrativas y contables");
        comboFacultad.addItem("ciencias sociales y humanas");
        comboFacultad.addItem("ingenieria");
    }
    
    private void agregarPrograma(JComboBox comboFacultad, JComboBox comboPrograma){
        String texto = comboFacultad.getSelectedItem().toString();
        String query = "Select¨Programa from programa where Facultad = %s".formatted(texto);    
    }
    
    
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
            java.util.logging.Logger.getLogger(AgregarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarEstudiante;
    private javax.swing.JButton btregresar;
    private javax.swing.JComboBox<String> comboFacultad;
    private javax.swing.JComboBox<String> comboPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
