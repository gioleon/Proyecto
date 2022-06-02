
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

public class TablaAsistentes {
    
    
    public void ver_tabla(JTable tablaAsistente){
        
        Asistente asistente = new Asistente();
        
        CreateFile file = new CreateFile();

        int id_personal = 0;
        
        Connections con = new Connections();
        
        Statement instruccion = con.conexion();
        
        String query_id = "SELECT id_personal from personal where correo_institucional = \"%s\";".formatted(file.readerTxt().get(0));
        
        try {
            ResultSet result = instruccion.executeQuery(query_id);
            
            while (result.next()){
               id_personal = result.getInt("id_personal");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablaAsistentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        tablaAsistente.setDefaultRenderer(Object.class, new RenderEstu());
        
        ArrayList<ArrayList> listObj = asistente.verTickets(id_personal);//persona.vermistickets
        
        JButton btnVer = new JButton("Ver");
        btnVer.setName("ver");
//        JButton btnCerrar = new JButton("Cerrar");
//        btnCerrar.setName("cerrar");
        JButton btnSolucionar = new JButton("Solucionar");
        btnSolucionar.setName("solucionar");
        
        
         
        DefaultTableModel d = new DefaultTableModel(
        
         new Object [0][listObj.get(0).size()],
         new Object []{"id_peticion","Asunto","Informacion","Estado", "", ""}
         
         )
                
         
        
        
        {
             public boolean isCellEditable(int row, int column){
                 return false;
             }
         };
        
        
        tablaAsistente.setModel(d);
        tablaAsistente.setRowHeight(30);
    
        for (int i = 0; i < listObj.get(0).size(); i++) {
            if(listObj.get(3).get(i).equals("en progreso")){
                Object[] values = {listObj.get(0).get(i), listObj.get(1).get(i), listObj.get(2).get(i),listObj.get(3).get(i), btnVer,btnSolucionar};
                d.addRow(values);
            } else {
                Object[] values = {listObj.get(0).get(i), listObj.get(1).get(i), listObj.get(2).get(i),listObj.get(3).get(i)};
                d.addRow(values);
            }
            
            
        }
       
       
    }
    
    
    
}
