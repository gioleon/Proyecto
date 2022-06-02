package com.diseño;

import com.conexion.Connections;
import com.model.Admin;
import com.model.Asistente;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListadoPersonal extends javax.swing.JFrame {

    DefaultTableModel estructura;

    public ListadoPersonal() {
        initComponents();
        estructura = new DefaultTableModel();
        estructura.addColumn("Id personal");
        estructura.addColumn("Nombres");
        estructura.addColumn("Apellidos");
        this.tabla.setModel(estructura);

        ArrayList<ArrayList> listObj = listarUsuarios();

        //
        for (int i = 0; i < listObj.get(0).size(); i++) {
            if (listObj.get(0).get(i).toString().equals("0")){
                
            } else {
                Object[] values = {listObj.get(0).get(i), listObj.get(1).get(i), listObj.get(2).get(i)};
            estructura.addRow(values);
            }
            
        }
    }

    public ArrayList<ArrayList> listarUsuarios() {
        ArrayList<ArrayList> listObj = new ArrayList<ArrayList>();

        ArrayList<Integer> id_personales = new ArrayList<Integer>();
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> apellidos = new ArrayList<String>();

        Connections con = new Connections();

        Statement instruccion = con.conexion();

        String query = "select id_personal, nombre, apellido from personal where estado = \"activo\";";

        try {
            ResultSet result = instruccion.executeQuery(query);
            while (result.next()) {
                int id_personal = result.getInt("id_personal");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");

                id_personales.add(id_personal);
                nombres.add(nombre);
                apellidos.add(apellido);

            }
            listObj.add(id_personales);
            listObj.add(nombres);
            listObj.add(apellidos);

        } catch (SQLException ex) {
            Logger.getLogger(ListadoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listObj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        apellidoPersonal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        actualizarDirector = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        eliminarDirector = new javax.swing.JButton();
        btregresar = new javax.swing.JButton();
        idPersonal = new javax.swing.JTextField();
        nombrePersonal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Tickets - Editar Director");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        apellidoPersonal.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        apellidoPersonal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellidoPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(apellidoPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 240, 40));

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
        jLabel3.setText("Id personal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 80, 30));

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

        idPersonal.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        idPersonal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(idPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 220, 40));

        nombrePersonal.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        nombrePersonal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombrePersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombrePersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePersonalActionPerformed(evt);
            }
        });
        getContentPane().add(nombrePersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, 40));

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar-personal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 11)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoPersonalActionPerformed

    }//GEN-LAST:event_apellidoPersonalActionPerformed

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
            if (!nombrePersonal.getText().isEmpty()) {
                nombre = nombrePersonal.getText().toString();
            }
            if (!apellidoPersonal.getText().isEmpty()) {
                apellido = apellidoPersonal.getText().toString();
            }
        }

        values.add(id_personales);
        values.add(nombre);
        values.add(apellido);
        return values;
    }
    private void actualizarDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDirectorActionPerformed

        ArrayList<Object> values = getValues();
        
        
        Asistente asistente = new Asistente();
        
        if ((nombrePersonal.getText().isEmpty()) && (apellidoPersonal.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "LLene los campos de nombre y apellido");
        } else {
            asistente.actualizarPersonal(Integer.parseInt(idPersonal.getText()), nombrePersonal.getText(), apellidoPersonal.getText());
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
        Asistente asistente = new Asistente();
        
        int fila = tabla.getSelectedRow();
        if (fila != -1) {
            estructura.removeRow(fila);
            asistente.eliminarUsuario(Integer.parseInt(idPersonal.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Personal eliminado");
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
            
            idPersonal.setText(tabla.getValueAt(fila, 0).toString());
            nombrePersonal.setText("");
            apellidoPersonal.setText("");
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void idPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPersonalActionPerformed

    private void nombrePersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePersonalActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
   
       
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarDirector;
    private javax.swing.JTextField apellidoPersonal;
    private javax.swing.JButton btregresar;
    private javax.swing.JButton eliminarDirector;
    private javax.swing.JTextField idPersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombrePersonal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
