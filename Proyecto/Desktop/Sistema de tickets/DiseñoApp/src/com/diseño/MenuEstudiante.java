
package com.diseño;

import com.tablas.MisTicketsEstudiante;

public class MenuEstudiante extends javax.swing.JFrame {

    public MenuEstudiante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCrearTicket = new javax.swing.JButton();
        btVerTickets = new javax.swing.JButton();
        btCerrarSesion = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCrearTicket.setBackground(new java.awt.Color(47, 38, 127));
        btCrearTicket.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btCrearTicket.setForeground(new java.awt.Color(255, 255, 255));
        btCrearTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crear.png"))); // NOI18N
        btCrearTicket.setText("Crear Ticket");
        btCrearTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearTicketActionPerformed(evt);
            }
        });
        getContentPane().add(btCrearTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 60));

        btVerTickets.setBackground(new java.awt.Color(47, 38, 127));
        btVerTickets.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btVerTickets.setForeground(new java.awt.Color(255, 255, 255));
        btVerTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver-2.png"))); // NOI18N
        btVerTickets.setText("Ver Mis Tickets");
        btVerTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerTicketsActionPerformed(evt);
            }
        });
        getContentPane().add(btVerTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 200, 60));

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
        getContentPane().add(btCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 200, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu-estudiante-100.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearTicketActionPerformed
        CrearTicket crear1 = new CrearTicket ();
        crear1.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btCrearTicketActionPerformed

    private void btVerTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerTicketsActionPerformed
        MisTicketsEstudiante ticket1 = new MisTicketsEstudiante ();
        ticket1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVerTicketsActionPerformed

    private void btCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrarSesionMouseClicked

    }//GEN-LAST:event_btCerrarSesionMouseClicked

    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        Login login1 = new Login();
        login1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.orbtCrearTicketvase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btCrearTicket;
    private javax.swing.JButton btVerTickets;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
