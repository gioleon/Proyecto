
package com.tablas;

import com.conexion.Connections;
import com.create_txt.CreateFile;
import com.model.*;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TablaEstudiantes {
    
    
    public void ver_tabla(JTable tablaestudiantes){
        
        Estudiante estudiante = new Estudiante();
        
        CreateFile file = new CreateFile();

        int id_estudiante = 0;
        
        Connections con = new Connections();
        
        Statement instruccion = con.conexion();
        
        String query_id = "SELECT id_estudiante from estudiante where correo_institucional = \"%s\";".formatted(file.readerTxt().get(0));
        
        try {
            ResultSet result = instruccion.executeQuery(query_id);
            
            while (result.next()){
               id_estudiante = result.getInt("id_estudiante");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        tablaestudiantes.setDefaultRenderer(Object.class, new RenderEstu());
        
        ArrayList<ArrayList> listObj = estudiante.verTickets(id_estudiante);//persona.vermistickets
        
        JButton btnVer = new JButton("Ver");
        btnVer.setName("ver");
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setName("cerrar");
        JButton btnDevolver = new JButton("Devolver");
        btnDevolver.setName("devolver");
        
        
         
        DefaultTableModel d = new DefaultTableModel(
        
         new Object [0][listObj.get(0).size()],
         new Object []{"id_peticion","Asunto","Informacon","Estado", "", "", ""}
         
         )
                
         
        
        
        {
             public boolean isCellEditable(int row, int column){
                 return false;
             }
         };
        
        
        tablaestudiantes.setModel(d);
        tablaestudiantes.setRowHeight(30);
    
        for (int i = 0; i < listObj.get(0).size(); i++) {
            if(listObj.get(3).get(i).equals("enviado")){
                 Object[] values = {listObj.get(0).get(i), listObj.get(1).get(i), listObj.get(2).get(i),listObj.get(3).get(i), btnVer,btnCerrar,btnDevolver};
            d.addRow(values);
            } else {
                 Object[] values = {listObj.get(0).get(i), listObj.get(1).get(i), listObj.get(2).get(i),listObj.get(3).get(i)};
                d.addRow(values);
            }
           
        }
        
       
       
       
    }
    
    
    
}
