
package com.diseño;

import com.conexion.Connections;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class AgregarDirector extends javax.swing.JFrame {


    public AgregarDirector() {
        initComponents();
        AgregarDirector.agregarFacultad(comboFacultad);
        AgregarDirector.agregarPrograma(comboFacultad, comboPrograma);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        identificacionPersonal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombrePersonal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellidoPersonal = new javax.swing.JTextField();
        contraseñaPersonal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboFacultad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        comboPrograma = new javax.swing.JComboBox<>();
        btregresar = new javax.swing.JButton();
        btAgregarDirector = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        identificacionPersonal.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        identificacionPersonal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identificacionPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(identificacionPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 370, -1));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel2.setText("Identificación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        nombrePersonal.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        nombrePersonal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombrePersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombrePersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePersonalActionPerformed(evt);
            }
        });
        getContentPane().add(nombrePersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, -1));

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        apellidoPersonal.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        apellidoPersonal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellidoPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(apellidoPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 170, -1));

        contraseñaPersonal.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        contraseñaPersonal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseñaPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contraseñaPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(contraseñaPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 231, 400, 30));

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel6.setText("Facultad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        comboFacultad.setBackground(new java.awt.Color(47, 38, 127));
        comboFacultad.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        comboFacultad.setForeground(new java.awt.Color(255, 255, 255));
        comboFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFacultadActionPerformed(evt);
            }
        });
        getContentPane().add(comboFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 430, 30));

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel10.setText("Programa");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        comboPrograma.setBackground(new java.awt.Color(47, 38, 127));
        comboPrograma.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        comboPrograma.setForeground(new java.awt.Color(255, 255, 255));
        comboPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProgramaActionPerformed(evt);
            }
        });
        getContentPane().add(comboPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 430, 30));

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

        btAgregarDirector.setBackground(new java.awt.Color(191, 13, 13));
        btAgregarDirector.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        btAgregarDirector.setForeground(new java.awt.Color(255, 255, 255));
        btAgregarDirector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-estudiante.png"))); // NOI18N
        btAgregarDirector.setText("Agregar Director");
        btAgregarDirector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarDirectorMouseClicked(evt);
            }
        });
        btAgregarDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarDirectorActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregarDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 210, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-director_1.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombrePersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePersonalActionPerformed

    }//GEN-LAST:event_nombrePersonalActionPerformed

    private void apellidoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoPersonalActionPerformed

    }//GEN-LAST:event_apellidoPersonalActionPerformed

    private void contraseñaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaPersonalActionPerformed

    }//GEN-LAST:event_contraseñaPersonalActionPerformed

    private void comboFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFacultadActionPerformed
         AgregarDirector.agregarPrograma(comboFacultad, comboPrograma);
    }//GEN-LAST:event_comboFacultadActionPerformed

    private void comboProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProgramaActionPerformed
 
    }//GEN-LAST:event_comboProgramaActionPerformed

    private void btAgregarDirectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarDirectorMouseClicked


    }//GEN-LAST:event_btAgregarDirectorMouseClicked

    private void btAgregarDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarDirectorActionPerformed
        com.model.Admin admin = new com.model.Admin();
        String mensaje = admin.agregarDirector(identificacionPersonal.getText().toString(), 
                nombrePersonal.getText().toString(), 
                apellidoPersonal.getText().toString(), contraseñaPersonal.getText().toString(), 
                comboFacultad.getSelectedItem().toString(), comboPrograma.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_btAgregarDirectorActionPerformed

    private void btregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresarMouseClicked

    }//GEN-LAST:event_btregresarMouseClicked

    private void btregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresarActionPerformed
        MenuAdmin admin1 = new MenuAdmin();
        admin1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btregresarActionPerformed

    private static void agregarFacultad (JComboBox comboFacultad){
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
            java.util.logging.Logger.getLogger(AgregarDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarDirector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoPersonal;
    private javax.swing.JButton btAgregarDirector;
    private javax.swing.JButton btregresar;
    private javax.swing.JComboBox<String> comboFacultad;
    private javax.swing.JComboBox<String> comboPrograma;
    private javax.swing.JTextField contraseñaPersonal;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField identificacionPersonal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombrePersonal;
    // End of variables declaration//GEN-END:variables
}
