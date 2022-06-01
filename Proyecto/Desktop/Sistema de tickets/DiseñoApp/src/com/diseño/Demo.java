
package com.diseño;

public class Demo extends javax.swing.JFrame {

    public Demo() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        demoAsistente = new javax.swing.JButton();
        demoAdmin = new javax.swing.JButton();
        demoEstudiante = new javax.swing.JButton();
        demoDirector = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        demoAsistente.setBackground(new java.awt.Color(204, 0, 0));
        demoAsistente.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        demoAsistente.setForeground(new java.awt.Color(255, 255, 255));
        demoAsistente.setText("Demo Asistente");
        demoAsistente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                demoAsistenteMouseClicked(evt);
            }
        });
        demoAsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoAsistenteActionPerformed(evt);
            }
        });
        getContentPane().add(demoAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 170, 40));

        demoAdmin.setBackground(new java.awt.Color(204, 0, 0));
        demoAdmin.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        demoAdmin.setForeground(new java.awt.Color(255, 255, 255));
        demoAdmin.setText("Demo Admin");
        demoAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                demoAdminMouseClicked(evt);
            }
        });
        demoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoAdminActionPerformed(evt);
            }
        });
        getContentPane().add(demoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 170, 40));

        demoEstudiante.setBackground(new java.awt.Color(204, 0, 0));
        demoEstudiante.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        demoEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        demoEstudiante.setText("Demo Estudiante");
        demoEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                demoEstudianteMouseClicked(evt);
            }
        });
        demoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(demoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 170, 40));

        demoDirector.setBackground(new java.awt.Color(204, 0, 0));
        demoDirector.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        demoDirector.setForeground(new java.awt.Color(255, 255, 255));
        demoDirector.setText("Demo Director");
        demoDirector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                demoDirectorMouseClicked(evt);
            }
        });
        demoDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoDirectorActionPerformed(evt);
            }
        });
        getContentPane().add(demoDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-demo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void demoAsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoAsistenteActionPerformed
        
    }//GEN-LAST:event_demoAsistenteActionPerformed

    private void demoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoAdminActionPerformed
        
    }//GEN-LAST:event_demoAdminActionPerformed

    private void demoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoEstudianteActionPerformed
        
    }//GEN-LAST:event_demoEstudianteActionPerformed

    private void demoDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoDirectorActionPerformed
        
    }//GEN-LAST:event_demoDirectorActionPerformed

    private void demoAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demoAdminMouseClicked
    MenuAdmin admin1 = new MenuAdmin();
    admin1.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_demoAdminMouseClicked

    private void demoEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demoEstudianteMouseClicked
    MenuEstudiante estu1 = new MenuEstudiante();
    estu1.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_demoEstudianteMouseClicked

    private void demoDirectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demoDirectorMouseClicked
    MenuDirector directo1 = new MenuDirector();
    directo1.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_demoDirectorMouseClicked

    private void demoAsistenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demoAsistenteMouseClicked
    MenuAsistente asis1 = new MenuAsistente();
    asis1.setVisible(true);
    this.dispose();        
    }//GEN-LAST:event_demoAsistenteMouseClicked

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
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton demoAdmin;
    private javax.swing.JButton demoAsistente;
    private javax.swing.JButton demoDirector;
    private javax.swing.JButton demoEstudiante;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
