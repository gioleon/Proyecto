package com.diseño;

public class MenuAdmin extends javax.swing.JFrame {

  
    public MenuAdmin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarAsistente = new javax.swing.JButton();
        agregarDirector = new javax.swing.JButton();
        listarEstudiante = new javax.swing.JButton();
        btCerrarSesion = new javax.swing.JButton();
        listarPersonal = new javax.swing.JButton();
        agregarEstudiante2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarAsistente.setBackground(new java.awt.Color(47, 38, 127));
        agregarAsistente.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        agregarAsistente.setForeground(new java.awt.Color(255, 255, 255));
        agregarAsistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistente.png"))); // NOI18N
        agregarAsistente.setText("Agregar Asistente");
        agregarAsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAsistenteActionPerformed(evt);
            }
        });
        getContentPane().add(agregarAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 200, 60));

        agregarDirector.setBackground(new java.awt.Color(47, 38, 127));
        agregarDirector.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        agregarDirector.setForeground(new java.awt.Color(255, 255, 255));
        agregarDirector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/director.png"))); // NOI18N
        agregarDirector.setText("Agregar Director");
        agregarDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDirectorActionPerformed(evt);
            }
        });
        getContentPane().add(agregarDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, 60));

        listarEstudiante.setBackground(new java.awt.Color(47, 38, 127));
        listarEstudiante.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        listarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        listarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver-2.png"))); // NOI18N
        listarEstudiante.setText("Listar Estudiantes");
        listarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(listarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 210, 60));

        btCerrarSesion.setBackground(new java.awt.Color(191, 13, 13));
        btCerrarSesion.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        btCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        btCerrarSesion.setText("Cerrar sesión");
        btCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCerrarSesionMouseClicked(evt);
            }
        });
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 200, 60));

        listarPersonal.setBackground(new java.awt.Color(47, 38, 127));
        listarPersonal.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        listarPersonal.setForeground(new java.awt.Color(255, 255, 255));
        listarPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
        listarPersonal.setText("Listar Personal");
        listarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(listarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 210, 60));

        agregarEstudiante2.setBackground(new java.awt.Color(47, 38, 127));
        agregarEstudiante2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        agregarEstudiante2.setForeground(new java.awt.Color(255, 255, 255));
        agregarEstudiante2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudiante.png"))); // NOI18N
        agregarEstudiante2.setText("Agregar Estudiante");
        agregarEstudiante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEstudiante2ActionPerformed(evt);
            }
        });
        getContentPane().add(agregarEstudiante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu-admin-100.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarAsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAsistenteActionPerformed
    AgregarAsistente agregar2 = new AgregarAsistente();
    agregar2.setVisible(true);
    this.dispose();    
    }//GEN-LAST:event_agregarAsistenteActionPerformed

    private void agregarDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDirectorActionPerformed
    AgregarDirector agregar3 = new AgregarDirector();
    agregar3.setVisible(true);
    this.dispose();         
    }//GEN-LAST:event_agregarDirectorActionPerformed

    private void listarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarEstudianteActionPerformed
    ListadoEstudiante listarE = new ListadoEstudiante();
    listarE.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_listarEstudianteActionPerformed

    private void btCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrarSesionMouseClicked

    }//GEN-LAST:event_btCerrarSesionMouseClicked

    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        Login login1 = new Login();
        login1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    private void listarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPersonalActionPerformed
        ListadoPersonal listarP = new ListadoPersonal();
        listarP.setVisible(true);
    }//GEN-LAST:event_listarPersonalActionPerformed

    private void agregarEstudiante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEstudiante2ActionPerformed
        AgregarEstudiantes agregar = new AgregarEstudiantes();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarEstudiante2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarAsistente;
    private javax.swing.JButton agregarDirector;
    private javax.swing.JButton agregarEstudiante2;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton listarEstudiante;
    private javax.swing.JButton listarPersonal;
    // End of variables declaration//GEN-END:variables
}
