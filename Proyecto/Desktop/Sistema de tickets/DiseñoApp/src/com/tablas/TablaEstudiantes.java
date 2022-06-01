
package com.tablas;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class TablaEstudiantes {
    
    
    public void ver_tabla(JTable tablaestudiantes){
        
        tablaestudiantes.setDefaultRenderer(Object.class, new RenderEstu());
         ArrayList<ArrayList> listObj = null; //persona.vermistickets
        
        JButton btnVer = new JButton("Ver");
        btnVer.setName("ver");
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setName("cerrar");
        JButton btnDevolver = new JButton("Devolver");
        btnDevolver.setName("devolver");
        
        
         
        DefaultTableModel d = new DefaultTableModel(
        
         new Object [0][listObj.get(0).size()],
         new Object []{"Asunto","Informacion","Estado","","",""}
         
         )
                
         
        
        
        {
             public boolean isCellEditable(int row, int column){
                 return false;
             }
         };
        
       
        tablaestudiantes.setModel(d);
        tablaestudiantes.setRowHeight(30);
    
        for (int i = 0; i < listObj.get(0).size(); i++) {
            Object[] values = {listObj.get(0).get(i), listObj.get(i).get(i), listObj.get(2).get(i), btnVer,btnCerrar,btnDevolver};
            d.addRow(values);
        }
       
       
    }
    
    
    
}
