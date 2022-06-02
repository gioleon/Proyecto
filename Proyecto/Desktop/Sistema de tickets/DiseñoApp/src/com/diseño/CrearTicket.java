
package com.diseño;

import com.conexion.Connections;
import com.create_txt.CreateFile;
import com.model.UserEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class CrearTicket extends javax.swing.JFrame {


    public CrearTicket() {
        initComponents();
        CrearTicket.agregarFacultad(comboFacultad);
        CrearTicket.agregarPrograma(comboFacultad, comboPrograma);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        asuntoTicket = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboFacultad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        comboPrograma = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTicket = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btregresar1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel2.setText("Información");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 120, -1));

        asuntoTicket.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        asuntoTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        asuntoTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(asuntoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 430, 30));

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel6.setText("Facultad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        comboFacultad.setBackground(new java.awt.Color(47, 38, 127));
        comboFacultad.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        comboFacultad.setForeground(new java.awt.Color(255, 255, 255));
        comboFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFacultadActionPerformed(evt);
            }
        });
        getContentPane().add(comboFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 430, 30));

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel10.setText("Programa");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        comboPrograma.setBackground(new java.awt.Color(47, 38, 127));
        comboPrograma.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        comboPrograma.setForeground(new java.awt.Color(255, 255, 255));
        comboPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProgramaActionPerformed(evt);
            }
        });
        getContentPane().add(comboPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 430, 30));

        btnLogin.setBackground(new java.awt.Color(191, 13, 13));
        btnLogin.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crear.png"))); // NOI18N
        btnLogin.setText("Enviar");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 210, 60));

        infoTicket.setColumns(20);
        infoTicket.setRows(5);
        jScrollPane1.setViewportView(infoTicket);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 430, -1));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel3.setText("Asunto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 120, -1));

        btregresar1.setBackground(new java.awt.Color(191, 13, 13));
        btregresar1.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        btregresar1.setForeground(new java.awt.Color(255, 255, 255));
        btregresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        btregresar1.setText("Regresar al menú");
        btregresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar1MouseClicked(evt);
            }
        });
        btregresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregresar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btregresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 210, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-ticket-pantalla.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFacultadActionPerformed
        CrearTicket.agregarPrograma(comboFacultad, comboPrograma);
    }//GEN-LAST:event_comboFacultadActionPerformed

    private void comboProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProgramaActionPerformed
        
    }//GEN-LAST:event_comboProgramaActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked

    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            
            CreateFile file = new CreateFile();
            
            Login log = new Login();
            
            int id_estudiante = 0;
            ArrayList<String> info = file.readerTxt();
            
            Connections con = new Connections();
            
            Statement instruccion = con.conexion();
            
            String query_id = "SELECT id_estudiante from estudiante where correo_institucional = \"%s\";".formatted(info.get(0));
            
            ResultSet result = instruccion.executeQuery(query_id);
            
            while (result.next()){
                id_estudiante = result.getInt("id_estudiante");
            }
            
  
            String query = "CALL insertPeticion(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\");".formatted(id_estudiante, comboFacultad.getSelectedItem(),
                    comboPrograma.getSelectedItem(), asuntoTicket.getText(), infoTicket.getText());
            instruccion.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Ticket generado");
        } catch (SQLException ex) {
            Logger.getLogger(CrearTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btregresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar1MouseClicked

    }//GEN-LAST:event_btregresar1MouseClicked

    private void btregresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresar1ActionPerformed
        MenuEstudiante estu1 = new MenuEstudiante();
        estu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btregresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asuntoTicket;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btregresar1;
    private javax.swing.JComboBox<String> comboFacultad;
    private javax.swing.JComboBox<String> comboPrograma;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextArea infoTicket;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
