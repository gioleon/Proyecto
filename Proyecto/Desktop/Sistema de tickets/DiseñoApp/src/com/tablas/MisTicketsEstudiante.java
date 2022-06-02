package com.tablas;

import com.conexion.Connections;
import com.create_txt.CreateFile;
import com.diseño.MenuEstudiante;
import com.model.Estudiante;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MisTicketsEstudiante extends javax.swing.JFrame {

    TablaEstudiantes te = new TablaEstudiantes();

    DefaultTableModel modelo;

    public MisTicketsEstudiante() {
        initComponents();
        te.ver_tabla(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btregresar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 780, 200));

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
        getContentPane().add(btregresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 210, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mis-tickets-estudiante.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btregresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar1MouseClicked

    }//GEN-LAST:event_btregresar1MouseClicked

    private void btregresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresar1ActionPerformed
        MenuEstudiante estu1 = new MenuEstudiante();
        estu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btregresar1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        int column = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tabla.getRowHeight();

        if (row < tabla.getRowCount() && row >= 0 && column < tabla.getColumnCount() && column >= 0) {
            Object value = tabla.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getName().equals("ver")) {

                    System.out.println(boton.getText());
                }
                if (boton.getName().equals("cerrar")) {
                    Estudiante estudiante = new Estudiante();

                    CreateFile file = new CreateFile();

                    int id_estudiante = 0;

                    Connections con = new Connections();

                    Statement instruccion = con.conexion();

                    String query_id = "SELECT id_estudiante from estudiante where correo_institucional = \"%s\";".formatted(file.readerTxt().get(0));

                    try {
                        ResultSet result = instruccion.executeQuery(query_id);

                        while (result.next()) {
                            id_estudiante = result.getInt("id_estudiante");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(TablaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ArrayList<ArrayList> listObj = estudiante.verTickets(id_estudiante);//persona.vermistickets
                   
                    estudiante.cerrarPeticion(Integer.parseInt(listObj.get(0).get(tabla.getSelectedRow()).toString()));
                    JOptionPane.showMessageDialog(null, "Ticket cerrado");
                    
                    modelo.removeRow(tabla.getSelectedRow());
                    //                  
//                  modelo.setValueAt(, row, column);
//                    tabla.remove(tabla.getSelectedRow());
                }
                if (boton.getName().equals("devolver")) {
                    Estudiante estudiante = new Estudiante();

                    CreateFile file = new CreateFile();

                    int id_estudiante = 0;

                    Connections con = new Connections();

                    Statement instruccion = con.conexion();

                    String query_id = "SELECT id_estudiante from estudiante where correo_institucional = \"%s\";".formatted(file.readerTxt().get(0));

                    try {
                        ResultSet result = instruccion.executeQuery(query_id);

                        while (result.next()) {
                            id_estudiante = result.getInt("id_estudiante");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(TablaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ArrayList<ArrayList> listObj = estudiante.verTickets(id_estudiante);//persona.vermistickets
                    
                    String asunto = "";
                    estudiante.devolverPeticion(Integer.parseInt(listObj.get(0).get(tabla.getSelectedRow()).toString()), asunto);
                    JOptionPane.showMessageDialog(null, "Solucion devuelta");
                    System.out.println(tabla.getSelectedRow());
                }

            }
        }

    }//GEN-LAST:event_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(MisTicketsEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisTicketsEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisTicketsEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisTicketsEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisTicketsEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btregresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
