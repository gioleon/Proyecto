package com.diseño;

import com.conexion.Connections;
import com.model.Admin;
import com.model.Asistente;
import com.model.Estudiante;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListadoEstudiante extends javax.swing.JFrame {

    DefaultTableModel estructura;

    public ListadoEstudiante() {
        initComponents();
        estructura = new DefaultTableModel();
        estructura.addColumn("Id estudiante");
        estructura.addColumn("Nombres");
        estructura.addColumn("Apellidos");
        this.tabla.setModel(estructura);

        ArrayList<ArrayList> listObj = listarUsuarios();

        //
        for (int i = 0; i < listObj.get(0).size(); i++) {
            Object[] values = {listObj.get(0).get(i), listObj.get(1).get(i), listObj.get(2).get(i)};
            estructura.addRow(values);
        }
    }

    public ArrayList<ArrayList> listarUsuarios() {
        ArrayList<ArrayList> listObj = new ArrayList<ArrayList>();

        ArrayList<Integer> id_estudiantes= new ArrayList<Integer>();
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> apellidos = new ArrayList<String>();

        Connections con = new Connections();

        Statement instruccion = con.conexion();

        String query = "select id_estudiante, nombre, apellido from estudiante where estado = \"activo\";";

        try {
            ResultSet result = instruccion.executeQuery(query);
            while (result.next()) {
                int id_personal = result.getInt("id_estudiante");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");

                id_estudiantes.add(id_personal);
                nombres.add(nombre);
                apellidos.add(apellido);

            }
            listObj.add(id_estudiantes);
            listObj.add(nombres);
            listObj.add(apellidos);

        } catch (SQLException ex) {
            Logger.getLogger(ListadoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listObj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        apellidoEstudiante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        actualizarDirector = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        eliminarDirector = new javax.swing.JButton();
        btregresar = new javax.swing.JButton();
        idEstudiante = new javax.swing.JTextField();
        nombreEstudiante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Tickets - Editar Director");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        apellidoEstudiante.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        apellidoEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellidoEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(apellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 240, 40));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 740, 140));

        actualizarDirector.setBackground(new java.awt.Color(47, 38, 127));
        actualizarDirector.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        actualizarDirector.setForeground(new java.awt.Color(255, 255, 255));
        actualizarDirector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crear.png"))); // NOI18N
        actualizarDirector.setText("Actualizar");
        actualizarDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDirectorActionPerformed(evt);
            }
        });
        getContentPane().add(actualizarDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 210, 60));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel3.setText("Id Estudiante");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 80, 30));

        eliminarDirector.setBackground(new java.awt.Color(191, 13, 13));
        eliminarDirector.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        eliminarDirector.setForeground(new java.awt.Color(255, 255, 255));
        eliminarDirector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        eliminarDirector.setText("Eliminar");
        eliminarDirector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarDirectorMouseClicked(evt);
            }
        });
        eliminarDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDirectorActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 200, 60));

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
        getContentPane().add(btregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 210, 60));

        idEstudiante.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        idEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(idEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 220, 40));

        nombreEstudiante.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        nombreEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(nombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, 40));

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar-estudiante.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoEstudianteActionPerformed

    }//GEN-LAST:event_apellidoEstudianteActionPerformed

    public ArrayList<Object> getValues() {

        ArrayList<Object> values = new ArrayList<Object>();
        int fila = tabla.getSelectedRow();

        int id_personales = 0;
        String nombre = "";
        String apellido = "";
        String contraseña = "";
        if (fila != -1) {
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                if (i == 0) {
                    id_personales = Integer.parseInt(tabla.getValueAt(fila, i).toString());
                }

                if (i == 1) {
                    nombre = tabla.getValueAt(fila, i).toString();
                    

                }
                if (i == 2) {
                    apellido = tabla.getValueAt(fila, i).toString();
                    
                }

            }
            id_personales = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            if (!nombreEstudiante.getText().isEmpty()) {
                nombre = nombreEstudiante.getText();
            }
            if (!apellidoEstudiante.getText().isEmpty()) {
                apellido = apellidoEstudiante.getText();
            }
        }

        values.add(id_personales);
        values.add(nombre);
        values.add(apellido);
        return values;
    }
    private void actualizarDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDirectorActionPerformed

        ArrayList<Object> values = getValues();
        
        
        Estudiante estudiante = new Estudiante();
        
        if ((nombreEstudiante.getText().isEmpty()) && (apellidoEstudiante.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "LLene los campos de nombre y apellido");
        } else {
            estudiante.actualizarEstudiante(Integer.parseInt(idEstudiante.getText()), nombreEstudiante.getText(), apellidoEstudiante.getText());
            JOptionPane.showMessageDialog(null, "Personal actualizado");
        }
        
//        
        for (int i = tabla.getRowCount() - 1; i >= 0; i--) {
            estructura.removeRow(i);
        }
        
        ArrayList<ArrayList> listObj = listarUsuarios();

        //
        for (int i = 0; i < listObj.get(0).size(); i++) {
            if (listObj.get(0).get(i).toString().equals("0")){
                
            } else {
                Object[] new_values = {listObj.get(0).get(i), listObj.get(1).get(i), listObj.get(2).get(i)};
            estructura.addRow(new_values);
            }
            
        }

        

        


    }//GEN-LAST:event_actualizarDirectorActionPerformed

    private void eliminarDirectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarDirectorMouseClicked
        
    }//GEN-LAST:event_eliminarDirectorMouseClicked

    private void eliminarDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDirectorActionPerformed
        Estudiante estudiante = new Estudiante();
        
        int fila = tabla.getSelectedRow();
        if (fila != -1) {
            estructura.removeRow(fila);
            estudiante.eliminarEstudiante(Integer.parseInt(idEstudiante.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante inactivo");
        }

    }//GEN-LAST:event_eliminarDirectorActionPerformed

    private void btregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresarMouseClicked

    }//GEN-LAST:event_btregresarMouseClicked

    private void btregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresarActionPerformed
        MenuAdmin admin1 = new MenuAdmin();
        admin1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btregresarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
         int fila = tabla.getSelectedRow();

        if (fila != -1) {
            
            idEstudiante.setText(tabla.getValueAt(fila, 0).toString());
            nombreEstudiante.setText("");
            apellidoEstudiante.setText("");
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void idEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEstudianteActionPerformed

    private void nombreEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEstudianteActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
   
       
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarDirector;
    private javax.swing.JTextField apellidoEstudiante;
    private javax.swing.JButton btregresar;
    private javax.swing.JButton eliminarDirector;
    private javax.swing.JTextField idEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreEstudiante;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
