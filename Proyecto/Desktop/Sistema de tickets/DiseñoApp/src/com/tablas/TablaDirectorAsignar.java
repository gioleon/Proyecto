
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

public class TablaDirectorAsignar {
    
    
    public void ver_tabla(JTable tablaDirector){
        
        Director director = new Director();
        
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
            Logger.getLogger(TablaDirectorAsignar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
        
        
        
        
        tablaDirector.setDefaultRenderer(Object.class, new RenderAsisAsignar());
        
        ArrayList<ArrayList> listObj = director.listaAsignarTickets();//persona.vermistickets
        
        
        String[] names = {"No disponible", "No disponible", "No disponible"};
        int[] id_personales = {0, 0, 0};
        
        for (int i = 0; i < listObj.get(2).size(); i++) {
            names[i] = listObj.get(2).get(i).toString();
        }
        
        for (int i = 0; i < listObj.get(3).size(); i++) {
            id_personales[i] = (int) listObj.get(3).get(i);
        }
        
        JButton btn1 = new JButton(names[0]);
        btn1.setName(Integer.toString(id_personales[0]));
        JButton btn2 = new JButton(names[1]);
        btn2.setName(Integer.toString(id_personales[1]));
        JButton btn3 = new JButton(names[2]);
        btn3.setName(Integer.toString(id_personales[2]));
        
//        JButton btnCerrar = new JButton("Cerrar");
//        btnCerrar.setName("cerrar");      
        
        DefaultTableModel d = new DefaultTableModel(
        
         new Object [0][listObj.get(0).size()],
         new Object []{"Id peticion","Asunto", "", "", ""}
         
         )
                
         
        
        
        {
             public boolean isCellEditable(int row, int column){
                 return false;
             }
         };
        
        
        tablaDirector.setModel(d);
        tablaDirector.setRowHeight(30);
    
        for (int i = 0; i < listObj.get(0).size(); i++) {
            Object[] values = {listObj.get(0).get(i), listObj.get(1).get(i), btn1, btn2, btn3};
            d.addRow(values);
        }
        
        
        //System.out.println(listObj.get(0).get(0));
       
       
    }
    
    
    
}
