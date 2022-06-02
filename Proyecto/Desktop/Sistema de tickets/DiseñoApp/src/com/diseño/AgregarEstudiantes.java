
package com.diseño;

import com.conexion.Connections;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class AgregarEstudiantes extends javax.swing.JFrame {

    public AgregarEstudiantes() {
        initComponents();
        AgregarEstudiantes.agregarFacultad(comboFacultad);
        AgregarEstudiantes.agregarPrograma(comboFacultad, comboPrograma);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreEstudiante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        identificacionEstudiante = new javax.swing.JTextField();
        apellidoEstudiante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contraseñaEstudiante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboFacultad = new javax.swing.JComboBox<>();
        comboPrograma = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnAgregarEstudiante = new javax.swing.JButton();
        btregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEstudiante.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        nombreEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(nombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, -1));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel2.setText("Identificación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        identificacionEstudiante.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        identificacionEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identificacionEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(identificacionEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 370, -1));

        apellidoEstudiante.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        apellidoEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellidoEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(apellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 170, -1));

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel6.setText("Facultad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        contraseñaEstudiante.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        contraseñaEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseñaEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contraseñaEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(contraseñaEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 380, 30));

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        comboFacultad.setBackground(new java.awt.Color(47, 38, 127));
        comboFacultad.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        comboFacultad.setForeground(new java.awt.Color(255, 255, 255));
        comboFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFacultadActionPerformed(evt);
            }
        });
        getContentPane().add(comboFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 430, 30));

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

        btnAgregarEstudiante.setBackground(new java.awt.Color(191, 13, 13));
        btnAgregarEstudiante.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        btnAgregarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-estudiante.png"))); // NOI18N
        btnAgregarEstudiante.setText("Agregar Estudiante");
        btnAgregarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarEstudianteMouseClicked(evt);
            }
        });
        btnAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 210, 60));

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

    private void nombreEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEstudianteActionPerformed

    }//GEN-LAST:event_nombreEstudianteActionPerformed

    private void apellidoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoEstudianteActionPerformed

    }//GEN-LAST:event_apellidoEstudianteActionPerformed

    private void contraseñaEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaEstudianteActionPerformed

    }//GEN-LAST:event_contraseñaEstudianteActionPerformed

    private void comboFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFacultadActionPerformed
         AgregarEstudiantes.agregarPrograma(comboFacultad, comboPrograma);
    }//GEN-LAST:event_comboFacultadActionPerformed

    private void comboProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProgramaActionPerformed

    }//GEN-LAST:event_comboProgramaActionPerformed

    private void btnAgregarEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEstudianteMouseClicked

    }//GEN-LAST:event_btnAgregarEstudianteMouseClicked

    private void btnAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstudianteActionPerformed
        com.model.Admin admin = new com.model.Admin();
        String mensaje = admin.agregarEstudiante(identificacionEstudiante.getText().toString(), 
                nombreEstudiante.getText().toString(), 
                apellidoEstudiante.getText().toString(), contraseñaEstudiante.getText().toString(), 
                comboFacultad.getSelectedItem().toString(), comboPrograma.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_btnAgregarEstudianteActionPerformed

    private void btregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresarMouseClicked

    }//GEN-LAST:event_btregresarMouseClicked

    private void btregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresarActionPerformed
        MenuAdmin admin1 = new MenuAdmin();
        admin1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btregresarActionPerformed
    static void agregarFacultad (JComboBox comboFacultad){
        comboFacultad.addItem("ciencias economicas, administrativas y contables");
        comboFacultad.addItem("ciencias sociales y humanas");
        comboFacultad.addItem("ingenieria");
    }
    
    private static void agregarPrograma(JComboBox comboFacultad, JComboBox comboPrograma){
          comboPrograma.removeAllItems();
        
        //ArrayList<String> programas = new ArrayList<String>();
        
        Connections con = new Connections();
        
        Statement instruccion = con.conexion();
       
        String texto = comboFacultad.getSelectedItem().toString();
        
        String query = "Select nombre_programa from programa where nombre_facultad = \"%s\";".formatted(texto);
        
        try {
            ResultSet result = instruccion.executeQuery(query);
            
            while (result.next()){
                comboPrograma.addItem(result.getString("nombre_programa"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgregarAsistente.class.getName()).log(Level.SEVERE, null, ex);
        }    
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
    private javax.swing.JTextField apellidoEstudiante;
    private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btregresar;
    private javax.swing.JComboBox<String> comboFacultad;
    private javax.swing.JComboBox<String> comboPrograma;
    private javax.swing.JTextField contraseñaEstudiante;
    private javax.swing.JTextField identificacionEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombreEstudiante;
    // End of variables declaration//GEN-END:variables
}
